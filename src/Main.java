public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        byte a = 10;
        short b = 1027;
        int c = -123456;
        long d = -4_287_356L;
        float e = 5.83f;
        double f = 16.23856712;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    public static void task2() {
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 567;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3() {
        byte lpClass = 23;
        byte asClass = 27;
        byte eaClass = 30;
        short paper = 480;
        int listPupil = paper / (lpClass + asClass + eaClass);
        System.out.println("На каждого ученика рассчитано " + listPupil + " листов бумаги");
    }
    public static void task4() {
        byte bottle = 16;
        byte min = 2;
        int bottlePerMin = bottle / min;
        int minDay = 60 * 24;
        int minMonth = minDay * 30;
        int bottleMin20 = bottlePerMin * 20;
        int bottleMinDay = bottlePerMin * minDay;
        int bottleMinDay3 = bottlePerMin * minDay * 3;
        int bottleMinMonth = bottlePerMin * minMonth;
        System.out.println("За двадцать минут машина произвела " + bottleMin20 + " штук бутылок");
        System.out.println("За один день машина произвела " + bottleMinDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottleMinDay3 + " штук бутылок");
        System.out.println("За один месяц машина произвела " + bottleMinMonth + " штук бутылок");
    }
}