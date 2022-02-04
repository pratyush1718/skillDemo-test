import static org.junit.Assert.*;
import org.junit.*;

public class MidtermTest {
    @Test
    public void modular() {
        assertEquals(2, Midterm.mod(5,4)); //fails
    }
}
