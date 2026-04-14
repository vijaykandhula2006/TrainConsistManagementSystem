public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC20 - Prevent Search on Empty Train");
        System.out.println("========================================");

        // Empty bogie list
        String[] bogieIds = {};

        String searchKey = "BG101";

        try {
            boolean result = searchBogie(bogieIds, searchKey);

            System.out.println("Search Result: " + result);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("UC20 validation completed...");
    }

    // Search method with validation
    static boolean searchBogie(String[] bogieIds, String key) {

        // -------- DEFENSIVE CHECK --------
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train to search.");
        }

        // Linear search (can be binary also)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }
}
