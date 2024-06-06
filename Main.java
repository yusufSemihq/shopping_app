import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void displayItems() {
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    public Product[] getItems() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getItems'");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Ürünlerin oluşturulması
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 599.99);
        Product headphones = new Product("Headphones", 99.99);

        // Sepete ürün eklenmesi
        cart.addItem(laptop);
        cart.addItem(phone);
        cart.addItem(headphones);

        // Sepetin gösterilmesi
        System.out.println("Sepetinizdeki Ürünler:");
        cart.displayItems();

        // Toplam fiyatın hesaplanması
        double totalPrice = 0;
        for (Product item : cart.getItems()) {
            totalPrice += item.getPrice();
        }
        System.out.println("Toplam Fiyat: ₺" + totalPrice);

        scanner.close();
    }
}
