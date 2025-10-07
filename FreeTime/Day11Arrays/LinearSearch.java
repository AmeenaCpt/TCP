package FreeTime.Day11Arrays;

public class LinearSearch {
    public static void search(int[] a,int key){
        boolean isFound=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                isFound=true;
            }
        }
        if(isFound){
            System.out.println("Elemnt found");
        }else{
            System.out.println("Element Not found");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int key=0;
        search(a,key);
    }
}
