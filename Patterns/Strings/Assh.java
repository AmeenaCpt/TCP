package Patterns.Strings;
public class Assh{
    public static void reverse(String inpuString){
        String[] words=inpuString.split("");
        String reveString="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String r="";
            char ch;
            
            for(int j=0;j<word.length();j++){
                ch=word.charAt(j);
                r=ch+r;
            }
            reveString=reveString+r+" ";
        }
        
        System.out.println(reveString);
    }
    public static void main(String[] args) {
        reverse("java is Good");
    }
}