//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            for (int i = 1; i <= 10; i++ ) {
                System.out.println("Целое число " + i);
            }
        }{
            System.out.println("");
            System.out.println("Задача 2");
            for (int i = 10; i > 0; i--) {
                System.out.println("Целое число " + i);
            }
        }{
            System.out.println("");
            System.out.println("Задача 3");
            for (int i = 0; i < 17; i += 2) {
                System.out.println("Четное число " + i);
            }
        }{
            System.out.println("");
            System.out.println("Задача 4");
            for (int i = 10; i >= -10; i --) {
                System.out.println(i);
            }
        }{
            System.out.println("");
            System.out.println("Задача 5");
            for (int i = 1904; i <= 2096; i +=4) {
                System.out.println(i + " високосный год");
            }
        }{
            System.out.println("");
            System.out.println("Задача 6");
            for (int i = 7; i < 100; i += 7) {
                System.out.println(i);
            }
        }{
            System.out.println("");
            System.out.println("Задача 7");
            for (int i = 1; i < 1000; i*=2) {
                System.out.println(i);
            }
        }{
            System.out.println("");
            System.out.println("Задача 8");
            int attachment = 29000;
            int total = 0;
            for (int i = 0; i <= 12; i ++) {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
                total = attachment + total;
            }
        }{
            System.out.println("");
            System.out.println("Задача 9");
            int attachment = 29000;
            int total = 0;
            for (int i = 0; i <= 12; i ++) {
                total = total/100 + total + attachment;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
        {
            System.out.println("");
            System.out.println("Задача 10");
            for (int i = 1; i <= 10; i ++) {
                System.out.println("2*" + i + "=" + (i * 2));
        }
        }
    }
}