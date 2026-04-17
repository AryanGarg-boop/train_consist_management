import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args){
        // ================= UC1 =================
        System.out.println("=============================================");
        System.out.println("           Train Consist Management App      ");
        System.out.println("=============================================");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully....");

        int count = trainConsist.size();

        System.out.println("Initial boogie count : " + count);

        System.out.println("System ready for operations....\n");

        // -------------UC2----------
        
        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        // ---- CREATE (Add bogies) ----
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        // ---- DELETE (Remove a bogie) ----
        trainConsist.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        // ---- READ (Check for availability) ----
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = trainConsist.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        System.out.println("Final Train Passenger Consist:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC2 operations completed successfully...\n");

        // -------------UC3----------

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries will be ignored internally by HashSet
        bogies.add("BG101"); // Duplicate entry
        bogies.add("BG102"); // Duplicate entry

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...\n");

        // -------------UC4----------

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("========================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts
        LinkedList<String> orderedConsist = new LinkedList<>();

        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("AC");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(orderedConsist + "\n");

        // Insert 'Pantry Car' at position 2 (index 2)
        orderedConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(orderedConsist + "\n");

        // Remove the first and last bogie
        orderedConsist.removeFirst();
        orderedConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(orderedConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}