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

}
