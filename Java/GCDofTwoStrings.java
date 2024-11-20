public class GCDofTwoStrings {
    public String solution(String word1, String word2) {
        int a = Math.max(word1.length(), word2.length());
        int b = Math.min(word1.length(), word2.length());

        if ((word1 + word2).equals(word2 + word1)) {
            int gcd = GCD(a, b);
            return word1.substring(0, gcd);
        }
        return "";
    }

    public Integer GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "AB";
        GCDofTwoStrings gcdsting = new GCDofTwoStrings();

        String result = gcdsting.solution(str1, str2);
        System.out.println(result);
    }
}