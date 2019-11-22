package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MaxChocolatesPossibleByBruteForceTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int N = 0;
    int M = 0;

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    MaxChocolatesPossibleByBruteForce.solution(N, M);
  }
}
