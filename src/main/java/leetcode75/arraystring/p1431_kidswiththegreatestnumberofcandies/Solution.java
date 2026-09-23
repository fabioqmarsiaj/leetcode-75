package leetcode75.arraystring.p1431_kidswiththegreatestnumberofcandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // each candies[i] represents how much candy a kid has
        // create a new array to preserve the candies array
        // on the new array sum candies[0] + extraCandies
        // then compare with the rest of candies[i]
        // if it's greater or equal, insert on List Boolean true
        // else false
        // create a List<Boolean>

        List<Boolean> result = new ArrayList<>();
        boolean isGreater = false;

        int[] candiesCopy = candies.clone();
        for (int i = 0; i < candies.length; i++) {
            candiesCopy[i] += extraCandies;
            for (int j = 0; j < candies.length; j++){
                if(candiesCopy[i] >= candies[j]){
                    System.out.println(candiesCopy[i] + " - " + candies[j]);
                    isGreater = true;
                } else {
                    //4 is less than 5, but the next iteration overrides the boolean
                    //so if it is false, break.
                    isGreater = false;
                    break;
                }
            }
            result.add(isGreater);
        }

        return result;
    }
}
