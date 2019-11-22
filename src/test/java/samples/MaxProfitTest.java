package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxProfitTest {

  @Test
  public void SolutionTest() throws Exception {
    // Arrange
    MaxProfit maxProfit = new MaxProfit();
    int[] A = new int[]{1, 1, 1, 1, 1, 1, 1, 1};

    // Act
    int actual = maxProfit.Solution(A);

    // Assert
    assertEquals(0, actual);
  }
}
