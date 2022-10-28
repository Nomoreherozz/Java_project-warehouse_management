public class warehouse_class {

    public static void main(String[] args) {
        warehouse Ware_1 = new warehouse();
        warehouse Ware_2 = new warehouse();
//warehouse 1
        Ware_1.ID ="ABCD1001"; 
        Ware_1.capacity = 1000;
        Ware_1.security = "approved";
        Ware_1.fire = "approved";
        Ware_1.light = "approved";
        Ware_1.temp = 20.5;
        Ware_1.humidity = 40;
//warehouse 2
        Ware_2.ID ="ABCD1002"; 
        Ware_2.capacity = 1200;
        Ware_2.security = "approved";
        Ware_2.fire = "disapproved";
        Ware_2.light = "approved";
        Ware_2.temp = 10.5;
        Ware_2.humidity = 10;
    }
}
