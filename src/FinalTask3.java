import java.math.*;
import java.util.Scanner;
public class FinalTask3 {
    public static void main(String[] arg) {
        double rub = 0.0, usd = 0.0;
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        System.out.print("1 USD = ");
        usd = in.nextDouble();
          } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка ввода: введите число!");
        }
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите сумму в рублях для конвертации: ");
            System.out.print("Сумма = ");
            rub = in.nextDouble();

        } catch (java.util.InputMismatchException e) {

            System.out.println("Ошибка ввода: введите число!");

        }
        BigDecimal usdsum = new BigDecimal(rub / usd).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Рубли в доллары = " + usdsum);
    }
}
