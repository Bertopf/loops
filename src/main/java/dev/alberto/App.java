package dev.alberto;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Main.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable(5);
        table.printTable();
    }
}
