public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Человек не достиг совершеннолетия, надо немного подождать");
        }
    }
}