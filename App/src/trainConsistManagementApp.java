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

        System.out.println("UC2 operations completed successfully...");
    }
}