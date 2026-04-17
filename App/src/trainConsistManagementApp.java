import java.util.*;
import java.util.stream.Collectors;

// Custom Object representing a Bogie
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

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

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

        trainConsist.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + trainConsist + "\n");

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

        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

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

        LinkedList<String> orderedConsist = new LinkedList<>();

        orderedConsist.add("Engine");
        orderedConsist.add("Sleeper");
        orderedConsist.add("AC");
        orderedConsist.add("Cargo");
        orderedConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(orderedConsist + "\n");

        orderedConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(orderedConsist + "\n");

        orderedConsist.removeFirst();
        orderedConsist.removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(orderedConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...\n");

        // -------------UC5----------

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        formation.add("Sleeper"); // Duplicate entry

        System.out.println("Final Train Formation:");
        System.out.println(formation + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 formation setup completed...\n");

        // -------------UC6----------

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        System.out.println("UC6 bogie-capacity mapping completed...\n");

        // -------------UC7----------

        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("========================================\n");

        List<Bogie> bogieObjects = new ArrayList<>();
        bogieObjects.add(new Bogie("Sleeper", 72));
        bogieObjects.add(new Bogie("AC Chair", 56));
        bogieObjects.add(new Bogie("First Class", 24));
        bogieObjects.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        for (Bogie b : bogieObjects) {
            System.out.println(b);
        }
        System.out.println();

        bogieObjects.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("After Sorting by Capacity:");
        for (Bogie b : bogieObjects) {
            System.out.println(b);
        }
        System.out.println();

        System.out.println("UC7 sorting completed...\n");

        // -------------UC8----------

        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("========================================\n");

        List<Bogie> streamBogies = new ArrayList<>();
        streamBogies.add(new Bogie("Sleeper", 72));
        streamBogies.add(new Bogie("AC Chair", 56));
        streamBogies.add(new Bogie("First Class", 24));
        streamBogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        for (Bogie b : streamBogies) {
            System.out.println(b);
        }
        System.out.println();

        List<Bogie> filteredBogies = streamBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
        System.out.println();

        System.out.println("UC8 filtering completed...\n");

        // -------------UC9----------

        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("========================================\n");

        List<Bogie> groupBogies = new ArrayList<>();
        groupBogies.add(new Bogie("Sleeper", 72));
        groupBogies.add(new Bogie("AC Chair", 56));
        groupBogies.add(new Bogie("First Class", 24));
        groupBogies.add(new Bogie("Sleeper", 70));
        groupBogies.add(new Bogie("AC Chair", 60));

        System.out.println("All Bogies:");
        for (Bogie b : groupBogies) {
            System.out.println(b);
        }
        System.out.println();

        // Stream API: Group bogies by their name (type)
        Map<String, List<Bogie>> groupedBogies = groupBogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("Grouped Bogies:\n");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  Capacity -> " + b.getCapacity());
            }
            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}