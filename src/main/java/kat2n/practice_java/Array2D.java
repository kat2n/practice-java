package main.java.kat2n.practice_java;

public class Array2D {
    public static void main(String[] args) {
        int[][] list = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j]);
            }
            System.out.print("\n");
        }
    }
}
