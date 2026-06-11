import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BuildPulseTest {

    @Test
    void passTest() {
        assertTrue(true);
    }

    @Test
    void failTest() {
        fail("Intentional failure");
    }

    @Test
    void errorTest() {
        String value = null;
        value.length(); // NullPointerException
    }

    @Test
    void flakyTest() {
        if (Math.random() > 0.5) {
            fail("Random flaky failure");
        }
    }

    @Disabled("Intentional skip for CI Visibility")
    @Test
    void skippedTest() {
        assertTrue(false);
    }

    @Test
    void slowTest() throws Exception {
        Thread.sleep(5000);
        assertTrue(true);
    }
}