public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        byte days = 3;
        byte mins = 20;
        int bottleMin = bottlePerMin * mins;
        int bottleMinDay = bottlePerMin * minDay;
        int bottleMinDays = bottlePerMin * minDay * days;
        int bottleMinMonth = bottlePerMin * minMonth;
        System.out.println("За двадцать минут машина произвела " + bottleMin + " штук бутылок");
        System.out.println("За один день машина произвела " + bottleMinDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottleMinDays + " штук бутылок");
        System.out.println("За один месяц машина произвела " + bottleMinMonth + " штук бутылок");
    }
    public static void task5() {
        byte jarAll = 120;
        byte jarWhiteClass = 2;
        byte jarBrownClass = 4;
        int classAll = jarAll / (jarWhiteClass + jarBrownClass);
        int jarWhite = classAll * jarWhiteClass;
        int jarBrown = classAll * jarBrownClass;
        System.out.println("В школе, где " + classAll + " классов, нужно " + jarWhite + " банок белой краски и " +
                jarBrown + " банок коричневой краски.");
    }
    public static void task6() {
        byte banana1 = 80;
        byte milk100 = 105;
        byte icecream1 = 100;
        byte egg1 = 70;
        int breakfastGr = 5 * banana1 + 2 * milk100 + 2 * icecream1 + 4 * egg1;
        System.out.println("Вес завтрака составляет " + breakfastGr + " граммов");
        float grPerKg = 1000.000f;
        float kgPerBreakfast = breakfastGr / grPerKg;
        System.out.println("Вес завтрака составляет " + kgPerBreakfast + " килограмм");
    }
}