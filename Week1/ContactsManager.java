package Week1;

class ContactsManager {
    Contact [] people;
    int counter;

    ContactsManager(){
        counter = 0;
        people = new Contact[3];
    }

    void addContact(Contact contact){
        people[counter] = contact;
        counter++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<counter; i++){
            if(people[i].name.equals(searchName)){
                return people[i];
            }
        }
        return null;
    }
}