import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase3TrainConsistMgmtTest {

    @Test
    void testUniqueBogieIds() {

        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG101"); // duplicate

        assertEquals(1, bogies.size());
    }
}
