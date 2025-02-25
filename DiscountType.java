package exercise.constants;

public enum CustomerType {
    VIP("VIP");

    private String type;

    CustomerType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }
}