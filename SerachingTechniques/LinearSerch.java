package SerachingTechniques;

import java.util.Scanner;

public class LinearSerch {
    public static void search(int[] a,int key){
        int n=a.length;
        boolean isFound=false;
        for(int i=0;i<n;i++){
            if(a[i]==key){
                isFound=true;
            }
        }
        if(isFound==true){
            System.out.println("element found");
        }else{
            System.out.println("Elmenet not found");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        search(a,key);
        sc.close();
    }
}
