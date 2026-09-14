package leetcode75.arraystring.p1071_greatestcommondivisorofstrings;

public class Solution {
    public static int mdcCalculator(int a, int b) {
        while (b != 0) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }

    public static boolean divides(String x, String str) {
        for (int i = 0; i < str.length(); i += x.length()) {
            if (!x.equals(str.substring(i, i + x.length()))) {
                return false;
            }
        }
        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        var sizeStr1 = str1.length();
        var sizeStr2 = str2.length();

        var mdc = mdcCalculator(sizeStr1, sizeStr2);

        var x = str1.substring(0, mdc);

        if (divides(x, str1) && divides(x, str2)) {
            return x;
        } else {
            return "";
        }

    }
}
