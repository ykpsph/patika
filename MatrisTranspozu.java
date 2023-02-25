public class MatrisTranspozu {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6}}; //[2][3]
        int[][] temp = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                temp[k][i] = arr[i][k];
            }
        }

//        for(int[] row : temp){
//            for(int column : row){
//                System.out.print(column+" ");
//            }
//            System.out.println();
//        }
        for(int i = 0; i < temp.length; i++){
            for(int k = 0; k < temp[i].length; k++){
                System.out.print(temp[i][k] + " ");
            }
            System.out.println();
        }
    }
}


/*

[2][3] ----> [3][2]
1 2 3        1  4
4 5 6        2  5
             3  6
 */