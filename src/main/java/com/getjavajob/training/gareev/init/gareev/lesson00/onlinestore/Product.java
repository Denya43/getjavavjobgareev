package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.onlinestore;

public class Product {
    @FieldDescription("Наименование продукта")
    private String productName;
    @FieldDescription("Количество продукта")
    private Double requiredNum;
    @FieldDescription("Цена продукта")
    private Double price;
    @FieldDescription("Скидка на продукт")
    private Double discountSize;
    @FieldDescription("ID клиента")
    private String clientID;
    @FieldDescription("Email клиента")
    private String clientEmail;
    @FieldDescription("Телефонный номер клиента")
    private String phoneNUmber;
    @FieldDescription("Адрес доставки")
    private String deliveryAddress;
    @FieldDescription("Дата доставки")
    private String deliveryDate;
    @FieldDescription("Доступное количесто товара")
    private Double availiableNum;

    public Product (String productName, Double requiredNum, Double price, Double discountSize, String clientID,
                    String clientEmail, String phoneNUmber, String deliveryAddress, String deliveryDate, Double availiableNum){
        this.productName = productName;
        this.requiredNum =requiredNum;
        this.price = price;
        this.discountSize = discountSize;
        this.clientID = clientID;
        this.clientEmail = clientEmail;
        this.phoneNUmber = phoneNUmber;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.availiableNum = availiableNum;

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

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public Double getAvailiableNum() {
        return availiableNum;
    }
}
