public class LogLevels {
    
    public static String message(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");

        // Split by the first occurrence of ": " and return the trimmed message
        return logLine.split("]: ")[1].trim();
    }

    public static String logLevel(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");

        // Extract content between [ and ] and convert to lowercase
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");

        // Combine the message and the level in the required format
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
