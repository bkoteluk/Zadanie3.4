public class SpecialOffer {
    Product product;
    String description;
    String startOffer;
    String endOffer;
    double discount;

    SpecialOffer(Product product, String description, String startOffer, String endOffer, double discount) {
        this.product = product;
        this.description = description;
        this.startOffer = startOffer;
        this.endOffer = endOffer;
        this.discount = discount;
    }

}
