import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    List<Bogie> createData() {
        return List.of(
                new Bogie("Sleeper", 50),
                new Bogie("AC", 70),
                new Bogie("General", 65),
                new Bogie("Chair", 40)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> data = createData();

        List<Bogie> result = new ArrayList<>();
        for (Bogie b : data) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> data = createData();

        List<Bogie> result = data.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> data = createData();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : data) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult = data.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) list.add(i);

        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add(new Bogie("Test", i));
        }

        List<Bogie> result = data.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertTrue(result.size() > 0);
    }
}
