import java.util.Random;

public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        Random rand = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = rand.nextInt(256);
            }
        }

        printColors(colors);

        System.out.println("------------");

        int[][] rotatedColors90 = new int[SIZE][SIZE];
        rotatedColors90 = turnColors90(colors);
        printColors(rotatedColors90);

        System.out.println("------------");

        int[][] rotatedColors180 = new int[SIZE][SIZE];
        rotatedColors180 = turnColors180(colors);
        printColors(rotatedColors180);

        System.out.println("------------");

        int[][] rotatedColors270 = new int[SIZE][SIZE];
        rotatedColors270 = turnColors270(colors);
        printColors(rotatedColors270);
    }

    public static void printColors(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] turnColors90(int[][] colors) {
        int[][] rotatedColors = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - 1 - j][i];
            }
        }

        return rotatedColors;
    }

    public static int[][] turnColors180(int[][] colors) {
        int[][] rotatedColors90 = new int[SIZE][SIZE];
        rotatedColors90 = turnColors90(colors);
        int[][] rotatedColors180 = turnColors90(rotatedColors90);

        return rotatedColors180;
    }

    public static int[][] turnColors270(int[][] colors) {
        int[][] rotatedColors180 = new int[SIZE][SIZE];
        rotatedColors180 = turnColors180(colors);
        int[][] rotatedColors270 = turnColors90(rotatedColors180);

        return rotatedColors270;
    }


}