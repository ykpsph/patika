public class Array2D01 {
    public static void main(String[] args) {
        int rows = 9;
        int columns = 9;

        int[][] arr = new int[rows][columns];
        int val = 1;
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < columns; k++){
                arr[i][k] = val;
                val++;
            }
        }
        System.out.println("The 2D array is: ");
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < columns; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        int[][] temp = new int[9][9];
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < columns; k++){
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}