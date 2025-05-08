public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Человек не достиг совершеннолетия, надо немного подождать");
        }
    }
    public static void  task2() {
        int temp = 3;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
    }
}