public class Laptop extends Product{
    private String brand;

    public Laptop(String id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;
    }

    @Override
    public String toString() {
        String formatted = String.format("%,.0f VNĐ", calculateTax());
        return super.toString() + " | Brand: " + brand + " | Thuế: " + formatted;
    }
}
