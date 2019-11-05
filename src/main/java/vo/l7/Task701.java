package vo.l7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task701 {



/*
Массивный максимум
*/


    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++)
        {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max= 0;
        for (int i = 0; i < array.length; i++) {
            if(max <= array[i]){
                max=array[i];

            }
        }
        return max;
    }
}

