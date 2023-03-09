public class Array2D02 {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {3,4}};
        for(int i = 0; i < 2; i++){
            for(int k = 0; k < 2; k++){
                System.out.print("arr["+i+"]" + "["+k+"]" + " = " + arr[i][k]);
                System.out.println();
            }
        }
    }
}
