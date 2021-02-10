/**
 * This program tests the DataSet class.
 */
public class Main {
  public static void main(String[] args) {
    DataSet quizData = new DataSet();
    Quiz q1 = new Quiz(89, "B+");
    Quiz q2 = new Quiz(90, "A-");
    Quiz q3 = new Quiz(73, "C+");
    Quiz max = (Quiz) quizData.getMaximum();
    System.out.println("Average Score: " + quizData.getAverage());
    System.out.println("Expected: 4000");
    System.out.println("Highest Score: " + max);
    System.out.println("Expected: 10000");
  }
}
