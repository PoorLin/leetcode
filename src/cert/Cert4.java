package cert;

public class Cert4 {
    static String prefix = " myName is :";
    private String name = "name";

    public static String getName(){
        return new Cert4().name;
    }

    public static void main(String[] args) {
        System.out.println(Cert4.prefix+Cert4.getName());
        System.out.println(new Cert4().prefix+new Cert4().name);
    }
}
