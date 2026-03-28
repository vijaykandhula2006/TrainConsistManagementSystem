import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UseCase1TrainConsistMgmtTest {

    @Test
    void testTrainInitialization() {
        List<String> trainConsist = new ArrayList<>();

        assertEquals(0, trainConsist.size());
    }

    @Test
    void testTrainConsistEmpty() {
        List<String> trainConsist = new ArrayList<>();

        assertTrue(trainConsist.isEmpty());
    }
}
