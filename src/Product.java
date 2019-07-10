public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    void showInfo() {
        if (this.category != null) {
            System.out.println("\nKategoria: " + this.category.name + "  " + this.category.description);
        }
        else  {
            System.out.println("\nKategoria: " + " brak kategorii  ");
        }
        System.out.println(" - " + this.name + " , cena: " + this.price + "   ,  " + this.description);
    }
}
