public class LetterB {
    /*

    [0][0]  [0][1]  [0][2]  [0][3]
    [1][0]                  [1][3]
    [2][0]                  [2][3]
    [3][0]  [3][1]  [2][3]  [3][3]
    [4][0]                  [4][3]
    [5][0]                  [5][3]
    [6][0]  [6][1]  [6][2]  [6][3]

 */
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for(int i = 0; i < letter.length; i++){
            for(int k = 0; k < letter[i].length; k++){
                if(i==0 || i==3 || i==6){
                    letter[i][k] = " * ";
                } else if(k==0 || k == 3){
                    letter[i][k] = " * ";
                } else {
                    letter[i][k] = "    ";
                }
            }
        }
        for(String[] row : letter){
            for(String column : row){
                System.out.print(column);
            }
            System.out.println();
        }

    }
}