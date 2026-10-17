import java.text.DecimalFormat;

public abstract class Product implements Taxable{
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String formatted = String.format("%,.0f", price);

        return "Mã sản phẩm: " + id + " | Tên sản phẩm: " + name + " | Giá sản phẩm (chưa bao gồm thuế): " + formatted + " VNĐ";
    }
}
