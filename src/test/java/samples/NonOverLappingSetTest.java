package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NonOverLappingSetTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
    int[] B = new int[]{0, 0, 0, 0, 0, 4, 0, 0};

    // Act
    int actual = NonOverLappingSet.solution(A, B);

    // Assert
    assertEquals(0, actual);
  }
}
