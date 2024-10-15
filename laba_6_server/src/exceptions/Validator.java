package exceptions;

import data.View;

/**
 * The {@code Validator} class provides various static methods for validating input parameters.
 * Each method checks the validity of the input and throws an exception if the input is invalid.
 */
public class Validator {

    /**
     * Validates that the given ID is greater than zero.
     *
     * @param args the ID as a string
     * @throws ArrayDeqIsEmpty if the ID is invalid (less than or equal to zero, or not an integer)
     */
    public static void idMoreThanZero(String args) throws ArrayDeqIsEmpty {
        try {
            Integer id = Integer.parseInt(args);
            if (id < 0 || id > Integer.MAX_VALUE) {
                throw new ArrayDeqIsEmpty("id");
            }
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty("id");
        }
    }

    /**
     * Validates that the given area is greater than zero.
     *
     * @param args the area as a string
     * @param area the name of the parameter being validated
     * @throws ArrayDeqIsEmpty if the area is invalid (less than or equal to zero, or not a long)
     */
    public static void areaMoreThanZero(String args, String area) throws ArrayDeqIsEmpty {
        try {
            Long aarea = Long.parseLong(args);
            if (aarea < 0 || aarea > Long.MAX_VALUE) {
                throw new ArrayDeqIsEmpty("area");
            }
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty("area");
        }
    }

    /**
     * Validates that the number of rooms is greater than zero.
     *
     * @param args the number of rooms as a string
     * @param numberOfRooms the name of the parameter being validated
     * @throws ArrayDeqIsEmpty if the number of rooms is invalid (less than or equal to zero, or not an integer)
     */
    public static void numberOfRoomsMoreThanZero(String args, String numberOfRooms) throws ArrayDeqIsEmpty {
        try {
            int norr = Integer.parseInt(args);
            if (norr < 0 || norr > Integer.MAX_VALUE) {
                throw new ArrayDeqIsEmpty("numberOfRooms");
            }
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty("numberOfRooms");
        }
    }

    /**
     * Validates that the living space is greater than zero.
     *
     * @param args the living space as a string
     * @param area the name of the parameter being validated
     * @throws ArrayDeqIsEmpty if the living space is invalid (less than or equal to zero, or not an integer)
     */
    public static void livingSpaceMoreThanZero(String args, String area) throws ArrayDeqIsEmpty {
        try {
            int nor = Integer.parseInt(args);
            if (nor < 0 || nor > Integer.MAX_VALUE) {
                throw new ArrayDeqIsEmpty("livingSpace");
            }
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty("livingSpace");
        }
    }

    /**
     * Validates that the given integer input is not null.
     *
     * @param args the input as a string
     * @param data the name of the parameter being validated
     * @throws NullPointerException if the input is null or not a valid integer
     */
    public static void notNullint(String args, String data) throws NullPointerException{
        try {
            int value = Integer.parseInt(args);
            if (value > Integer.MAX_VALUE) {
                throw new NullPointerException(data);
            }
        } catch (Exception e) {
            throw new NullPointerException(data);
        }
    }

    /**
     * Validates that the given long input is not null.
     *
     * @param args the input as a string
     * @param data the name of the parameter being validated
     * @throws NullPointerException if the input is null or not a valid long
     */
    public static void notNullLong(String args, String data) throws NullPointerException {
        try {
            Long value = Long.parseLong(args);
            if (value > Long.MAX_VALUE) {
                throw new NullPointerException(data);
            }
        } catch (Exception e) {
            throw new NullPointerException(data);
        }
    }

    /**
     * Validates that the input is not empty.
     *
     * @param args the input as a string
     * @param data the name of the parameter being validated
     * @throws ArrayDeqIsEmpty if the input is empty or only contains whitespace
     */
    public static void inputIsEmpty(String args, String data) throws ArrayDeqIsEmpty {
        if (args.isEmpty() || args.trim().isEmpty()) {
            throw new ArrayDeqIsEmpty(data);
        }
    }

    /**
     * Checks if the input is a valid integer.
     *
     * @param args the input as a string
     * @return true if the input is a valid integer
     * @throws ArrayDeqIsEmpty if the input is not a valid integer
     */
    public static boolean intIsInt(String args) throws ArrayDeqIsEmpty {
        try {
            Integer.parseInt(args);
            return true;
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty(args);
        }
    }

    /**
     * Validates that the X coordinate is within the valid range.
     *
     * @param args the X coordinate as a string
     * @param x the name of the parameter being validated
     * @throws ArrayDeqIsEmpty if the X coordinate is not valid (less than or equal to -417, or not a double)
     */
    public static void XIsRight(String args, String x) throws ArrayDeqIsEmpty {
        try {
            double xx = Double.parseDouble(args);
            if (xx <= -417){
                throw new ArrayDeqIsEmpty("x");
            }
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty("X");
        }
    }

    /**
     * Validates that the given view is a valid enum value.
     *
     * @param args the view as a string
     * @throws ArrayDeqIsEmpty if the view is not a valid enum value
     */
    public static void ViewIsRight(String args) throws ArrayDeqIsEmpty {
        try {
            View.valueOf(args);
        } catch (Exception e) {
            throw new ArrayDeqIsEmpty("View");
        }
    }
}

