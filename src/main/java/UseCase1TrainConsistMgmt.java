import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * @version 1.0
 */
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=================================\n");

        // Create empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}
