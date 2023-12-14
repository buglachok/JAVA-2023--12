package Lab6;

public class Lab6 {
    // Вар. 6: 6,7
    public static void main(String[] args) {
        // task6
        String octalString = "777";
        int result = octStringToInt(octalString);
        System.out.println("Result of task6: " + result);

        // task7
        String sentence = "One1, . two thrEE four: 5five / SIX 7 eight? nine ten !";
        int wordCount = countWords(sentence);
        System.out.println("Word count: " + wordCount);

    }
    // task6
    static int octStringToInt(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Syring is empty or null");
        }

        try {
            int result = 0;
            int power = 0;
            // Перевернув рядок для зручності обробки
            String reversed = new StringBuilder(s).reverse().toString();
            
            for (char digitChar : reversed.toCharArray()) {
                if (digitChar < '0' || digitChar > '7') {
                    throw new IllegalArgumentException("Incorrect octal character: " + digitChar);
                }
                
                int digit = digitChar - '0';
                result += digit * Math.pow(8, power);
                power++;
            }
            
            return result;
        } catch (NumberFormatException e) {
            System.err.println("Exeption: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }
    // task7
    static int countWords(String s) {
        String[] words = s.split("\\s+");

        int count = 0;
        for (String word : words) {
            if (isWord(word)) {
                count++;
            }
        }

        return count;
    }

    static boolean isWord(String s) {
        return s.matches(".*[a-zA-Z0-9].*");
    }
}