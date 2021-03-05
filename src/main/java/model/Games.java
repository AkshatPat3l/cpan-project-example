package model;

public abstract class Games {



    private String name;
    private double price;
    private int quantity;
    private Producer producer;

    public enum Producer{
        UBISOFT, ACTIVISION, TREYARC,NINTENDO, RIOT
    }
    public Games(String name, double price, int quantity, Producer producer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.producer = producer;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Producer getProducer() { return producer; }

    public void setProducer(Producer producer) { this.producer = producer; }
}
