package Lesson_2.PC;

public class PC {
    private String producer;
    private String model;
    private int price;

    public PC() {}

    public PC(String producer, String model, int price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
