import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HorseTest {

    private Horse horse;

    @Before
    public void setUp() {
        horse = new Horse('A', (byte) 1);
    }

    @Test
    public void isPossibleToMove_nominal_possible() {
        final boolean result = horse.isPossibleToMove('C', (byte) 2);
        Assert.assertTrue(result);
    }

    @Test
    public void isPossibleToMove_nominal_impossible() {
        final boolean result = horse.isPossibleToMove('C', (byte) 4);
        Assert.assertFalse(result);
    }

}
