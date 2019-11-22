package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CommonElementInArraysTest {

  @Test
  public void findTest() throws Exception {
    // Arrange
    int[][] arrays = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0},
        new int[]{0, 0, 0, 0, 0, 0, 0, 0}};

    // Act
    int actual = CommonElementInArrays.find(arrays);

    // Assert
    assertEquals(0, actual);
  }
}
