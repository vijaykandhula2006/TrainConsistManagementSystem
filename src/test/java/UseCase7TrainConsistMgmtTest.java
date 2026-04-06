import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase7TrainConsistMgmtTest {

    @Test
    void testSorting() {

        List<Integer> capacities = new ArrayList<>();
        capacities.add(72);
        capacities.add(56);
        capacities.add(24);

        Collections.sort(capacities);

        assertEquals(24, capacities.get(0));
    }
}
