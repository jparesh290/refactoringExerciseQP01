package exercise.constants;

public enum OrderItems {
    LAPTOP("Laptop", 1000),
    MOUSE("Mouse", 50),
    KEYBOARD("Keyboard", 80);

    private String itemName;
    private long itemPrice;

    OrderItems(String itemName, long itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return this.itemName;
    }

    public long getItemPrice() {
        return this.itemPrice;
    }
}