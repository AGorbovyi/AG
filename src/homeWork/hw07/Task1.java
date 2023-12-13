package hw07;

public class Task1 {
    public int pow(int number, int pow){
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * number;
        }
        return result;
    }
}
