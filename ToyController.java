package Store;

import java.util.PriorityQueue;

public class ToyController {
    private PriorityQueue<Toy> toyQueue = new PriorityQueue<>();

    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    public Toy drawToy() {
        Toy winner = toyQueue.poll();
        if (winner != null) {
            winner.setQuantity(winner.getQuantity() - 1);
        }
        return winner;
    }
}