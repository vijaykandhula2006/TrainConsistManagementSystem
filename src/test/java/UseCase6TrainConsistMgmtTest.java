import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase6TrainConsistMgmtTest {

    @Test
    void testCapacityMapping() {

        Map<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC Chair", 56);

        assertEquals(72, map.get("Sleeper"));
        assertTrue(map.containsKey("AC Chair"));
    }
}
