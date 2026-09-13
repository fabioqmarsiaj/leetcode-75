package leetcode75.arraystring.p151_reversewordsinastring;

import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        var trimmed = s.trim();
        var split = trimmed.split(" ");

        // creates new array based on the original size entry
        var result = new String[split.length];
        var index = 0;
        // iterate from the last original array entry
        for (int i = split.length; i > 0; i--) {
            // add in the first entry with index
            result[index] = split[i - 1];
            index++;
        }

        // if there's a empty string, filter it
        String[] cleanArray = Arrays.stream(result)
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);


        return String.join(" ", cleanArray);
    }
}
