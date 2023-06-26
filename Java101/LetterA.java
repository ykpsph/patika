package Java101;

import java.util.Arrays;

public class LetterA {
    public static void main(String[] args) {
        // i=0 || i=2 --> *
        // j=0 || j=3 --> *
        String[][] letter = new String[6][4];

        for(int i=0; i < letter.length; i++){
            for(int k=0; k < letter[i].length; k++){
                if(i == 0 || i == 2){
                    letter[i][k] = " * ";
                } else if (k == 0 || k == 3) {
                    letter[i][k] = " * ";
                } else {
                    letter[i][k] = "   ";
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
