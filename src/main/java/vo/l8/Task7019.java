package vo.l8;

import java.io.*;
import java.util.*;

public class Task7019 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>() ;


        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(Integer.valueOf(s));
        }

        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }
    }
}
