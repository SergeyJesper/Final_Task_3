import java.util.Scanner;
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
public class FinalTask1 {
    public static void main(String[] arg) {
        int n = 0;
        int counter;
        String bin;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        bin = scan.next();
        for (int i = bin.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (bin.charAt(i) - '0') * j;
        }
        System.out.println("Ваше число в десятичном формате: " + "\"" + bin + "\" -> " + n);
        }
    }
