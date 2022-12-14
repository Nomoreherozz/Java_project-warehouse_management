
class VehicleClass implements List {
    private String No;
    private String Driver;
    private String Quality;
    private String Fuel;
    private String Location;
    private VehicleClass vehicles[];
    private int size = 0;

    VehicleClass(String No, String Driver, String Quality, String Fuel, String Location) {
        this.No = No;
        this.Driver = Driver;
        this.Quality = Quality;
        this.Fuel = Fuel;
        this.Location = Location;
    }
//append
    VehicleClass(int length) {
        vehicles = new VehicleClass[length];
    }

    public void append(VehicleClass vehicle) {
        assert vehicle != null;
        vehicles[size++] = vehicle;
    }
    //search
    void searchByNo(String No) {
            String isExist = "NOT FOUND";
            for(int i = 0; i < size; i++) {
                if(vehicles[i].No != No || vehicles[i] == null) {
                }
                else {
                    isExist = "FOUND";
                }
            }
        System.out.println(isExist);
    }
    //show list
    void listShow() {
        try {
            for (int i = 0; i < size; i++) {
                System.out.println(vehicles[i].No);
            }
        } catch (NullPointerException ex) {

        }
    }
    //delete
    void deleteByNo(String No) {
        for(int i = 0; i < size; i++) {
            if(vehicles[i].No == No) {
                vehicles[i] = null;
                for(int j = 0; j < size-i; j++) {
                    vehicles[i+j] = vehicles[i+j+1];
                    size -= 1;
                }
            }
        }
    }

   //showinfo
    public void showInfo() {
        System.out.println("Infor of Vehicle:\n No:" + No +
                "\n Driver:" + Driver +
                "\n Quality:" + Quality +
                "\n Fuel:" + Fuel +
                "\n Location:" + Location + "\n");
    }
	@Override
	public void append(Staff staff) {}
}
