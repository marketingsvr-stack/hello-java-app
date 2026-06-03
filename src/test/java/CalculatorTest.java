import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
    void testAdd() {
        calculator c = new calculator();
        assertEquals(5, c.add(2, 3));
    }
}
