package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SymmetricPointOfStringTest {

  @Test
  public void solutionTest() throws Exception {
    // Arrange
    String S = "x";

    // Act
    int actual = SymmetricPointOfString.solution(S);

    // Assert
    assertEquals(0, actual);
  }
}
