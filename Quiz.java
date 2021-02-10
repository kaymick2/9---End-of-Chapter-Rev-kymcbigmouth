/**
 * A coin with a monetary score.
 */
public class Quiz implements Measurable {
  private double score;
  private String grade;

  /**
   * Constructs a coin.
   * 
   * @param aScore the monetary score of the coin
   * @param agrade the grade of the coin
   */
  public Quiz(double aScore, String aGrade) {
    score = aScore;
    grade = aGrade;
  }

  /**
   * Gets the coin score.
   * 
   * @return the score
   */
  public double getScore() {
    return score;
  }

  /**
   * Gets the coin grade.
   * 
   * @return the grade
   */
  public String getGrade() {
    return grade;
  }

  public double getMeasure() {
    return score;
  }
}
