package Arrays;
public class AddTwoStrings {
    public static void main(String[] args) {
        String[] s1={"Apple","Banana"};
        String[] s2={"cat","Dog"};
        int len=s1.length+s2.length;
        String[] temp=new String[len];
        for(int i=0;i<s1.length;i++){
            temp[i]=s1[i];
        }
        for(int i=0;i<s2.length;i++){
            temp[s1.length+i]=s2[i];
        }
        for(int i=0;i<len;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
