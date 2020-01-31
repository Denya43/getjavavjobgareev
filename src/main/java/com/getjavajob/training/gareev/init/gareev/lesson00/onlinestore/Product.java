package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore;

public class Product {
    private String productName;
    private Double requiredNum;
    private Double price;
    private Double discountSize;
    private String clientID;
    private String clientEmail;
    private String phoneNUmber;
    private String deliveryAddress;

    public Product (String productName, Double requiredNum, Double price, Double discountSize, String clientID, String clientEmail, String phoneNUmber, String deliveryAddress){
        this.productName = productName;
        this.requiredNum =requiredNum;
        this.price = price;
        this.discountSize = discountSize;
        this.clientID = clientID;
        this.clientEmail = clientEmail;
        this.phoneNUmber = phoneNUmber;
        this.deliveryAddress = deliveryAddress;

    }

    public Double getDiscountSize() {
        return discountSize;
    }

    public Double getRequiredNum() {
        return requiredNum;
    }

    public Double getPrice() {
        return price;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public String getClientID() {
        return clientID;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public String getProductName() {
        return productName;
    }

}
