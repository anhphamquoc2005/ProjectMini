public class Clothing extends Product{

    private String size;

    public Clothing(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.06;
    }

    @Override
    public String toString() {
        String formatted = String.format("%,.0f VNĐ", calculateTax());
        return super.toString() + " | Size: " + size + " | Thuế: " + formatted;
    }
}
