package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LongestPasswordTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    String S = "a!#";

    // Act
    int actual = LongestPassword.solution(S);

    // Assert
    assertEquals(-1, actual);
  }
}
