
public class Vehicle {
    public static void main(String[] args) {
        VehicleClass Ve_1 = new VehicleClass("V01_W1", "Varance", "good", "Full", "warehouse 1");
        VehicleClass Ve_2 = new VehicleClass("V02_W1","Varance","bad","Half","warehouse 1");
        VehicleClass Ve_new = new VehicleClass(5);

    //method
    Ve_new.append(Ve_1);
    Ve_new.append(Ve_2);
    
    //list
    System.out.println("list of vehicle:");
    Ve_new.listShow();
    
    //showinfo
    System.out.println();
    Ve_1.showInfo();
    Ve_2.showInfo();
    
    //search
    System.out.println("search by No:");
    Ve_new.searchByID("V03_W1");
    Ve_new.searchByID("V01_W1");

    //delete
    System.out.println("delete by ID:");
    Ve_new.deleteByID("V01_W1");
    Ve_new.listShow();
    }
}
