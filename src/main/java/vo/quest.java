package vo;

public class quest {
    public static void main(String[] args) {
        double t = 4.5;

        if(t % 3 ==1){
            System.out.println("зеленый");
        } else if( t % 4 ==1 ) {
            System.out.println("желтый");
        }  else if(t % 5 ==1){
            System.out.println("красный");
        }

    }

}
