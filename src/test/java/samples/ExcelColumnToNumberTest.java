package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExcelColumnToNumberTest {

  @Test
  public void findTest() throws Exception {
    // Arrange
    String column = "ABB";

    // Act
    int actual = ExcelColumnToNumber.find(column);

    // Assert
    assertEquals(730, actual);
  }
}


