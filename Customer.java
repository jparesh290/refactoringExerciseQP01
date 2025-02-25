import java.util.ArrayList;
import java.util.List;

class Customer {
    String name;
    String type;
    double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    public void setDiscount() {
        if (type.equals(REGULAR.getType())) {
            discount = REGULAR.getDiscountValue();
        } else if (type.equals(PREMIUM.getType())) {
            discount = PREMIUM.getDiscountValue();
        } else if (type.equals(VIP.getType())) {
            discount = VIP.getDiscountValue();
        }
    }
}