package Practice.Day8;

import java.util.ArrayList;

class Challenge18 extends ArrayList<Integer>  {
    public static void main(String[] args) {
        Challenge18 obj=new Challenge18();
        for(int i=10;i<=100;i=i+10){
            obj.add(i);
        }
        System.out.println(obj);
        obj.removeRange(2, 7);
        System.out.println(obj);
        
    }
    
}
