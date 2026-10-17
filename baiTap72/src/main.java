import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory<Product> inventory = new Inventory<>();
        int luaChon;

        do {
            isMenu();
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1 -> {
                    System.out.print("\nNhập mã sản phẩm: ");
                    String id = scanner.nextLine();

                    System.out.print("Nhập tên Laptop: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập thương hiệu: ");
                    String brand = scanner.nextLine();

                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();

                    inventory.addItem(new Laptop(id, name, price, brand));
                }

                case 2 -> {
                    System.out.print("\nNhập mã sản phẩm: ");
                    String id = scanner.nextLine();

                    System.out.print("Nhập tên áo/quần: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập thương hiệu: ");
                    String size = scanner.nextLine();

                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();

                    inventory.addItem(new Clothing(id, name, price, size));
                }

                case 3 -> {
                    System.out.println("\n========================");
                    System.out.println("|| Danh sách kho tổng ||");
                    System.out.println("========================\n");

                    inventory.displayItem();

                    inventory.calculateValueTax();
                }

                case 4 -> System.out.println("\nĐã thoát!");

                default -> System.out.println("Vui lòng lựa chọn phù hợp!");
            }
        } while (luaChon != 4);
    }

    static void isMenu() {
        System.out.println("\n==================");
        System.out.println("|| Product Java ||");
        System.out.println("==================\n");
        System.out.println("[1] Thêm sản phẩm Laptop mới");
        System.out.println("[2] Thêm sản phẩm thời trang mới");
        System.out.println("[3] Xem danh sách kho hàng");
        System.out.println("[4] Thoát");
        System.out.print("Chọn: ");
    }
}
