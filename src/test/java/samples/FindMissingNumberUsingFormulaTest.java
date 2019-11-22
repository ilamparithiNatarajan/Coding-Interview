package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMissingNumberUsingFormulaTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = FindMissingNumberUsingFormula.solution(A);

    // Assert
    assertEquals(45, actual);
  }
}
