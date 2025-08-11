package Arrays;
public class AddTwoArrays {
    public static void main(String[] args) {
        int[] s1={1,2,3,4,5};
        int[] s2={6,7,8,9,10};
        int len=s1.length+s2.length;
        int[] temp=new int[len];
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
