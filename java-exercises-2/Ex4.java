/*Read the start time and end time of a game. Next, calculate the duration of the game, knowing that it can start on one day and end on another, with a minimum duration of 1 hour and a maximum of 24 hours.*/

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the game start time:");
        int gameStart = sc.nextInt();
        System.out.println("Enter the game end time:");
        int gameEnd = sc.nextInt();

        int duration;
        if (gameStart < gameEnd) {
            duration = gameEnd - gameStart;
        } else {
            duration = 24 - gameStart + gameEnd;
        }

        System.out.println("THE GAME LASTED " + duration + " HOUR(S)");

        sc.close();
    }
}
