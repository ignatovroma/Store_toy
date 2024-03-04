package Store;

import java.io.FileWriter;
import java.io.IOException;

public class ToyView {
    public void displayWinner(Toy toy) {
        if (toy != null) {
            System.out.println("Выигрышная игрушка: " + toy.getName() + "\n" +"Вероятность выигрыша: " + toy.getWeight() + "%");
            System.out.println("Оставшееся количество игрушек: " + toy.getQuantity());
        } else {
            System.out.println("No toys left to draw.");
        }
    }

    public void saveWinnerToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("src\\Variant_5\\prize.txt", true)) {
            writer.write("Выигрыш: " + toy.getName() + "\n");
            writer.write("Оставшееся количество игрушек: " + toy.getQuantity() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
