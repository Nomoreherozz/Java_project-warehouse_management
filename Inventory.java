public class Inventory {
    public static void main(String[] args) {

        inventoryClass Inventory_1 = new inventoryClass();
        Inventory_1.name = "Air fryer";
        Inventory_1.ID = "I001";
        Inventory_1.Date = "26/10/2022";
        Inventory_1.caterogy = "Kitchen Items";
        Inventory_1.unit = "item";
        Inventory_1.quantity = 1000;
        Inventory_1.quality = "new";
        Inventory_1.origin = "USA";
        Inventory_1.pricePerUnit = 127.59;
        Inventory_1.location = "Warehouse 1";

        inventoryClass Inventory_2 = new inventoryClass();
        Inventory_2.name = "Air conditioner";
        Inventory_2.ID = "I002";
        Inventory_2.Date = "26/10/2022";
        Inventory_2.caterogy = "Household appliances";
        Inventory_2.unit = "item";
        Inventory_2.quantity = 700;
        Inventory_2.quality = "new";
        Inventory_2.origin = "British";
        Inventory_2.pricePerUnit = 289.49;
        Inventory_2.location = "Warehouse 1";

        inventoryClass Inventory_3 = new inventoryClass();
        Inventory_3.name = "Vacumm cleaner";
        Inventory_3.ID = "I003";
        Inventory_3.Date = "26/10/2022";
        Inventory_3.caterogy = "Homecare Items";
        Inventory_3.unit = "item";
        Inventory_3.quantity = 1500;
        Inventory_3.quality = "new";
        Inventory_3.origin = "Switzerland";
        Inventory_3.pricePerUnit = 139.99;
        Inventory_3.location = "Warehouse 2";

        inventoryClass Inventory_4 = new inventoryClass();
        Inventory_4.name = "Laundering machine";
        Inventory_4.ID = "I004";
        Inventory_4.Date = "26/10/2022";
        Inventory_4.caterogy = "Homecare Items";
        Inventory_4.unit = "item";
        Inventory_4.quantity = 500;
        Inventory_4.quality = "new";
        Inventory_4.origin = "Japan";
        Inventory_4.pricePerUnit = 257.99;
        Inventory_4.location = "Warehouse 2";
    }
}