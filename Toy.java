package Store;

import java.util.Random;

public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = generateRandomWeight();
    }

    private double generateRandomWeight() {
        Random random = new Random();
        double weight = 10 + random.nextDouble() * 90; // Генерация веса от 10 до 100
        return Math.round(weight * 100.0) / 100.0; // Округление до двух знаков после запятой
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Toy other) {
        return Double.compare(other.getWeight(), this.getWeight());
    }
}