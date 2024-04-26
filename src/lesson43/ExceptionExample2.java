package lesson43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        String str = null;
        int[] ints = {1, 2, 3};


// посенять idx = 2, чтобы не было ошибки
        int idx = 3;
        try {
            ints[idx] = 5;
            System.out.println(ints[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }

    }

}
