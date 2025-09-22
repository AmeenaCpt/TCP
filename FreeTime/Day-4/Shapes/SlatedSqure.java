public class SlatedSqure {
    public static void draw(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        draw(6);
    }
}
