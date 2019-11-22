package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OddOccurencesInArrayTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = OddOccurencesInArray.solution(A);

    // Assert
    assertEquals(0, actual);
  }
}
