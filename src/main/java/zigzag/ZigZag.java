package zigzag;

public class ZigZag {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        for (int i = 0; i < s.length(); i++) {
            if ((i) % (numRows + 1) == numRows ) {
                rows[(numRows -1)/ 2] += String.valueOf(s.charAt(i));
            } else {
                rows[i % (numRows + 1)] += String.valueOf(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }
        return result.toString();
    }
}
