import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1, 5, 10, 20, 50, 100, 500, 2000};

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (coins[i] <= amount) {
                countOfCoins++;
                amount -= coins[i];
                ans.add(coins[i]);
            }
        }

        System.out.println("Total(min) no. of coins used: " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" " + ans.get(i));
        }
    }
}
