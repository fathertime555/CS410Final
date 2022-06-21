import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private StringCalculator toCalculate;

    @BeforeEach
    public void setUp() {
        toCalculate = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        toCalculate = null;
    }

    @Test
    public void testAdd() {
        int total = toCalculate.add("1, 5, 10");
        assertEquals(16, total);
    }

    @Test
    public void testAdd2() {
        int total = toCalculate.add("1, 5, 10, 1001");
        assertEquals(16, total);
    }

    @Test
    public void testAdd2() {
        int total = toCalculate.add("1001");
        assertEquals(0, total);
    }

    @Test
    public void testAdd3() {

        Exception exception = assertThrows(IllegalArgumentException, () -> {
            int total = toCalculate.add("1,1001, 5, 10, -3");
        });
        assertEquals("Negatives not allowed.", exception.getMessage());
    }
}

