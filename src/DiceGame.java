
import java.util.Scanner;
    public class DiceGame {
        public static void main(String args[]){

            // initializing scanner

            Scanner kb = new Scanner(System.in);

            // initializing variables

            int player1Score = 0; // player1 score after each round
            int player2Score = 0; // player2 score after each round
            int i;
            int n;


            // taking inputs from the players



            while(player1Score<10&&player2Score<10){ // if the score of any player is greater than 10 will not execute
                int player1Value = kb.nextInt();
                int player2Value = kb.nextInt();

                // conditional statements

                if(player1Value>player2Value){

                    System.out.println("Player 1 wins the round");
                    player1Score++;

                }


                if (player2Value > player1Value) {

                    System.out.println("Player 2 wins the round");
                    player2Score++;

                }

                // tiebreaker within the rounds
                if (player1Value == player2Value) {

                    System.out.println("Round tied, starting the tie-breaker game!"); //TIE BREAKER WITHIN ROUNDS
                    int totalTie1 = 0; // score of player1 after the 10 rounds
                    int totalTie2 = 0; // score of player2 after the 10 rounds


                    if (totalTie2==totalTie1) {
                        i =0; totalTie1=0;
                        while (i < 10) {
                            int player1Tie = kb.nextInt(); //inputs for 10 rounds
                            totalTie1 += player1Tie;

                            i++;
                        }
                        System.out.println("Player 1 tie-breaker total is " + totalTie1);


                        n = 0; totalTie2=0;
                        while (n < 10) {
                            int player2Tie = kb.nextInt(); // inputs for 10 rounds
                            totalTie2 += player2Tie;
                            n++;
                        }
                        System.out.println("Player 2 tie-breaker total is " + totalTie2);
                        if (totalTie2 > totalTie1) {

                            System.out.println("Player 2 wins the tie-breaker!");
                            player2Score += 3;
                        }
                        if (totalTie1 > totalTie2) {

                            System.out.println("Player 1 wins the tie-breaker!");
                            player1Score += 3;
                        }


                    }

                }



            }

            // conditional statements if the score is equal or greater than 10.

            if(player1Score>=10){
                System.out.println("Player 1 wins the game!");
            }
            if(player2Score>=10){
                System.out.println("Player 2 wins the game!");
            }
        }

    }