package JAVA_imp_technical_Q;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int playerA = 0;
        int playerB = 0;
        boolean turnA = true; // A की बारी पहले

        while (playerA < 100 && playerB < 100) {
            int dice = random.nextInt(6) + 1; // 1 से 6 तक dice roll
            if (turnA) {
                playerA += dice;
                if (playerA > 100) playerA = 100; // 100 से ऊपर नहीं जा सकता
                System.out.println("Player A rolled " + dice + " → Position: " + playerA);
            } else {
                playerB += dice;
                if (playerB > 100) playerB = 100;
                System.out.println("Player B rolled " + dice + " → Position: " + playerB);
            }

            // बारी बदलना
            turnA = !turnA;

            // थोड़ी delay ताकि output readable हो
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Winner decide करना
        if (playerA >= 100) {
            System.out.println("\n🏆 Player A Wins!");
        } else {
            System.out.println("\n🏆 Player B Wins!");
        }
    }
}