import java.util.ArrayList;

// This is a class that represents a collection of entries (array of entries)

public class AddressBook {
    private ArrayList<Entry> entries;

    // Constructor
    public AddressBook() {
        entries = new ArrayList<>();
    }

    // Add an entry to the address book
    public void addEntry(Entry entry) {
        entries.add(entry);
        System.out.println("Added new entry!");
    }

    // Remove an entry from the address book based on email address
    public void removeEntry(String email) {
    	for (Entry entry : entries) {
          if (entry.getEmailAddress().equals(email)) {
        	  entries.remove(entry);
        	  System.out.println("Entry deleted\n");
              return;
          }
      }
    }

    // Search for entries based on a search parameter and query
    public void searchEntries(int searchType, String query) {
        ArrayList<Entry> searchResults = new ArrayList<>();

        switch (searchType) {
            case 1: // First Name
                for (Entry entry : entries) {
                    if (entry.getFirstName().toLowerCase().contains(query.toLowerCase())) {
                        searchResults.add(entry);
                    }
                }
                break;
            case 2: // Last Name
                for (Entry entry : entries) {
                    if (entry.getLastName().toLowerCase().contains(query.toLowerCase())) {
                        searchResults.add(entry);
                    }
                }
                break;
            case 3: // Phone Number
                for (Entry entry : entries) {
                    if (entry.getPhoneNumber().contains(query)) {
                        searchResults.add(entry);
                    }
                }
                break;
            case 4: // Email Address
                for (Entry entry : entries) {
                    if (entry.getEmailAddress().toLowerCase().contains(query.toLowerCase())) {
                        searchResults.add(entry);
                    }
                }
                break;
            default:
                System.out.println("Invalid search option.");
                return;
        }

        if (searchResults.isEmpty()) {
            System.out.println("No results found!");
        } else {
            for (Entry entry : searchResults) {
                System.out.println("************\n" + entry + "\n************");
            }
        }
    }

    // Print all entries in the address book
    public void printAddressBook() {
        if (entries.isEmpty()) {
            System.out.println("Address Book is empty!");
        } else {
            for (Entry entry : entries) {
                System.out.println("************\n" + entry + "\n************");
            }
        }
    }

    // Clear the address book
    public void deleteAddressBook() {
        entries.clear();
        System.out.println("Address book cleared!");
    }
}
