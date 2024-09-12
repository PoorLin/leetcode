public class Main {
    public static void main(String[] args) {
        //Loop1
        int tar = 5;
//        for(int a = 1;a<tar+1;a++){
//
//            for(int b =1 ; b<tar+1;b++){
//                if( b <= a){
//                    System.out.print("*");
//                }else {
//                    break;
//                }
//
//            }
//            System.out.println("");
//        }

        //Loop2
//        for(int a = 1;a<tar+1;a++){
//
//            for(int b =1 ; b<tar+1;b++){
//                if( b >= a){
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println("");
//        }
        //Loop3
//        for(int a = 1;a<tar+1;a++){
//
//            for(int b =tar ; b>=1;b--){
//                if( b > a ){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }
        //Loop4

//        for(int a = 1;a<tar+1;a++){
//
//            for(int b =tar ; b>=1;b--){
//                if( b > a ){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//                        for(int b =1 ; b<tar;b++){
//                if( b < a){
//                    System.out.print("*");
//                }else {
//                    break;
//                }
//
//            }
//            System.out.println("");
//        }
        //Loop5
//        for(int a = 1;a<tar+1;a++){
//   for (int b = 1;b<tar+1;b++){
//       if(a-b<=0){
//           System.out.print("*");
//       }else {
//           System.out.print(" ");
//       }
//   }
//            System.out.println("");
//        }
        //Loop6
//
//                for(int a = 1;a<tar+1;a++){
//   for (int b = 1;b<tar+1;b++){
//       if(a-b<=0){
//           System.out.print("*");
//       }else {
//           System.out.print(" ");
//       }
//   }
//   for(int b =1 ; b<tar;b++){
//                if( b >= a){
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }
                //Loop7


//        for(int a = 1;a<tar+1;a++){
//
//            for(int b =tar ; b>=1;b--){
//                if( b > a ){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//                        for(int b =1 ; b<tar;b++){
//                if( b < a){
//                    System.out.print("*");
//                }else {
//                    break;
//                }
//
//            }
//            System.out.println("");
//        }

//        for(int a = 1;a<tar;a++){
//            for (int b = 1;b<tar;b++){
//                if(a-b<0){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            for(int b =1 ; b<tar;b++){
//                if( b >= a){
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }


        // Forbinashi
//        int tarF=1000;
//        if(tarF == 0){
//            System.out.println("0");
//        } else if (tarF == 1) {
//            System.out.println("0,1");
//        }
//        int num1 =0;
//        boolean sw1 = true;
//        int num2 =1;
//        boolean sw2 = false;
//        int nextVal =1;
//        StringBuffer sb = new StringBuffer("0,1");
//        while (tarF>nextVal){
//            sb.append(","+nextVal);
//            if(sw1){
//                num1 =nextVal;
//                sw1 = false;
//                sw2 = true;
//            } else if (sw2) {
//                num2 = nextVal;
//                sw2 = false;
//                sw1 = true;
//            }
//            nextVal = num1+num2;
//        }
//        System.out.println(sb);

        int xNum = 1000;
        StringBuffer sb = new StringBuffer();
        if(xNum ==2){
            sb.append("2");
        } else if (xNum>2) {
            sb.append("2,");
            for(int target = 3;target<=xNum; target++) {

                if(target%2 == 0){
                    continue;
                }else {
                    boolean isXnum =true;
                    for (int jud = 2;jud <=target-1;jud++) {
                      if(target%jud ==0){
                          isXnum=false;
                          break;
                      }
                    }
                    if(isXnum){
                        sb.append(target+",");
                    }

                }

            }

        }else{
                sb.append("沒有質數");
            }
        sb.deleteCharAt(sb.length()-1);

        int front = 0;
        int back = 80;
        while (sb.length()>back){
            System.out.println(sb.subSequence(front,back));
            front+=80;
            back+=80;
        }







      }







//        int a=19,b=2,c=3;
//        Outer:
//        do{
//            System.out.println(1);
//            do{
//                System.out.println(2);
//                if(a>10){
//                    break Outer; //這樣可以跳離Outer這個迴圈
//                }
//                System.out.println(3);
//            }while(b>10);
//            System.out.println(4);
//        }while(c>10);
//        System.out.println(5);

}