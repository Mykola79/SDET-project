package class11;

public class Example {
    public static void main(String[] args) {
        int[][] matrix={{10, 20, 30},
                        {45, 55, 66},
                        {30, 40, 20, 10, 25}};

        // Write a loop to print all the elements from this 2D array.

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.println(matrix[i][j]+" ");}

            System.out.println();

            }

        }
    }
