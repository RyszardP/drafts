package vo.l8;

import java.io.*;
import java.util.ArrayList;

public class Task706 {

    private static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) strings.add(i, reader.readLine());

        for (int a = 0; a < strings.size(); a++) {
            int yes = 0;
            for (int b = 0; b < strings.size(); b++) if (strings.get(a).length() >= strings.get(b).length()) yes++;
            if (yes == 5) System.out.println(strings.get(a));

        }
    }
}
