class inventoryClass {
    String name,ID, caterogy ,Date, unit, quality, origin;
    int quantity;
    double pricePerUnit;

    void Print(){
        System.out.println("Name: " + name +"\nID: " + ID + "\nDate: " + Date + 
                            "\nCaterogy: " + caterogy + "\nQuantity: " + quantity + 
                            "\nUnit: " + unit + "\nQuality: " + quality + 
                            "\nOrigin: " + origin + "\nPrice Per Unit($): " + pricePerUnit);
    }
}