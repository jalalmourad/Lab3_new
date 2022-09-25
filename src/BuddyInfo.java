import java.util.ArrayList;

public class BuddyInfo {
    private int jalal;
    private int nono;
    private String name;
    private Integer phonenumber;
    private String address;

    public BuddyInfo(String name,Integer phonenumber,String address) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;

    }
    public BuddyInfo(){
        name = "Jalal";

    }
    private String getName(){
           return name ;
    }

    private Integer getPhonenumber(){
        return phonenumber ;
    }

    private String getAddress(){
        return address ;
    }



    public static void main(String[] args) {
        BuddyInfo Jalal ;
        Jalal = new BuddyInfo("Jalal",613,"Carleton");
        System.out.println("Hello " + Jalal.getName() + Jalal.getPhonenumber() + Jalal.getAddress());
    }
}
