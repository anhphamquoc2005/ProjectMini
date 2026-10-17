import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public int getSize() {
        return items.size();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("\n" + item.getName() + " đã được thêm vào kho.\n");
    }

    public void displayItem() {
        if (items.isEmpty()) {
            System.out.println("\nKho hàng đang trống.\n");
            return;
        }

        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + items.get(i).toString());
        }
    }

    public void calculateValueTax() {
        double total = 0;

        for (T item : items) {
            total += item.getPrice() + item.calculateTax();
        }

        if (!items.isEmpty()) {
            System.out.printf("Tổng giá trị kho hàng: %,.0f VNĐ\n", total);
        }
    }
}
