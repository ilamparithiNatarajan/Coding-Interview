package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MaxCounterEfficientTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int N = 0;
    int[] A = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    MaxCounterEfficient.solution(N, A);
  }
}
