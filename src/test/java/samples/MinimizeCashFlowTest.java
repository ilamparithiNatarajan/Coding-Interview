package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinimizeCashFlowTest {

  @Test
  public void minimizeTest() throws Exception {
    // Arrange
    int[][] graph = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0},
        new int[]{0, 0, 0, 0, 0, 0, 0, 0}};

    // Act
    int[][] actual = MinimizeCashFlow.minimize(graph);

    // Assert
    assertEquals(3, actual.length);
  }

  @Test
  public void validateTest() throws Exception {
    // Arrange
    int[][] intArray = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0},
        new int[]{0, 0, 0, 0, 0, 0, 0, 0}};

    // Act
    MinimizeCashFlow.validate(intArray);

    // Assert
    assertEquals(3, intArray.length);
  }
}
