package lesson43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class lesson43 {
    public static void main(String[] args) {

        try {
            Stream<String> text = Files.lines(Path.of("textfile.txt"));
            text.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("OK");

    }
}
