package Java101;

public class Matrix02 {
    public static void main(String[] args) {
        int[][] matrix = new int [3][4];
        int num = 1;

        for(int i = 0; i < matrix.length; i++){
            int[] row = matrix[i];
            for(int j = 0; j < row.length; j++){
                row[j] = num;
                num++;
                if(j % 4 == 0){
                    System.out.println();
                }
                System.out.print(" | " + matrix[i][j] + " | ");
            }
        }
    }
}
