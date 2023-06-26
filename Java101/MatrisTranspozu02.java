package Java101;

public class MatrisTranspozu02 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}}; // [2][3]
        int[][] temp = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                temp[k][i] = arr[i][k];
            }
            System.out.println();
        }

        for(int i = 0; i < temp.length; i++){
            for(int k = 0; k < temp[i].length; k++){
                System.out.print(temp[i][k]);
            }
            System.out.println();
        }
    }
}
