package vo.l8;

import java.io.*;


public class Task704 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < 8; i++)
        {
            list[i] = reader.readLine();
        }

        for (int i = list.length-1; i >=0; i--)
            System.out.println(list[i]);
    }
}
