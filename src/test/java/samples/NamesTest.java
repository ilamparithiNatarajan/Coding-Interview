package samples;

import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamesTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void mainTest() throws Exception {
    // Arrange
    String[] args = new String[]{"", "", ""};

    // Act and Assert
    thrown.expect(IOException.class);
    Names.main(args);
  }
}
