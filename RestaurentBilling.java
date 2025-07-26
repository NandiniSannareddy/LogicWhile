class FoodItem {
    int itemId;
    String itemName;
    double unitPrice;
    int quantity;

    FoodItem(int itemId, String itemName, double unitPrice, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    double calculateBill() {
        double Subtotal = quantity * unitPrice;
        double gst = 0.5 * Subtotal;
        double total = Subtotal + gst;
        if (total > 1000) {
            total -= 0.1 * total;
        }
        return total;
    }

    void displayDetails() {
        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);

    }

}

class DineIn extends FoodItem {
    double service;

    DineIn(int itemId, String itemName, double unitPrice, int quantity, double service) {
        super(itemId, itemName, unitPrice, quantity);
        this.service = service;
    }

    @Override
    double calculateBill() {
        double Subtotal = quantity * unitPrice;
        double totalbeforegst = Subtotal + service;
        double gst = 0.5 * totalbeforegst;
        double total = totalbeforegst + gst;
        if (total > 1000) {
            total -= 0.1 * total;
        }
        return total;
    }

    void displayDetails() {
        double Subtotal = quantity * unitPrice;
        double totalbeforegst = Subtotal + service;
        double gst = 0.5 * totalbeforegst;
        double total = totalbeforegst + gst;
        double dis = 0;
        if (total > 1000) {
            dis = 0.1 * total;
            total -= dis;
        }
        super.displayDetails();
        System.out.println("Service charge: " + service);
        System.out.println("Subtotal: " + Subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Total Bill: " + total);

    }

}

class Takeaway extends FoodItem {
    double packingCharge;

    Takeaway(int itemId, String itemName, double unitPrice, int quantity, double charge) {
        super(itemId, itemName, unitPrice, quantity);
        packingCharge = charge;
    }

    @Override
    double calculateBill() {
        double Subtotal = quantity * unitPrice;
        double totalbeforegst = Subtotal + packingCharge;
        double gst = 0.5 * totalbeforegst;
        double total = totalbeforegst + gst;
        if (total > 1000) {
            total -= 0.1 * total;
        }
        return total;
    }

    void displayDetails() {
        double Subtotal = quantity * unitPrice;
        double totalbeforegst = Subtotal + packingCharge;
        double gst = 0.5 * totalbeforegst;
        double total = totalbeforegst + gst;
        double dis = 0;
        if (total > 1000) {
            dis = 0.1 * total;
            total -= dis;
        }
        super.displayDetails();
        System.out.println("packing charge: " + packingCharge);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Final Total: " + total);

    }

}

class Delivery extends FoodItem {
    double deliveryFee;

    Delivery(int itemId, String itemName, double unitPrice, int quantity, double fee) {
        super(itemId, itemName, unitPrice, quantity);
        deliveryFee = fee;
    }

    @Override
    double calculateBill() {
        double Subtotal = quantity * unitPrice;
        double totalbeforegst = Subtotal + deliveryFee;
        double gst = 0.5 * totalbeforegst;
        double total = totalbeforegst + gst;
        if (total > 1000) {
            total -= 0.1 * total;
        }
        return total;
    }

    void displayDetails() {
        double Subtotal = quantity * unitPrice;
        double totalbeforegst = Subtotal + deliveryFee;
        double gst = 0.5 * totalbeforegst;
        double total = totalbeforegst + gst;
        double dis = 0;
        if (total > 1000) {
            dis = 0.1 * total;
            total -= dis;
        }
        super.displayDetails();
        System.out.println("packing charge: " + deliveryFee);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + dis);
        System.out.println("Final bill: " + total);

    }

}

public class RestaurentBilling {
    public static void main(String[] args) {
        FoodItem f;
        f = new DineIn(101, "Paneer Butter Masala", 250, 4, 50);
        f.displayDetails();

        f = new Takeaway(102, "Veg Biryani", 180.0, 2, 20.0);
        f.displayDetails();

        f = new Delivery(103, "Chicken Pizza", 300, 4, 40);
        f.displayDetails();
    }
}
