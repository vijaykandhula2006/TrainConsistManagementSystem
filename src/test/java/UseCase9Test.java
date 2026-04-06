import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9Test {

    @Test
    void testGrouping_BogiesGroupedByType() {

        List<String> list = Arrays.asList("Sleeper", "AC", "Sleeper");

        Map<String, List<String>> grouped =
                list.stream().collect(Collectors.groupingBy(x -> x));

        assertEquals(2, grouped.get("Sleeper").size());
    }
}
