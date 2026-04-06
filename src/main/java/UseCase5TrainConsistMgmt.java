import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        // Header
        System.out.println("=================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=================================\n");

        // Create LinkedHashSet
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Add duplicate
        formation.add("Sleeper"); // ignored automatically

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates.");

        System.out.println("\nUC5 formation setup completed...");
    }
}
