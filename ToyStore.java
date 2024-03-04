package Store;

public class ToyStore {
    public static void main(String[] args) {
        ToyController toyController = new ToyController();
        ToyView toyView = new ToyView();

        Toy toy1 = new Toy(1, "Teddy Bear", 5);
        Toy toy2 = new Toy(2, "Doll", 3);
        Toy toy3 = new Toy(3, "Race Car", 7);

        toyController.addToy(toy1);
        toyController.addToy(toy2);
        toyController.addToy(toy3);

        Toy winner = toyController.drawToy();
        toyView.displayWinner(winner);
        toyView.saveWinnerToFile(winner);
    }
}
