public class StoreTest {


    public static void main(String[] args) {
        Category category1 = new Category("Desery", "Smaczne i niedrogie");
        Category category2 = new Category("Napoje", "Przez \'słomkę\' do serca");

        Product product1c1 = new Product("Lody bakaliowe", 29.50, "Bakalie, lody trzech smakach i pyszny wafelek", category1);
        Product product2c1 = new Product("Sernik wiedeński", 35.50, "Podajemy z pyszną kawą", category1);
        Product product3c2 = new Product("Tropikalne smoothie", 20.20, "Smak wakacyjnej przygody", category2);
        Product product4cn = new Product("Fantazja szefa kuchni", 45.0, "Codziennie zaskakuje", null);

        SpecialOffer specialOffer = new SpecialOffer(product2c1, "Danie dnia", "2019-07-08", "2019-07-09", 0.2);

        System.out.println("Dostępne produkty: ");
//        System.out.println("1) Kategoria: " + category1.name + "  " + category1.description);
//        System.out.println("\n - " + product1c1.name + " , cena: " + product1c1.price + "   ,  " + product1c1.description);
        product1c1.showInfo();
//        System.out.println(" - " + product2c1.name + " , cena: " + product2c1.price + "   ,  " + product2c1.description + "\n");
//        System.out.println("2) Kategoria: " + category2.name + "  " + category2.description + "\n");
//        System.out.println(" - " + product3c2.name + " , cena: " + product3c2.price + "   ,  " + product3c2.description + "\n");
        product2c1.showInfo();
        product3c2.showInfo();
//        System.out.println("Kategoria: " + " brak kategorii  " + "\n");
//        System.out.println(" - " + product4cn.name + " , cena: " + product4cn.price + "   ,  " + product4cn.description + "\n");
        product4cn.showInfo();
//        System.out.println(" !!! PROMOCJA !!! " +specialOffer.description + " " + specialOffer.product.name + " , cena: "
//                + (specialOffer.product.price - specialOffer.product.price*specialOffer.discount) + "  !!! ,  "
//                + "oferta od: " + specialOffer.startSaleDate +" do: "+ specialOffer.endSaleDate  + "\n");
        specialOffer.showInfo();

    }
}
