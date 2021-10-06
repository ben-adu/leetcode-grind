
public class App {
   public static void main(String[] args) {
       Solution solution = new Solution();

       int [] candyType = {1,1,2,2,3,3};
       int answer = solution.distributeCandies(candyType);
       
       System.out.println(answer);
   }
}
