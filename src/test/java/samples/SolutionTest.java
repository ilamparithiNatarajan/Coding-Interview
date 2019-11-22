package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SolutionTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    NumberOfDivisiblesBwTwoNums.Solution solution = (new NumberOfDivisiblesBwTwoNums()).new Solution();
    int A = 0;
    int B = 0;
    int K = 0;

    // Act and Assert
    thrown.expect(ArithmeticException.class);
    solution.solution(A, B, K);
  }
  @Test
  public void solutionTest10() throws Exception {
    // Arrange
    ProperlyNested.Solution solution = (new ProperlyNested()).new Solution();
    String S = "{[(";

    // Act
    int actual = solution.solution(S);

    // Assert
    assertEquals(0, actual);
  }
  @Test
  public void solutionTest11() throws Exception {
    // Arrange
    MaxCounter.Solution solution = (new MaxCounter()).new Solution();
    int N = 0;
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    solution.solution(N, A);
  }
  @Test
  public void solutionTest12() throws Exception {
    // Arrange
    MinimumPerimeter.Solution solution = (new MinimumPerimeter()).new Solution();
    int N = 1;

    // Act
    int actual = solution.solution(N);

    // Assert
    assertEquals(4, actual);
  }
  @Test
  public void solutionTest2() throws Exception {
    // Arrange
    FindIfTriangleTripletIsPresent.Solution solution = (new FindIfTriangleTripletIsPresent()).new Solution();
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = solution.solution(A);

    // Assert
    assertEquals(0, actual);
  }
  @Test
  public void solutionTest3() throws Exception {
    // Arrange
    NextMinimumPositiveNumber.Solution solution = (new NextMinimumPositiveNumber()).new Solution();
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = solution.solution(A);

    // Assert
    assertEquals(1, actual);
  }
  @Test
  public void solutionTest4() throws Exception {
    // Arrange
    VoraciousFish.Solution solution = (new VoraciousFish()).new Solution();
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
    int[] B = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = solution.solution(A, B);

    // Assert
    assertEquals(8, actual);
  }
  @Test
  public void solutionTest5() throws Exception {
    // Arrange
    DNASequence.Solution solution = (new DNASequence()).new Solution();
    String S = "aaaaa";
    int[] P = new int[]{0, 0, 0, 0, 0, 0, 0, 71};
    int[] Q = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    solution.solution(S, P, Q);
  }
  @Test
  public void solutionTest6() throws Exception {
    // Arrange
    MinAverageSlicingOfArray.Solution solution = (new MinAverageSlicingOfArray()).new Solution();
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = solution.solution(A);

    // Assert
    assertEquals(0, actual);
  }
  @Test
  public void solutionTest7() throws Exception {
    // Arrange
    DistinctValues.Solution solution = (new DistinctValues()).new Solution();
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = solution.solution(A);

    // Assert
    assertEquals(1, actual);
  }
  @Test
  public void solutionTest8() throws Exception {
    // Arrange
    NumberOfDivisors.Solution solution = (new NumberOfDivisors()).new Solution();
    int N = 1;

    // Act
    int actual = solution.solution(N);

    // Assert
    assertEquals(1, actual);
  }
  @Test
  public void solutionTest9() throws Exception {
    // Arrange
    MultipleOfThree.Solution solution = (new MultipleOfThree()).new Solution();
    int[] A = new int[]{1, 1, 1, 1, 1, 655361, 1, 1};

    // Act
    int actual = solution.solution(A);

    // Assert
    assertEquals(655361, actual);
  }
}
