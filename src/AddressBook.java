import java.util.*;
public class AddressBook {

    ArrayList<BuddyInfo> buddylist;
    private int ja;
    public AddressBook(){

        buddylist = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null){

            buddylist.add(buddy);
        }

    }

    public void removeBuddy(int index){
        if(index >=0 && index<buddylist.size()){
            buddylist.remove(index);
        }

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Jalal", 613,"Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);


    }
}
