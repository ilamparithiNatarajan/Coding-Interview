package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuerySemiPrimesBySieveTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    int N = 0;
    int[] P = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
    int[] Q = new int[]{0, 0, 0, 0, 2, 0, 0, 0};

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    QuerySemiPrimesBySieve.solution(N, P, Q);
  }
}
