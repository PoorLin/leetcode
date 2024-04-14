package med;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        // 最後一個目錄沒有/
        String[] divStr = path.split("/");
        String[] newStr = new String[divStr.length];
        String[] resStr = new String[divStr.length];
        int now = 0;
        for( String nowStr :divStr){
            if("".equals(nowStr)){

            }else if(".".equals(nowStr)){

            }else if("..".equals(nowStr)){
                newStr[now] = "..";
                now++;

            }else {
                newStr[now] = nowStr;
                now++;
            }
        }
        if(now == 0){
            return "/";
        }
        int nowRes = -1;
        for(int index = 0; index<now;index++){
            if("..".equals(newStr[index])){
                if(nowRes ==-1){

                }else {
                    resStr[nowRes] =null;
                    nowRes--;
                }

            }else {
                nowRes++;
                resStr[nowRes] = newStr[index];

            }

        }

        if(nowRes == -1){
            return "/";
        }
        StringBuffer stringBuffer=new StringBuffer();


        for(int index=0;index<=nowRes;index++){
            stringBuffer.append("/");
            stringBuffer.append(resStr[index]);

        }


        return stringBuffer.toString();
    }
}
