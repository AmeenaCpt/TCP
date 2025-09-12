import java.util.Scanner;
public class Reverse {
        public static String reverse(String s){
            StringBuilder sb=new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev=reverse(s);
        System.out.println(rev);
        sc.close();
        
    }
}

