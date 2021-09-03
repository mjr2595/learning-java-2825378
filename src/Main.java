import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "What is the meaning of life?";
        String choiceA = "A: To find happiness";
        String choiceB = "B: To gain knowledge";
        String choiceC = "C: 42";

        String correctAnswer = "c";

        // Write a print statement asking the question and giving the answer choices
        System.out.println(question);
        System.out.println("Is it...");
        System.out.println(choiceA);
        System.out.println(choiceB);
        System.out.println(choiceC);

        // Get user answer. Loop until correct answer is given
        Scanner input = new Scanner(System.in);
        String answerChoice;
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("Your answer (A, B, or C): ");
            answerChoice = input.next().toLowerCase();
            isCorrect = answerChoice.substring(0, 1).equals(correctAnswer);
            if (!isCorrect) {
                System.out.println("oof... That is very wrong. YOU LOSE!");
            }
        }
        System.out.println("CORRECT!");
    }
}
