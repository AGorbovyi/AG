package hw06;
/*Сломанный лифт
        лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.

        Пример:
        Ввод:
        H = 200, N = 50, M = 1
        Ответ: 5
        Объяснение:
        Первый подьем: 50 - 1 = 49
        Второй подьем: 49 + 50 - 1 = 98
        Третий подьем: 98 + 50 - 1 = 147
        Четвертый подьем: 147 + 50 - 1 = 196
        Пятый подьем: выйти за пределы H.

        реализовать метод numberOfLifts(int floor, int stepUp, int stepDown) */

public class Task4Lift {
    public int numberOfLifts(int maxFloor, int stepUp, int stepDown) {
        if (stepUp <= stepDown) {
            System.out.println("Лифт не работает!");
            return -1;
        }
        int currentFloor = 0;
        int numberOfIterations = 0;

        while (currentFloor < maxFloor) {
            currentFloor = currentFloor + stepUp;
            numberOfIterations++;

            if (currentFloor >= maxFloor){
                return numberOfIterations;
            }
            currentFloor = currentFloor - stepDown;
        }

        return numberOfIterations;
    }

}
