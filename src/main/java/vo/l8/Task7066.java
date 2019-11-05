package vo.l8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task7066 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] data = new int[15];

        for (int i = 0; i < data.length; i++)
        {
            String s = reader.readLine();
            data[i] = Integer.parseInt(s);
        }

        ArrayList<Integer> list = new ArrayList<Integer> ();
        for (int i = 0; i < data.length; i++)
            list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }


    }

}
