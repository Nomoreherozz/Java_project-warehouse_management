public class AccessControler {
    public static void main(String[] args) {
//staff
        Manager m1 = new Manager("m1", 101, 34, 2000, "manager", 200);
        Employee e1 = new Employee("e1", 111, 30, 1000, "emplyee", 100);
        Employee e2 = new Employee("e2", 112, 30, 1000, "emplyee", 100);
        Staff managerlist = new Staff(5);
        Staff employeelist = new Staff(5);
//Vehicles
        VehicleClass Ve_1 = new VehicleClass("V01_W1", "Varance", "good", "Full", "warehouse 1");
        VehicleClass Ve_2 = new VehicleClass("V02_W1","Varance","bad","Half","warehouse 1");
        VehicleClass Ve_new = new VehicleClass(5);
//Staff method
        managerlist.append(m1);
        employeelist.append(e1);
        employeelist.append(e2);
        
        employeelist.listShow();
        employeelist.deleteByID(111);
        System.out.println();
        employeelist.listShow();
//vehicle Method
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
        
    //inventory
        InventoryClass i1 = new InventoryClass("i1", "I001", "26/01/2022", "xyz", 109.12, "xxx", "xxx");
        InventoryClass i2 = new InventoryClass("i2", "I002", "26/01/2022", "xyz", 109.12, "xxx", "xxx");
        InventoryClass inventorylist = new InventoryClass(5);
    
    //inventory method
        i1.showInfo();
        i2.showInfo();

        inventorylist.append(i1);
        inventorylist.append(i2);

        inventorylist.SearchbyID("I001");

        inventorylist.listShow();
        inventorylist.deleteByID("I001");
        inventorylist.listShow();

    }
}
