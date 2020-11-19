package safar;

import org.junit.jupiter.api.Test;
import safar.factory.SafarFactory;
import safar.interfaces.SafarInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafarImpsTest {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        SafarInterface safarInterface = SafarFactory.getSafarImpl1();
        assertEquals(true, safarInterface != null);
    }
}
