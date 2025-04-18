import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsJUnitTest {
    @Test
    public void testIsBlank() {
        assertFalse(StringUtils.isBlank("   "));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testTrim() {
        assertEquals("abc", StringUtils.trim("  abc  "));
    }
}    