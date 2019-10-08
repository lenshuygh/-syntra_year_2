package recap_exercises;

import java.util.Scanner;

public class Ex05RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        playATurn(scanner);
    }

    private static void playATurn(Scanner scanner) {
        Ex05Signs randomSign = Ex05Signs.getRandomSign();
        System.out.println("-= "+randomSign.toString()+" =-");
        switch (getUserEntry(scanner)) {
            case "PAPER":
                if (randomSign == Ex05Signs.PAPER) {
                    System.out.println("TIE");
                } else if (randomSign == Ex05Signs.ROCK) {
                    System.out.println("WIN");
                } else {
                    System.out.println("LOSE");
                }
                break;
            case "ROCK":
                if (randomSign == Ex05Signs.PAPER) {
                    System.out.println("LOSE");
                } else if (randomSign == Ex05Signs.ROCK) {
                    System.out.println("TIE");
                } else {
                    System.out.println("WIN");
                }
                break;
            case "SCISSORS":
                if (randomSign == Ex05Signs.PAPER) {
                    System.out.println("WIN");
                } else if (randomSign == Ex05Signs.ROCK) {
                    System.out.println("LOSE");
                } else {
                    System.out.println("TIE");
                }
                break;
            default:
                scanner.close();
                return;
        }
        playATurn(scanner);
    }

    private static String getUserEntry(Scanner scanner) {
        System.out.print("Enter a move: ");
        return scanner.nextLine().toUpperCase();
    }
}
