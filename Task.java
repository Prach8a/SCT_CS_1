import java.util.*;
class CeasarCipher{
    private final String alp = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    String Cipher(String a,int shift ){

        String h = "";
        for(int i=0; i<a.length(); i++){
            String x = String.valueOf(a.charAt(i));
            if (!x.matches("[a-zA-Z]")){
                h = h+x;
                continue;}
            else{

                boolean m = x.equals(x.toUpperCase());
                x =x.toUpperCase();
                int j = alp.indexOf(x);
                int o = (j+shift)%26;
                String s = String.valueOf(alp.charAt(o));
                if (m){
                    h = h + s;
                }
                else {
                    h = h + s.toLowerCase();
                }

            }}
        return h;
    }
}
public class Task {
    public static void main(String[] args) {
        CeasarCipher c = new CeasarCipher();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string to be ciphered:");
        String d = s.nextLine();
        System.out.println("Enter the shift value:");
        int t = s.nextInt();
        s.nextLine();
        while (true) {
            System.out.println("Do you want to encrypt or decrpyt? (en/de):");
            String f = s.next();
            if (f.equalsIgnoreCase("en")) {
                System.out.println(c.Cipher(d, t));
                break;

            } else if (f.equalsIgnoreCase("de")) {
                System.out.println(c.Cipher(d, 26-t));
                break;
            } else {
                System.out.println("INVALID");
            }
        }
        s.close();
    }
}
