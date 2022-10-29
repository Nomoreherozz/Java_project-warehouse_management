class inventoryClass {
    String name,ID, caterogy ,Date, unit, quality, origin, location;
    int quantity;
    double pricePerUnit;

    void Print(){
        System.out.println("Name: " + name +"\nID: " + ID + "\nDate: " + Date + 
                            "\nCaterogy: " + caterogy + "\nUnit: " + unit +
                            "\nQuantity: " + quantity + "\nQuality: " + quality + 
                            "\nOrigin: " + origin + "\nPrice Per Unit: " + pricePerUnit +"$" + 
                            "\nLocation: "+ location);
    }
}