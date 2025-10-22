package FreeTime.Day15;

import Arrays.reverse;
import Patterns.BasicPrograms.swap;

public class Permutation {
    public static void nextPermutation(int[] a){
        int n=a.length;
        int i=n-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(a[j]<=a[i]){
                j--;
            }
            swap(a,i,j);
        }
        reverse(a,i,n-1);
    }
    private static  void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    private static void reverse(int[] a,int start,int end){
        while(start < end){
            swap(a, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        nextPermutation(a);
        System.out.println(a);

    }
}