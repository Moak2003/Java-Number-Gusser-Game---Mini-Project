import java.util.Scanner;

public class Guesser_game {

    public static void main(String[] args) {

    }

}

class guesser { 

    int guess ;

    public int guessing_number() {
        System.out.println("Hey Guesser !! kindly enter the guess - ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt(); 
        return guess; 
    }
}

class player {
    int guess;

    public int Player() {
        System.out.println("Hey player !! enter the number - ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        return guess;
    }
}

class umpire {

    int num_from_guesser;
    int num_from_player1;
    int num_from_player2;
    int num_from_player3;

    // for behaviour of umpire

    void num_from_guesser() {
        guesser g_guess = new guesser();
        num_from_guesser = g_guess.guessing_number();
    }

    void num_from_players() {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        num_from_player1 = p1.Player();
        num_from_player2 = p2.Player();
        num_from_player3 = p3.Player();
    }

    class comparison {
        public comparison() {
            if (num_from_guesser == num_from_player1) {
                System.out.println("Congrats !! Player 1 has won the game ");
            } else if (num_from_guesser == num_from_player2) {
                System.out.println("Congrats !! Player 2 has won the game");
            } else if (num_from_guesser == num_from_player3) {
                System.out.println("Congrats !! Player 3 has won the game");
            } else {
                System.out.println(" Unlucky !! No match found ");
            }
        }
    }
}
