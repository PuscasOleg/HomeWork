import java.util.Set;

public class Ex_3_12 {
    public static void main(String[] args) {

        Invoice productFirst = new Invoice("3", "SoloGuitarFender", 5, 15000);
        System.out.println(productFirst.getDescription() + " " + productFirst.getPartNumber() + " " + productFirst.getPrice() + " " + productFirst.getQuantity());
        Invoice productSecond = new Invoice("2", "BassGuitarFender", 2, 20000);
        System.out.println(productSecond.getDescription() + " " + productSecond.getPartNumber() + " " + productSecond.getPrice() + " " + productSecond.getQuantity());

        productFirst.setDescription("Apple");
        productFirst.setQuantity(3);
        productFirst.setPartNumber("2");
        productFirst.setPrice(15000);
        System.out.println(productFirst.getDescription() + " " + productFirst.getPartNumber() + " " + productFirst.getPrice() + " " + productFirst.getQuantity());
        double x= productFirst.getInvoiceAmount();
        System.out.println("Test"+x);


    }
}


class Invoice {


    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;

        if (price > 0.0) {
            this.price = price;
        }
        if (quantity > 0.0) {
            this.quantity = quantity;
        }
    }

    //---------------------------------------------------------------------
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    //-------------------------------------------------------------------
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //--------------------------------------------------------------------------
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //---------------------------------------------------------------------------
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount() {


        if (quantity < 0) {
            quantity = 0;

        }
        if (price < 0) {
            price = 0.0;

        }
        return price * quantity;

    }


}

