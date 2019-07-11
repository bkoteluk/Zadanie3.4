public class Category {
    String name;
    String description;

    Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    void showInfo() {
        System.out.println("\nKategoria: " + this.name + "  " + this.description);
    }
}
