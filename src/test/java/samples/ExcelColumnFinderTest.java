package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExcelColumnFinderTest {

  @Test
  public void findTest() throws Exception {
    // Arrange
    int num = 1;

    // Act
    String actual = ExcelColumnFinder.find(num);

    // Assert
    assertEquals("A", actual);
  }
}
