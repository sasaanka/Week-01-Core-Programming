import java.util.Scanner;
public class RockPaperScissor{
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int index = (int) (Math.random() * 3); 
        return choices[index];
    }
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
            (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userWinPercentage = (userWins * 100.0) / totalGames;
        double computerWinPercentage = (computerWins * 100.0) / totalGames;
        return new String[][]{
            {"User Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Draws", String.valueOf(draws)},
            {"User Win %", String.format("%.2f", userWinPercentage) + "%"},
            {"Computer Win %", String.format("%.2f", computerWinPercentage) + "%"}
        };
    }
    public static void displayResults(int totalGames, String[][] stats) {
        System.out.println("\nGame Stats:");
        System.out.printf("| %-16s | %-10s |\n", "Category", "Value");
        for (String[] row : stats) {
            System.out.printf("| %-16s | %-10s |\n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numGames = scanner.nextInt();
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 1; i <= numGames; i++) {
            System.out.print("\nGame " + i + " - Enter Rock, Paper, or Scissors: ");
            String userChoice = scanner.next();
            userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1).toLowerCase();
            if (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
                System.out.println("Invalid choice! Try again.");
                i--;
                continue;
            }
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            String winner = findWinner(userChoice, computerChoice);
            System.out.println("Winner: " + (winner.equals("Draw") ? "It's a Draw!" : winner + " Wins!"));
            switch (winner) {
                case "User" -> userWins++;
                case "Computer" -> computerWins++;
                default -> draws++;
            }
        }
        String[][] stats = calculateStats(userWins, computerWins, draws, numGames);
        displayResults(numGames, stats);
       
    }
}
