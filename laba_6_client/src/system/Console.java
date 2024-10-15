package system;

import data.Flat;
import data.generators.FlatGenerator;
import data.generators.IdGenerator;

import java.io.InputStream;
import java.net.SocketException;
import java.util.Scanner;

public class Console {
    private Request request;

    private static String filename;

    public void setFilename(String filename){
        this.filename = filename;
    }

    /**
     *  Метод для запуска
     * @param inputStream входной поток
     * @throws Exception исключение
     */
    public void start(InputStream inputStream) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(inputStream);
            try {
                String[] elements = scanner.nextLine().split(" ");
                String input = elements[0];
                Client client = new Client();
                if (input.equals("add") || input.equals("update")) {
                    if (elements.length == 1 & input.equals("update_id")) {
                        System.out.println("введите аргумент после команды");
                    } else {
                        request = new Request(input, null, null);
                        if (input.equals("add")) {
                            System.out.println("Let's make a Flat!");
                            Flat flat = FlatGenerator.createFlat(IdGenerator.generateid());
                            request.setFlat(flat);
                        }else{
                            String key = elements[1];
                            Flat flat = FlatGenerator.createFlat(0L);
                            request.setFlat(flat);
                            request.setArg(key);
                        }
                        String echo = client.sendEcho(request);
                        System.out.println("Ответ сервера: \n" + echo);
                        client.close();

                    }
                }else if (input.equals("remove") || input.equals("count_greater_than_view") || input.equals("filter_less_than_living_space")) {
                    if (elements.length == 1) {
                        System.out.println("введите аргумент после команды");
                    } else {
                        request = new Request(input, null, null);
                        String key = elements[1];
                        request.setArg(key);
                        String echo = client.sendEcho(request);
                        System.out.println("Ответ сервера: \n" + echo);
                        client.close();
                    }
                }else if (input.equals("exit")) {
                    request = new Request(input);
                    System.out.println("пока пока");
                    System.exit(1);
                }else if (input.equals("execute_script")) {
                if (elements.length == 1) {
                    System.out.println("введите аргумент после команды");
                } else {
                    request = new Request(input, null, null);
                    String key = elements[1];
                    request.setArg(key);
                    String echo = client.sendEcho(request);
                    System.out.println("Ответ сервера: \n" + echo);
                    client.close();
                }
            } else {
                    request = new Request(input);
                    String echo = client.sendEcho(request);
                    System.out.println("Ответ сервера: \n" + echo);
                    client.close();
                }

            } catch(SocketException e){
                System.out.println("SocketException: \n" + e.getMessage());
            }
        }

    }

}
