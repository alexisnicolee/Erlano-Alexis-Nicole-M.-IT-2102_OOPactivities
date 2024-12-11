import java.util.Scanner;

public class Evacuaid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean addMoreFamilies = true;

        System.out.println("\nHi, Welcome to EvacuAid: Disaster Evacuation Management System");
        System.out.println("This helps track the evacuation of families during emergencies");
        System.out.println("Please register your family so that we can assist you effectively during this evacuation");

        while (addMoreFamilies) {
            System.out.println("\nFAMILY REGISTRATION");
            System.out.println("This page collects the necessary information about the family"); 
            System.out.println("for tracking during the evacuation.");
            System.out.println("----------------------------------------------------------------");

            // Collect family information
            Information familyInfo = new Information();
            System.out.print("Enter the family's last name: ");
            familyInfo.setFamilyName(scanner.nextLine());

            System.out.print("Enter the total number of family members: ");
            familyInfo.setTotalFamilyMembers(scanner.nextInt());

            System.out.print("Adults (18+): ");
            familyInfo.setAdults(scanner.nextInt());

            System.out.print("Children (Under 18): ");
            familyInfo.setChildren(scanner.nextInt());

            System.out.print("Elderly (60+): ");
            familyInfo.setElderly(scanner.nextInt());

            System.out.print("Persons with Disabilities: ");
            familyInfo.setDisabilities(scanner.nextInt() == 1);

            System.out.print("Number of pets (if any): ");
            familyInfo.setPets(scanner.nextInt());
            scanner.nextLine(); // Consume newline

            // Collect contact information
            Contact contactInfo = new Contact();
            System.out.print("Primary Contact: ");
            contactInfo.setPrimaryContact(scanner.nextLine());

            System.out.print("Secondary Contact: ");
            contactInfo.setSecondaryContact(scanner.nextLine());

            System.out.print("Email Address: ");
            contactInfo.setEmail(scanner.nextLine());

            // Collect address information
            Address addressInfo = new Address();
            System.out.print("Home Address: ");
            addressInfo.setPrimaryAddress(scanner.nextLine());

            System.out.print("Evacuation Center Location: ");
            addressInfo.setEvacuationCenterAddress(scanner.nextLine());

            // Verification
            System.out.println("\nVERIFICATION OF INFORMATION");
            System.out.println("Please verify the information entered below.");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Family Name: " + familyInfo.getFamilyName());
            System.out.println("Total Members: " + familyInfo.getTotalFamilyMembers());
            System.out.println("Adults: " + familyInfo.getAdults());
            System.out.println("Children: " + familyInfo.getChildren());
            System.out.println("Elderly: " + familyInfo.getElderly());
            System.out.println("Persons with Disabilities: " + (familyInfo.hasDisabilities() ? "Yes" : "No"));
            System.out.println("Pets: " + familyInfo.getPets());
            System.out.println("Primary Contact: " + contactInfo.getPrimaryContact());
            System.out.println("Secondary Contact: " + contactInfo.getSecondaryContact());
            System.out.println("Email Address: " + contactInfo.getEmail());
            System.out.println("Home Address: " + addressInfo.getPrimaryAddress());
            System.out.println("Evacuation Center Location: " + addressInfo.getEvacuationCenterAddress());

            System.out.print("\nIs all the information correct? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                StoredData.addFamily(familyInfo);
                System.out.println("\nYour family evacuation registration has been successfully completed.");
            } else {
                System.out.println("Please re-enter the details.");
                continue;
            }

            System.out.print("\nWould you like to add another family? (yes/no): ");
            addMoreFamilies = scanner.nextLine().equalsIgnoreCase("yes");
        }

        // Display all registered families
        StoredData.displayAllRecords();
        scanner.close();
    }
}
