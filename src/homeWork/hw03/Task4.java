package hw03;
public class Task4 {
    public static void main(String[] args) {

        Task4Util util4 = new Task4Util();

        double tempMonday = 19.9;
        double tempTuesday = 20.9;
        double tempWednesday = 16.1;
        double tempThursday = 17.9;
        double tempFriday = 19.0;
        double tempSaturday = 19.9;
        double tempSunday = 21.3;

        double avarageTemp = (tempMonday + tempTuesday + tempWednesday + tempThursday + tempFriday + tempSaturday + tempSunday);

        System.out.println("Avarage temp: " + avarageTemp);

        System.out.println("Average temp: " +
                util4.avarageTemp(
                        tempMonday,
                        tempTuesday,
                        tempWednesday,
                        tempThursday,
                        tempFriday,
                        tempSaturday,
                        tempSunday
                ));
    }

}
