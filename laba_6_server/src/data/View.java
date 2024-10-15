package data;

/**
 * The {@code View} enum represents various views that a flat can have.
 * It includes predefined constants for different types of views.
 */
public enum View {
    STREET,  // Represents a view of the street
    YARD,    // Represents a view of the yard
    PARK,    // Represents a view of the park
    NORMAL;  // Represents a normal view

    /**
     * Checks if the specified string is a valid constant of the {@code View} enum.
     *
     * @param obj the string to check
     * @return {@code true} if the specified string is a valid constant of the {@code View} enum; {@code false} otherwise
     */
    public static boolean contains(String obj) {
        try {
            View.valueOf(obj.toUpperCase());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
