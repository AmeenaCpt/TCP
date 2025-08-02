package Strings;

public class practice2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abab");
        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(i);
                }
            }
            sb.reverse();
        }
        System.out.println(sb);
    }
}
