public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("========================================");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // change for testing

        boolean found = false;

        // -------- LINEAR SEARCH --------
        for (String id : bogieIds) {

            if (id.equals(searchKey)) {
                found = true;
                break; // stop early
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        System.out.println("UC18 search completed...");
    }
}
