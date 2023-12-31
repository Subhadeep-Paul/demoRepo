package OOPSbyUdemy;

import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        contactManager myContactsManager = new contactManager();
        System.out.println("Please Enter your friends name: ");

        Scanner in = new Scanner(System.in);
        String a = in.next();


        Contact friendJames = new Contact();  // Created an object under the class Contact
        friendJames.name = "James";
        friendJames.phoneNumber= "8420883301";
        myContactsManager.addContact(friendJames);



        // Create a new Contact object for Cezanne
        Contact friendCezanne = new Contact();
        // Set the fields
        friendCezanne.name = "Cezanne";
        friendCezanne.phoneNumber = "987654321";
        // Add Cezanne Contact to the ContactsManager
        myContactsManager.addContact(friendCezanne);


        Contact result = myContactsManager.searchContact(a);
        System.out.println(result.phoneNumber);



    }

    // Creating a class responsible for storing name and phone number.
    //In other words we are creating an object data type.
    static class Contact{
        String name;                        // This is a class of an object.
        String phoneNumber;                 // The object is created in the main method.
    }

    static class contactManager{
        //Fields
        Contact[] myFriends;
        int friendsCount;



        // creating a constructor
        contactManager(){
            this.myFriends = new Contact[100];
            this.friendsCount = 0;
        }



        //creating a method named "addContact" to add contact new contacts in this class;
        void addContact(Contact contact){
            friendsCount++;
            myFriends[friendsCount] = contact;

        }



        //creating another method named "searchContact" to search contact in the contactManager.
        Contact searchContact(String name1){
            for (int i = 0; i < friendsCount; i++) {
                if (myFriends[i].name.equals(name1)){
                    return myFriends[i];
                }

            }
            return null;
        }
    }
}
