public class ManualUnitTest {
    public static void main(String[] args) {
        testIsBlank();
        testIsEmpty();
        testTrim();
    }

    public static void testIsBlank() {
        boolean result = StringUtils.isBlank("   ");
        if (!result) {
            System.out.println("isBlank test failed");
        } else {
            System.out.println("isBlank test passed");
        }
    }

    public static void testIsEmpty() {
        boolean result = StringUtils.isEmpty("");
        if (!result) {
            System.out.println("isEmpty test failed");
        } else {
            System.out.println("isEmpty test passed");
        }
    }

    public static void testTrim() {
        String result = StringUtils.trim("  abc  ");
        if (!result.equals("abc")) {
            System.out.println("trim test failed");
        } else {
            System.out.println("trim test passed");
        }
    }
}    