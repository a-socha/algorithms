package longesstSubstringWithoutRepeatingCharacters;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        char [] characters = s.toCharArray();
        String ls = "";
        StringBuilder cs = new StringBuilder();
        for(char c : characters) {
            if (cs.toString().contains(String.valueOf(c))) {
                if (cs.length() > ls.length())
                    ls = cs.toString();
                cs = backString(cs, String.valueOf(c));
            }
            cs.append(c);
        }
        if (cs.length() > ls.length())
            ls = cs.toString();
        return ls.length();
    }

    private StringBuilder backString(StringBuilder cs, String s) {
        String c = cs.toString();
        return new StringBuilder(c.substring(cs.indexOf(s) + 1, cs.length()));
    }
}
