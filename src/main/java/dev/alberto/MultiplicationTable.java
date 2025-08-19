package dev.alberto;

public class MultiplicationTable {

    private final int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    /**
     * Genera la tabla de multiplicar del número asociado (del 1 al 10).
     * @return un arreglo de Strings con cada línea de la tabla.
     */
    public String[] generateTable() {
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number + " x " + i + " = " + (number * i);
        }
        return table;
    }

   
    public void printTable() {
        for (String line : generateTable()) {
            System.out.println(line);
        }
    }
}
