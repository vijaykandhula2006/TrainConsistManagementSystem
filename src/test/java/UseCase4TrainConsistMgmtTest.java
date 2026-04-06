import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase4TrainConsistMgmtTest {

    @Test
    void testLinkedListOperations() {

        List<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");

        train.add(1, "Pantry");

        assertEquals("Pantry", train.get(1));

        train.remove(0);

        assertFalse(train.contains("Engine"));
    }
}
