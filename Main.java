/**
 * This program tests the DataSet class.
 */
public class Main {
  public static void main(String[] args) {
    DataSet quizData = new DataSet();
    Quiz q1 = new Quiz(89, "B+");
    Quiz q2 = new Quiz(90, "A-");
    Quiz q3 = new Quiz(73, "C+");
    quizData.add(q1);
    quizData.add(q2);
    quizData.add(q3);
    Quiz max = (Quiz) quizData.getMaximum();
  
    System.out.println("Average Score: " + quizData.getAverage());
    System.out.println("Highest Score: " + max.getMeasure());
  }
}
