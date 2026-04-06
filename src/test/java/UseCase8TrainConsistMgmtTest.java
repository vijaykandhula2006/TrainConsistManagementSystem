import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Integer> list = Arrays.asList(72, 56, 24);

        List<Integer> result = list.stream()
                .filter(x -> x > 60)
                .collect(Collectors.toList());

        assertTrue(result.contains(72));
        assertFalse(result.contains(56));
    }
}
