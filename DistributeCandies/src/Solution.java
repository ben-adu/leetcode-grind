import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int distributeCandies(int[] candyType)
    {
        int[] unique=IntStream.of(candyType).distinct().toArray();
         //System.out.println(Arrays.toString(unique));
        return unique.length;
    }
}
