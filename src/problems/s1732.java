package problems;

/**
 * Find the Highest Altitude
 */
public class s1732 {
    public int largestAltitude(int[] gain) {
        int max = 0, alt = 0;
        for (int g : gain) {
            alt += g;
            max = Math.max(alt, max);
        }
        return max;
    }
}