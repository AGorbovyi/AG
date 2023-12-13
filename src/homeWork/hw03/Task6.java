package hw03;

// int x = 3
//Чему будет равно значение х после выполнения операции x += x++ ?
//Проверьте свое предположение на практике.
public class Task6 {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;

        x += x++;
        System.out.println(x);

        y += ++y;
        System.out.println(y);
    }
}
