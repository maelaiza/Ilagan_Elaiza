package L16_Activity;

import java.util.HashMap;
import java.util.Scanner;

class Phonebook {
    private HashMap<String, String> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

   
   public void addContact(String name, String number) {
       contacts.put(name, number);
       System.out.println("Contact added successfully.");
    }

 
    public void displayContacts1() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contacts List:");
            contacts.forEach((name, number) -> System.out.println("Name: " + name + ", Number: " + number));
        }
    }

  
    public void searchContact(String name) {
        String number = contacts.get(name);
        if (number != null) {
            System.out.println("Name: " + name + ", Number: " + number);
        } else {
            System.out.println("Contact not found.");
        }
    }







	 
}