package lesson43;

public class ExceptionExample3 {
    public static void main(String[] args) {
        String str = null;

        if (str == null) {
            throw new RuntimeException("String 'str' is null");
        }
        System.out.println("Everything is OK");

    }

}
