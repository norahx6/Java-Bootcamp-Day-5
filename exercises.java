package Day5;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {

// EX 1
 /*     Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = in.nextInt();

        System.out.println("Enter number 2 :");
        int num2 = in.nextInt();

        System.out.println("Enter Operation ( + , - , / , * , % :");
        String Operation = in.next();

         if (Operation.equals("+")) {
            System.out.println(num1 + num2);
        }
         else if (Operation.equals("-")) {
             System.out.println(num1 - num2);
         }
         else if (Operation.equals("/")) {
             System.out.println(num1 / num2);
         }
         else if (Operation.equals("*")) {
             System.out.println(num1 * num2);
         }
         else if (Operation.equals("%")) {
             System.out.println(num1 % num2);
         }
         else{
             System.out.println("Operation");
         }
*/

// EX 2

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while(true) {

            System.out.print(" To make a move, enter rock, paper, or scissors. ");
            String myMove = in.nextLine();

            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("Your move isn't valid!");

            } else {

                int rand = (int) (Math.random() * 3);
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "rock";
                } else if (rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);

                if (myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if ((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }


            }
        }
    }// end
}// end