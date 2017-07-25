package plaindromenumber;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x / 10 == 0) return true;
        int z = x;
        int rest = 0;
        while (z >= 10) {
            rest *= 10;
            rest += z %10;
            z /= 10;
        }
        return rest == x / 10 && z == x %10;
    }
}
