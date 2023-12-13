package lesson08.arrays;

import java.util.Arrays;

public class ExampleArrays2 {
    public static void main(String[] args){
        int[][] twoDimArray = new int[3][4];

        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 4;

        twoDimArray[1][0] = 5;
        twoDimArray[1][1] = 6;
        twoDimArray[1][2] = 7;
        twoDimArray[1][3] = 8;

        twoDimArray[2][0] = 9;
        twoDimArray[2][1] = 10;
        twoDimArray[2][2] = 11;
        twoDimArray[2][3] = 12;

        System.out.println(Arrays.toString(twoDimArray));
    }
}
