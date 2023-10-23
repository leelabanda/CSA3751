import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonTest {

    @Test
    public void testStringComparison() {
        String string1 = "Hello";
        String string2 = "Hello";

        assertEquals(string1, string2);
    }
}