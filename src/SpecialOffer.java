public class SpecialOffer {
    Product product;
    String description;
    String startSaleDate;
    String endSaleDate;
    double discount;

    SpecialOffer(Product product, String description, String startSaleDate, String endSaleDate, double discount) {
        this.product = product;
        this.description = description;
        this.startSaleDate = startSaleDate;
        this.endSaleDate = endSaleDate;
        this.discount = discount;
    }
    void showInfo() {
        System.out.println("\n !!! PROMOCJA !!! " + this.description + " " + this.product.name + " , cena: "
                + (this.product.price - this.product.price*this.discount) + "  !!! ,  "
                + "oferta od: " + this.startSaleDate +" do: "+ this.endSaleDate  + "\n");
    }
}
