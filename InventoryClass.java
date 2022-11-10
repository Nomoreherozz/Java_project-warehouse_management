class InventoryClass implements List {
    private String Name;
    private String ID;
    private String Date;
    private String Caterogy;
    private double Price;
    private String Origin;
    private String Location;
    private InventoryClass inventories[];
    private int size = 0;

    InventoryClass(String Name, String ID, String Date, String Caterogy,
 double Price, String Origin, String Location){
        this.Name = Name;
        this.ID = ID;
        this.Date = Date;
        this.Caterogy = Caterogy;
        this.Price = Price;
        this.Origin = Origin;
        this.Location = Location;
    }

    InventoryClass(int length){
        inventories = new InventoryClass[length];
    }

    //append
    public void append(InventoryClass inventory){
        assert inventory != null;
        inventories[size++] = inventory;
    }

    //search
    void SearchbyID(String ID){
        String isExist = "NOT FOUND";
        for(int i = 0; i < size; i++){
            if(inventories[i].ID != ID || inventories[i] == null) {
            }
            else{
                isExist = "FOUND";
            }
        }
    System.out.println(isExist);
    }
    
    //show list of inventory
    void listShow(){
        try{
            for(int i = 0; i < size; i++)
                System.out.println(inventories[i].ID);
        }    catch(NullPointerException ex){}
    }

    //delete inventory
    void deleteByID(String ID){
        for(int i = 0; i < size; i++){
            if(inventories[i].ID == ID){
                inventories[i] = null;
                for(int j = 0; j < size; j++){
                    inventories[i+j] = inventories[i+j+1];
                    size -=1;
                }
            }
        }
    }

    //showInfo
    void showInfo(){
        System.out.println("Name: " + Name +"\nID: " + ID + "\nDate: " + Date + 
                            "\nCaterogy: " + Caterogy + "\nOrigin: " + Origin + 
                            "\nPrice Per Unit: " + Price +"$" + "\nLocation: "+ Location);
    }

    @Override
    public void append(Staff staff) {  
    }
    
}
