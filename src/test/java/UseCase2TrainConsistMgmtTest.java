import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UseCase2TrainConsistMgmtTest {

    @Test
    void testAddAndRemoveBogies() {

        List<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        assertEquals(3, bogies.size());

        bogies.remove("AC Chair");

        assertEquals(2, bogies.size());
        assertTrue(bogies.contains("Sleeper"));
        assertFalse(bogies.contains("AC Chair"));
    }
}
