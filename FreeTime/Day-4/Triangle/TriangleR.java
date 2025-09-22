public class TriangleR {
    public static void draw(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        draw(6);
    }
}
