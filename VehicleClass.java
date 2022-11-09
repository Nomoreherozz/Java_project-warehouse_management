
class VehicleClass {
    public String No;
    public String Driver;
    public String Quality;
    public String Fuel;
    public String Location;

    VehicleClass(String No, String Driver, String Quality, String Fuel, String Location) {
        this.No = No;
        this.Driver = Driver;
        this.Quality = Quality;
        this.Fuel = Fuel;
        this.Location = Location;

    }
   
    public void Print() {
        System.out.println("Infor of Vehicle:\n No:" + No +
                "\n Driver:" + Driver +
                "\n Quality:" + Quality +
                "\n Fuel:" + Fuel +
                "\n Location:" + Location + "\n");
    }

    
}
