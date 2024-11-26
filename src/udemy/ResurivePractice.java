package udemy;

public class ResurivePractice {

    public static int getMinus15(int layer){

        if(layer == 1){
            return 10;
        }else {
            return getMinus15(layer-1) +15 ;
        }

    }


    public static void main(String[] args) {

        System.out.println(getMinus15(6));


    }




}
