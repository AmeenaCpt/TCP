package Strings;
public class DuplicatedAddReverse{
    public static void main(String[] args) {
        String s="abab";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    sb.append(s.charAt(j));
                    continue;
                }
            }
            sb.reverse();
        }
        System.out.println(sb);
    }
}
