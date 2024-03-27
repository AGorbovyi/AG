public class lesson32 {

    public static void main(String[] args) {

        //enumerate class
        DayOfWeek day = DayOfWeek.Friday;
        switch (day) {
            case Monday:
                System.out.println("It's Monday.");
                break;
            // To do all other days
            case Friday:
                System.out.println("It's Friday.");
                break;
        }

        // before Java 5.0
        ObjectBox ob1 = new ObjectBox(2);
        ObjectBox ob2 = new ObjectBox(5);
        if (ob1.getObj() instanceof Integer && ob2.getObj() instanceof Integer){
            int s = (int) ob1.getObj() + (int) ob2.getObj();
            System.out.println("s = " + s);
        }
        // after Java 5.0 generics
        GenericBox<Integer> gb1 = new GenericBox<>(7);
        GenericBox<Integer> gb2 = new GenericBox<>(4);
        int s = gb1.getObj() + gb2.getObj();
        System.out.println("s = " + s);

        // RubberArray with generics
        RubberArray<String> rbStrings = new RubberArray<>();
        rbStrings.add("qwer");
        rbStrings.add("asd");
        rbStrings.add("fgfhd");
        System.out.println(rbStrings);

        RubberArray<Float> rbFloat = new RubberArray<>();
        rbFloat.add(5f);
        rbFloat.add(4.2f);
        rbFloat.add(-3f);
        System.out.println(rbFloat);

    }
}
