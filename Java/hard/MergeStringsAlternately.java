package hard;
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] merged = new char[word1.length() + word2.length()];
        int i = 0, k = 0, m = 0;

        // Merge characters alternately
        while (i < word1.length() && k < word2.length()) {
            merged[m++] = word1.charAt(i++);
            merged[m++] = word2.charAt(k++);
        }

        // Add remaining characters from word1
        while (i < word1.length()) {
            merged[m++] = word1.charAt(i++);
        }

        // Add remaining characters from word2
        while (k < word2.length()) {
            merged[m++] = word2.charAt(k++);
        }

        // Convert merged char array to String
        return new String(merged);
    }

    public static void main(String[] args) {
        // Example inputs
        String word1 = "abc";
        String word2 = "pqrxyz";

        // Create an instance of Solution
        MergeStringsAlternately solution = new MergeStringsAlternately();

        // Call the mergeAlternately method
        String result = solution.mergeAlternately(word1, word2);

        // Print the result
        System.out.println(result);
    }
}
