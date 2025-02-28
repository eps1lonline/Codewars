public class Kata {
    public static String rps(String p1, String p2) {
        if (p1 == p2) {
            return "Draw!";
        }
        else if (p1 == "paper" && p2 == "rock" || p1 == "rock" && p2 == "scissors" || p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        }
        else {
            return "Player 2 won!";
        }
    }
}