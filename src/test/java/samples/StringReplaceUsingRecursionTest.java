package samples;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringReplaceUsingRecursionTest {

  @Test
  public void reverseStringTest() throws Exception {
    // Arrange
    String myStr = "aaaaa";

    // Act
    String actual = StringReplaceUsingRecursion.reverseString(myStr);

    // Assert
    assertEquals("aaaaa", actual);
  }
}
