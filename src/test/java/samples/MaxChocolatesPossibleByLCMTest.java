package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxChocolatesPossibleByLCMTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int N = 4;
    int M = 4;

    // Act
    int actual = MaxChocolatesPossibleByLCM.solution(N, M);

    // Assert
    assertEquals(1, actual);
  }
}
