import java.util.ArrayList;

public class StoredData {
    private static ArrayList<String> registeredFamilyNames = new ArrayList<>();

    public static void addFamily(Information info) {
        registeredFamilyNames.add(info.getFamilyName());
    }

    public static void displayAllRecords() {
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("                 ALL REGISTERED FAMILIES                     ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total Records: " + registeredFamilyNames.size());
        System.out.println("-------------------------------------------------------------");
        System.out.println("\nList of Families:");
        for (int i = 0; i < registeredFamilyNames.size(); i++) {
            System.out.println((i + 1) + ". " + registeredFamilyNames.get(i));
        }
        System.out.println("-------------------------------------------------------------");
    }
}