public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}