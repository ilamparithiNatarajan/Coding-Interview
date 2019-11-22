package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RotateTheArrayTest {

  @Test
  public void rotateTest() throws Exception {
    // Arrange
    int[] array = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    int[] actual = RotateTheArray.rotate(array);

    // Assert
    assertEquals(8, actual.length);
  }
}
