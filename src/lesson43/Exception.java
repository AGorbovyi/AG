package lesson43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exception {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        String str = null;
        int[] ints = {1, 2, 3};

        try {
            printTextFile("textfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (str == null) {
            throw  new NullPointerException("Str is null");
        }
        System.out.println("Everything is OK");
    }

    private static void printTextFile(String fileName) throws IOException {
        Stream<String> text = Files.lines(Path.of(fileName));
        text.forEach(System.out::println);
    }
}
