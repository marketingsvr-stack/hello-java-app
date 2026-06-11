import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void testAdd() {
	    calculator c = new calculator();
	    assertEquals(5, c.add(2,3));
	}

//	// @Test
//	void failTest() {
//	    fail("Intentional failure for BuildPulse");
//	}

	// @Test
	void flakyTest() {

	    if(Math.random() > 0.5) {
	        fail("Random flaky failure");
	    }

	}
}
