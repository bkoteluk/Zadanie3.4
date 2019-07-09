public class StoreTest {
    public static void main(String[] args) {
        Category category1 = new Category("Desery", "Smaczne i niedrogie");
        Category category2 = new Category("Napoje", "Przez \'słomkę\' do serca");

        Product product1c1 = new Product("Lody bakaliowe", 29.50, "Bakalie, lody trzech smakach i pyszny wafelek", category1);
        Product product2c1 = new Product("Sernik wiedeński", 35.50, "Podajemy z pyszną kawą", category1);
        Product product3c2 = new Product("Tropikalne smoothie", 20.20, "Smak wakacyjnej przygody", category2);
        Product product4cn = new Product("Fantazja szefa kuchni", 45.0, "Codziennie zaskakuje", null);

        SpecialOffer specialOffer = new SpecialOffer(product2c1, "Danie dnia", "2019-07-08", "2019-07-09", 0.2);
    }
}
