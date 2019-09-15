import java.util.Arrays;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] arg) {
        int arr = 0;
        int counter, counter_j, var = 0;
        double temp;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите желаемый размер массива: ");
        arr = in.nextInt();

        double array[] = new double[arr];
        for (counter = 0; counter < arr; counter++) {
            Scanner on = new Scanner(System.in);
            var = counter + 1;
            System.out.print("Введите ( " + var + ") элемент массива: ");
            array[counter] = in.nextDouble();
        }
        //Sort
        int x = 0;
        int y = arr - 1;

        do {

            for (counter = x; counter < y; counter++) {

                if (array[counter] > array[counter + 1]) {
                    temp = array[counter];
                    array[counter] = array[counter + 1];
                    array[counter + 1] = temp;
                }

            }
            y--;
            for (counter = y; x < counter; counter--) {

                if (array[counter] < array[counter - 1]) {
                    temp = array[counter];
                    array[counter] = array[counter - 1];
                    array[counter - 1] = temp;
                }
            }
            x++;
        }
        while (x < y);
        //Вывод консоль
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
