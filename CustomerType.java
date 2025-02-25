package exercise.constants;

public enum CustomerType {
    VIP("VIP", 0.1),
    REGULAR("Regular", 0.05),
    PREMIUM("Premium", 0.2);

    private String type;
    private float discountValue;

    CustomerType(String type, float discountValue){
        this.type = type;
        this.discountValue = discountValue;
    }

    public String getType(){
        return type;
    }

    public String getDiscountValue(){
        return type;
    }
}