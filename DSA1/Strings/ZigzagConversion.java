package DSA1.Strings;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static String convertZigzag(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());

        int index = 0, step = 1;
        for (char c : s.toCharArray()) {
            rows.get(index).append(c);
            if (index == 0) step = 1;
            else if (index == numRows - 1) step = -1;
            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);
        return result.toString();
    }

    public static void testZigzagConversion() {
        System.out.println(convertZigzag("PAYPALISHIRING", 3));  // PAHNAPLSIIGYIR
        System.out.println(convertZigzag("PAYPALISHIRING", 4));  // PINALSIGYAHRPI
        System.out.println(convertZigzag("ABC", 1));             // ABC
    }

    public static void main(String[] args) {
        testZigzagConversion();
    }
}


