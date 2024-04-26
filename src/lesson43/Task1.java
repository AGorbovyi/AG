package lesson43;

public class Task1 {
    public static void main(String[] args) {
        // test1: normal
        // test2: bad size
        // test3: bad data


    }
    static int calculateArray(String[][] matrix) {
        int sumMatrix = 0;
        // check matrix size
        if (matrix.length > 4) {
            throw new MyArraySizeException("matrix.length > 4");
        }
        for (String[] rowMatrix : matrix) {
            if (rowMatrix.length > 4) {
                throw new MyArraySizeException("matrix.row > 4");
            }
        }
        // calculate matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                String element = matrix[row][column];
                // convert String into int
                // and increment sumMatrix
                try {
                    sumMatrix += Integer.valueOf(element);
                } catch (NumberFormatException e){
                    throw new MyArraySizeException("row: " + row + ", column: " + column + ", bad element:" + element);
                }
            }
        }
        return sumMatrix;
    }
}
