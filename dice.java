import java.util.Scanner;

class dice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fP, sP;
        int dice = 0, dfPTot = 0, dsPTot = 0, round = 0, fPScore = 0, sPScore = 0, fPScoreR = 0,
                sPScoreR = 0;

        System.out.println(
        "Welcome to the online interactive dice game.\n\n\t * To complete the 5 rounds you will need two players and three dice!");
        System.out.println("\nPlayer 1, please state your name: ");
        fP = input.next();
        System.out.println("Welcome " + fP + "\n\nPlayer 2, please state your name: ");
        sP = input.next();
        System.out.println("Welcome " + sP + "\n\nLet's begin!");

        for (int count = 1; count <= 5; count++) {
            System.out.print(fP + " please throw your three dices and then input your total dice score : ");
                        dfPTot = input.nextInt();
            System.out.print(sP + " please throw your three dices and then input your total dice score : ");
                        dsPTot = input.nextInt();
            round = dfPTot + dsPTot;
            System.out.print(" The round total is: " + round + " \n");

            if (dfPTot > dsPTot) {
                fPScore = fPScore + round;
                fPScoreR += fPScore;
                sPScore = sPScore + 0;
                sPScoreR += sPScore;
            } else {
                sPScore = sPScore + round;
                sPScoreR += sPScore;
                fPScore = fPScore + 0;
                fPScoreR += fPScore;
            }
        }

        dfPTot = fPScore = round = 0;
        fPScore = fPScore + fPScoreR;
        sPScore = sPScore + sPScoreR;

        if (fPScore > sPScore) {
            System.out.println(fP + " is the Dice Master scoring: " + fPScore + " points");
        } else {
            System.out.println(sP + " is the Dice Master scoring: " + sPScore + " points");
        }
    }
}