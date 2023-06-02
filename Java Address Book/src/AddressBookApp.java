import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        // creating an object of addressBook
    	AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) Add an entry");
            System.out.println("2) Remove an entry");
            System.out.println("3) Search for a specific entry");
            System.out.println("4) Print Address Book");
            System.out.println("5) Delete Book");
            System.out.println("6) Quit");
// prompt for the user
            System.out.print("Please choose what you'd like to do with the address book: ");
            int choice = scanner.nextInt(); // taking in the user input
            scanner.nextLine(); // newline 

            switch (choice) {
                case 1:
                // prompt the user to add a new entry
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Email Address: ");
                    String emailAddress = scanner.nextLine();

                    Entry entry = new Entry(firstName, lastName, phoneNumber, emailAddress);
                    addressBook.addEntry(entry);
                    break;
                case 2:
                	
                // prompt for the user to remove an entry
                    System.out.print("Enter an entry's email to remove: ");
                    String email = scanner.nextLine();
                    addressBook.removeEntry(email);
                    break;
                case 3:
                // search for an entry by choosing one of the entries
                    System.out.println("1) First Name");
                    System.out.println("2) Last Name");
                    System.out.println("3) Phone Number");
                    System.out.println("4) Email Address");

                    System.out.print("Choose a search type: ");
                    int searchType = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter your search: ");
                    String query = scanner.nextLine();
                    addressBook.searchEntries(searchType, query);
                    break;
                case 4:
                	// printing the address boook
                    addressBook.printAddressBook();
                    break;
                case 5:
                	// clearing it 
                    addressBook.deleteAddressBook();
                    break;
                case 6: // closing application
                    System.out.println("Program terminated.");
                    scanner.close();
                    System.exit(0);
                default: 
                	// unknown input
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
