import java.util.Scanner;
public class Vehicle_class {
    public static void main(String[] args) {
        Vehicle Ve_1 = new Vehicle();
        VehicleClass Ve_new = new VehicleClass();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new Vehicle information: ");
        
        System.out.println("Vehicle No:");
        Ve_new.No = sc.next();
        System.out.println("Vehicle's Driver:");
        Ve_new.Driver = sc.next();
        System.out.println("Vehicle's quality:");
        Ve_new.Quality = sc.next();
        System.out.println("Vehicle fuel level:");
        Ve_new.Fuel = sc.next();
        System.out.println("Vehicle location:");
        Ve_new.Location = sc.next();
        sc.close();
    //Vehicle 1
        Ve_1.No = "V01_W1";
        Ve_1.Driver = "Varance";
        Ve_1.Quality = "good";
        Ve_1.Fuel = "Full";
        Ve_1.Location = "warehouse 1"; 
    }
    piblic void isRefilled();
    Ve_1.Print();
    Ve_new.Print();
}
