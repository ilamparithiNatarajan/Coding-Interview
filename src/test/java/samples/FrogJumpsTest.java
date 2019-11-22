package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FrogJumpsTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    FrogJumps frogJumps = new FrogJumps();
    int X = 0;
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = frogJumps.solution(X, A);

    // Assert
    assertEquals(-1, actual);
  }
}
