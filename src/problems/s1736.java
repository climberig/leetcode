package problems;

/**
 * Latest Time by Replacing Hidden Digits
 */
public class s1736 {
    public String maximumTime(String time) {
        char[] t = time.toCharArray();
        if (t[0] == '?')
            t[0] = t[1] < '4' || t[1] == '?' ? '2' : '1';
        if (t[1] == '?')
            t[1] = t[0] == '2' ? '3' : '9';
        if (t[3] == '?')
            t[3] = '5';
        if (t[4] == '?')
            t[4] = '9';
        return new String(t);
    }
}