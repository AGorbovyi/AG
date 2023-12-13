package hw07;

public class Task2 {

    public int multiplication(int n){
        int result = 0;
        int i = 0;
        while (i < n){
            result = i * n;
            System.out.print(result + ",");
            i++;
        }

        return result;
    }
}
