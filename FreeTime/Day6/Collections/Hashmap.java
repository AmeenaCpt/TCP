package FreeTime.Day6.Collections;

import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Map<Integer> map=new Hashmap();
        for(int i=0;i<n;i++){
            map[a[i]]++;
        }
        int q=sc.nextInt();
        int[] result=new int[q];
        for(int i=0;i<q;i++){
            int num=sc.nextInt();
            result[i]=map[num];
        }
        for(int i=0;i<q;i++){
            System.out.println(result[i]);
        }
    }
}
