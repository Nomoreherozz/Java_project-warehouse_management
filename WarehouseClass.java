class WarehouseClass {
    public String ID;
    public int capacity;
    public String security;
    public String fire;
    public String light;
    public double temp;
    public double humidity;
    
    WarehouseClass(String ID, int capacity, String security, String fire, String light, double temp, double humidity) {
        this.ID = ID;
        this.capacity = capacity;
        this.security = security;
        this.fire = fire;
        this.light = light;
        this.temp = temp;
        this.humidity = humidity;
    }
   
    public void Print() {
        System.out.println("Infor of warehouse:\n ID:" + ID +
                "\n capacity(in ton):" + capacity +
                "\n security:" + security +
                "\n Fire safety system:" + fire +
                "\n lighting:" + light +
                "\n Temperature(in Celcius):" + temp +
                "\n Humidity:" + humidity + "\n");
    }
    
}
