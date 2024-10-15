import exceptions.UnknownCommandException;
import managers.CollectionManager;
import managers.CommandManager;
import system.Server;

import java.io.IOException;
import java.net.SocketException;
import java.util.Objects;

public class Main {
    /**
     *  Метод main
     * @param args - аргумент
     * @throws Exception исключение
     */
    public static void main(String[] args) throws Exception {
        CommandManager commandManager = new CommandManager();
        CollectionManager collectionManager = new CollectionManager();
        CollectionManager.loadCollection();
        int port = 8080;
        try {
            Server server = new Server(port);
            server.listen();
        } catch (SocketException e) {
            System.out.println("SocketException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (UnknownCommandException e) {
            throw new RuntimeException(e);
        }
    }
}
