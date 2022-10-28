public class Inventory {
    public static void main(String[] args) {

        inventoryClass Inventory_1 = new inventoryClass();
        Inventory_1.name = "Knife";
        Inventory_1.ID = "I001";
        Inventory_1.Date = "26/10/2022";
        Inventory_1.caterogy = "Kitchen Items";
        Inventory_1.quantity = 500;
        Inventory_1.unit = "item";
        Inventory_1.quality = "new";
        Inventory_1.origin = "Japan";
        Inventory_1.pricePerUnit = 27.59;

        inventoryClass Inventory_2 = new inventoryClass();
        Inventory_2.name = "Body Soap";
        Inventory_2.ID = "I002";
        Inventory_2.Date = "26/10/2022";
        Inventory_2.caterogy = " Toilettories";
        Inventory_2.quantity = 200;
        Inventory_2.unit = "pack pof 4";
        Inventory_2.quality = "new";
        Inventory_2.origin = "Korea";
        Inventory_2.pricePerUnit = 28.49;

        inventoryClass Inventory_3 = new inventoryClass();
        Inventory_3.name = "Vacumm cleaner";
        Inventory_3.ID = "I003";
        Inventory_3.Date = "26/10/2022";
        Inventory_3.caterogy = "Homecare Items";
        Inventory_3.quantity = 200;
        Inventory_3.unit = "item";
        Inventory_3.quality = "new";
        Inventory_3.origin = "Switzerland";
        Inventory_3.pricePerUnit = 139.99;
    }
}