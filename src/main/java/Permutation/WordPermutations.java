package Permutation;


import java.util.*;

public class WordPermutations {
    // HashMap to store permutations of words
    private static HashMap<String, List<String>> permutationsMap = new HashMap<>();

    // Function to generate permutations of a given string iteratively
    public static List<String> generatePermutations(String word) {
        List<String> permutations = new ArrayList<>();
        if (word == null || word.length() == 0) {
            return permutations;
        }

        // Start with the first character
        permutations.add(String.valueOf(word.charAt(0)));

        // Process the remaining characters one by one
        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            List<String> newPermutations = new ArrayList<>();

            // Generate new permutations by inserting currentChar into every possible position of existing permutations
            for (String permutation : permutations) {
                for (int j = 0; j <= permutation.length(); j++) {
                    newPermutations.add(permutation.substring(0, j) + currentChar + permutation.substring(j));
                }
            }
            permutations = newPermutations;
        }

        return permutations;
    }

    public static void compareInputs(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length() || (firstWord.equals("") && secondWord.equals("")))
            System.out.println("Fail");
        else {
            char[] firstChar = firstWord.toCharArray();
            char[] secondChar = secondWord.toCharArray();
            Arrays.sort(firstChar);
            Arrays.sort(secondChar);

            if (String.valueOf(firstChar).equals(String.valueOf(secondChar)))
                System.out.println("Pass");
            else System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String inputWord = scanner.nextLine();


        // Check if permutations for the input word are already computed
        // if (!permutationsMap.containsKey(inputWord)) {
        List<String> permutations = generatePermutations(inputWord);
        permutationsMap.put(inputWord, permutations);
        //  }

        // Get permutations from the map and print them
      //  List<String> result = permutationsMap.get(inputWord);
        System.out.println("Permutations of the word \"" + inputWord + "\":");
        for (Map.Entry<String, List<String>> entry : permutationsMap.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            for (String permutation : value) {
                System.out.println(key + " = " + permutation);
            }
        }
        System.out.println("Enter first word");
        String firstInputWord = scanner.nextLine();
        System.out.println("Enter first word");
        String secondInputWord = scanner.nextLine();
        compareInputs(firstInputWord, secondInputWord);
    }

    public static HashMap<String, List<String>> getPermutationsMap() {
        return permutationsMap;
    }
}