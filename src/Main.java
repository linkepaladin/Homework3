public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task3() {
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            if (speed < 60) {
                System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
            }
        }
    }
    public static void task4() {
        int age = 1;
        boolean ageBaby = age >= 2 && age <= 6;
        boolean agePupil = age >= 7 && age <= 17;
        boolean ageStudent = age >= 18 && age <= 24;
        boolean ageWorker = age > 24;
        if (ageBaby) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (agePupil) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (ageStudent) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (ageWorker) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        int age = 13;
        boolean age1 = age < 5;
        boolean age2 = age > 5 && age < 14;
        boolean age3 = age > 14;
        if (age1) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционах");
        }
        if (age2) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционах в сопровождении взрослых");
        }
        if (age3) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционах");
        }
    }
}