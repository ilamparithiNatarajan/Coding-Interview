package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinaryGapTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int N = 0;

    // Act
    int actual = BinaryGap.solution(N);

    // Assert
    assertEquals(0, actual);
  }
}
