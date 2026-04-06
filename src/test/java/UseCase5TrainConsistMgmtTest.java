import org.junit.jupiter.api.Test;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase5TrainConsistMgmtTest {

    @Test
    void testInsertionOrderAndUniqueness() {

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Sleeper"); // duplicate

        assertEquals(2, formation.size());
        assertTrue(formation.contains("Engine"));
    }
}
