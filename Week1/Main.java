package Week1;

public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();

        Contact person1 = new Contact();
        person1.name = "Fatima";
        person1.phoneNumber = "0555123123";
        myContactsManager.addContact(person1);

        Contact person2 = new Contact();
        person2.name = "Mirkhad";
        person2.phoneNumber = "0999000111";
        myContactsManager.addContact(person2);

        Contact person3 = new Contact();
        person3.name = "Nazik";
        person3.phoneNumber = "0554440001";
        myContactsManager.addContact(person3);


        Contact result1 = myContactsManager.searchContact("Fatima");
        Contact result2=myContactsManager.searchContact("Mirkhad");
        Contact result3=myContactsManager.searchContact("Nazik");
        System.out.println(result1.phoneNumber+" - "+result1.name);
        System.out.println(result2.phoneNumber+" - "+result2.name);
        System.out.println(result3.phoneNumber+" - "+result3.name);

    }
}
