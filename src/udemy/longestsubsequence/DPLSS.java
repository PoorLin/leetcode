package udemy.longestsubsequence;

public class DPLSS {
    public static void main(String[] args) {
        String str1 = "ATAACGCGCTGCTCGGGT";
        String str2 = "TCAATCAGGATCCGCTGA";
        dpGetLss(str1,str2);
    }

    public static String dpGetLss(String str1,String str2){
        int str1Len = str1.length(); //y軸 行
        int str2Len = str2.length(); //x軸 列
        int[][] table1 = new int[str1Len+1][str2Len+1];
        String[][] table2 = new String[str1Len+1][str2Len+1];


//        for(int x=0;x<=str1Len;x++){
//            table1[x][0] = 0;
//            t[x][0] = 0;
//        }
//        for(int y=0;y<=str2Len;y++){
//          table1[0][y]=0;
//        }

        for(int x=1;x<=str1Len;x++){

            for(int y=1;y<=str2Len;y++){
                if(str1.charAt(y-1) == str2.charAt(x-1)){
                    table1[x][y] = 1 + table1[x-1][y-1];
                    table2[x][y] = "⬉";
                }else if(table1[x-1][y]>= table1[x][y-1]){
                   table1[x][y] = table1[x-1][y];
                    table2[x][y] = "⭡";
                }else {
                    table1[x][y] = table1[x][y-1];
                    table2[x][y] = "⭠";
                }
            }
        }


        for(int x=0;x<=str1Len;x++){
            for(int y=0;y<=str2Len;y++){
                System.out.print(table1[x][y]+",");

            }
            System.out.println(" ");
        }
        for(int x=0;x<=str1Len;x++){
            for(int y=0;y<=str2Len;y++){
                System.out.print(table2[x][y]+",");

            }
            System.out.println(" ");
        }

        String res = "";
        printLSS(table2,str1Len,str2Len,res,str1);
        System.out.println("res:"+res);



        return "";
    }

    public static void printLSS(String[][] target,int x,int y,String res,String str){

        if(x == 0 || y==0){
            return;
        }

        if(target[x][y].equals("⬉")){

            res+=str.charAt(x-1);
            System.out.println("res:"+res);
            printLSS(target,x-1,y-1,res,str);
        }else if(target[x][y].equals("⭡")){
            System.out.println("⭡");
            printLSS(target,x-1,y,res,str);
        }else {
            System.out.println("⭠");
            printLSS(target,x,y-1,res,str);
        }

    }


}
