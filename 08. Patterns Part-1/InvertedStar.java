/*
  * * * * *
  * * * *
  * * * 
  * *
  *
 */

public class InvertedStar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {                      // Check notebook for multiple logics for this question.
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
