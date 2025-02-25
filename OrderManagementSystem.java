import static exercise.constants.OrderItemType.*;
import static exercise.constants.CustomerType.*;

class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", VIP.getType());
        Order order = generateOrderForCustomer(customer);
        order.printOrder();
        generateInvoice(order);
    }

    public static Order generateOrderForCustomer(Customer customer){
        Order order = new Order(customer);
        order.addItem(LAPTOP.getItemName(), LAPTOP.getItemPrice());
        order.addItem(MOUSE.getItemName(), MOUSE.getItemPrice());
        order.addItem(KEYBOARD.getItemName(), KEYBOARD.getItemPrice());
        return order;
    }

    public static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.customer.name);
        System.out.println("Total: $" + order.totalPrice);
        System.out.println("Discounted Total: $" + order.discountedPrice);
        System.out.println("Items: " + order.items);
        System.out.println("Thank you for shopping with us!");
    }
}