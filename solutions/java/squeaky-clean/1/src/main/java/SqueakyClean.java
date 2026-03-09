class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return "";
        }
        
        String result = "";
        boolean nextCharShouldBeUpper = false;
        
        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);
            
            // Handle spaces - replace with underscores
            if (Character.isWhitespace(currentChar)) {
                result += '_';
                continue;
            }
            
            // Handle dashes - convert to camelCase
            if (currentChar == '-') {
                nextCharShouldBeUpper = true;
                continue;
            }
            
            // Convert leetspeak to normal text
            char convertedChar = convertLeetspeak(currentChar);
            
            // Only add letters and underscores
            if (Character.isLetter(convertedChar)) {
                if (nextCharShouldBeUpper) {
                    result += Character.toUpperCase(convertedChar);
                    nextCharShouldBeUpper = false;
                } else {
                    result += convertedChar;
                }
            }
        }
        
        return result;
    }
    
    private static char convertLeetspeak(char c) {
        switch (c) {
            case '4': return 'a';
            case '3': return 'e';
            case '0': return 'o';
            case '1': return 'l';
            case '7': return 't';
            default: return c;
        }
    }
}