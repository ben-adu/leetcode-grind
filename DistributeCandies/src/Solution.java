import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int distributeCandies(int[] candyType)
    {
        int[] unique=IntStream.of(candyType).distinct().toArray();
        return Math.min(unique.length, candyType.length/2);
    }
}
