import org.example.UnitTestingExample.StonePileDifferentiator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StonePileTest {

    @Test
    public void testDetermineMinDifference() {
        int[] weights1 = {100, 90, 25, 20, 11};
        assertEquals(4, StonePileDifferentiator.determineMinDifference(weights1));
    }
}

