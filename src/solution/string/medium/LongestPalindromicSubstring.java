package solution.string.medium;

/*
1. Run a loop 0 to n-1
2. Work on odd and even length
3.     Odd first and second pointer start place, For odd we need to check string mid so both pointer on same place
4.     Even first and second(first+1) pointer even we need to check string two different place with one difference in index
5.           loop for check update low and high with condition low >= 0 and high < length and both index char
6.           check maxlen should less then difference pointer
7.            update low = first + 1  and mxlen = k-j-1
8. return low to low+maxlen substring
 */
public class LongestPalindromicSubstring {
    private int maxLen, low;

    public static void main(String[] args) {
        System.out.println("bab "+new LongestPalindromicSubstring().longestPalindrome("babad"));
        System.out.println("bb "+new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }

    /*

    Example 1:
       Input: s = "babad"
       Output: "bab"
       Explanation: "aba" is also a valid answer.

    Example 2:
       Input: s = "cbbd"
       Output: "bb"

     */

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length()-1; i++) {
            extendPalindrome(i, i, s);
            extendPalindrome(i, i + 1, s);
        }

        return s.substring(low,low+maxLen);
    }

    public void extendPalindrome(int j, int k, String str) {
        while (j >= 0 && k < str.length() && str.charAt(j) == str.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            low = j + 1;
            maxLen = k - j - 1;
        }
    }
}
