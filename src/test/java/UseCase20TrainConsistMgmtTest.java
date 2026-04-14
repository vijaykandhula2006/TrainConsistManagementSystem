import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmtTest {

    boolean search(String[] arr, String key) {

        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("No bogies available in the train to search.");
        }

        for (String id : arr) {
            if (id.equals(key)) return true;
        }

        return false;
    }

    @Test
    void testSearch_ValidData() {
        String[] arr = {"BG101","BG205"};
        assertTrue(search(arr, "BG101"));
    }

    @Test
    void testSearch_NotFound() {
        String[] arr = {"BG101","BG205"};
        assertFalse(search(arr, "BG999"));
    }

    @Test
    void testSearch_EmptyArrayThrowsException() {
        String[] arr = {};

        assertThrows(IllegalStateException.class, () -> {
            search(arr, "BG101");
        });
    }

    @Test
    void testSearch_NullArrayThrowsException() {
        assertThrows(IllegalStateException.class, () -> {
            search(null, "BG101");
        });
    }
}
