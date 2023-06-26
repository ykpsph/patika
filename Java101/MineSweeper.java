package Java101;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int columnNumber;


    public MineSweeper(int rowNumber, int columnNumber){
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }

    // Yardimci haritayi yazdir.
    public String[][] printBoard(String[][] board){
        // mayinsiz oyun tahtasini olustur
        for(int i = 0; i < this.rowNumber; i++){
            for(int k = 0; k < this.columnNumber; k++){
                board[i][k] = "-";
            }
        }
        // number of mines
        int numberOfMines = this.rowNumber * this.columnNumber/4;
        System.out.println("Number of mines: "+numberOfMines);

        // rastgele mayin yerlestirirken
        // rastgele row ve column sayisi olustur ve oraya mayin koy.
        // rastgele olusturulan sayi row ve column sinirlari icinde olmalidir.
        // mayin sayisini bir artir.
        while(numberOfMines > 0){
            String[] temp = new String[numberOfMines]; // mayinlarin yerlerini tutacak array

            // olusturulan mayinsiz tahtaya mayinlari ata
            for(int i = 0; i < temp.length; i++){
                boolean isEqual = false;

                int randomRow = (int)(Math.random() * this.rowNumber); // bu row
                int randomColumn = (int)(Math.random() * this.columnNumber); // ve bu column'daki yere mayin koy

                temp[i] = randomRow + "." + randomColumn;

                // mayin koyulacak indexlerin ayni olmamasi icin kontrol
                for(int k = 0; k < i; k++){
                    System.out.println("i:"+ i + " k:"+ k + " temp[i] "+temp[i]+" temp[k] "+temp[k]);
                    if(i != k){
                        if(temp[i].equals(temp[k])){
                            isEqual = true;
                        }
                    }
                }
                if(!isEqual){
                    board[randomRow][randomColumn] = "*";
                    System.out.println("calisti randomRow: " + randomRow+" randomColumn: "+randomColumn);
                    numberOfMines--;
                } else {
                    System.out.println("i--");
                    i--;
                }
            }
        }
        for(int i = 0; i < this.rowNumber; i++){
            for(int k = 0; k < this.columnNumber; k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("< < < < Game is starting > > > >");
        return board;
    }

    // Calculating the surrounding mines
    // Bu metot bir kutunun etrafindaki mayinlarin adedini hesaplar
    public String[][] surroundingMines(String[][] board){
        printBoard(board);
        for(int i = 0; i < this.rowNumber; i++){
            for(int j = 0; j < this.columnNumber; j++){
                int count = 0;
                if(board[i][j] != "*"){
                    if(i == 0 && j == 0){
                        for(int k = i; k <= i + 1; k++){
                            for(int n = j; n <= j + 1; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if(i != 0 && j != 0 && i < board.length - 1 && j < board[0].length - 1){
                        for(int k = i - 1; k <= i + 1; k++){
                            for(int n = j - 1; n <= j + 1; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if (i == 0 && j != 0 && j < board[0].length - 1){
                        for(int k = i; k <= i + 1; k++){
                            for(int n = j - 1; n <= j + 1; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if(i != 0 && j == 0 && i < board.length - 1){
                        for(int k = i - 1; k <= i + 1; k++){
                            for(int n = j; n <= j + 1; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if(i == board.length - 1 && j == board[0].length - 1){
                        for(int k = i - 1; k <= i; k++){
                            for(int n = j - 1; n <= j; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if (i == board.length - 1 && j != board[0].length - 1 && j > 0){
                        for(int k = i - 1; k <= i; k++){
                            for(int n = j - 1; n <= j + 1; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if(i != board.length - 1 && j == board[0].length - 1 && i > 0){
                        for(int k = i - 1; k <= i + 1; k++){
                            for(int n = j - 1; n <= j; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if(i == board.length - 1 && j == 0){
                        for(int k = i - 1; k <= i; k++){
                            for(int n = j; n <= j + 1; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    } else if(i == 0 && j == board[0].length - 1){
                        for(int k = i; k <= i + 1; k++){
                            for(int n = j - 1; n <= j; n++){
                                if(board[k][n] == "*"){
                                    count++;
                                }
                            }
                        }
                    }
                    String c = Integer.toString(count);
                    board[i][j] = c;
                }
            }
        }
        return board;
    }


    // start game
    public void run(){
        Scanner scan = new Scanner(System.in);
        String[][] board = new String[this.rowNumber][this.columnNumber];
        surroundingMines(board);

        String[][] hiddenBoard = new String[this.rowNumber][this.columnNumber];
        for(int i = 0; i < this.rowNumber; i++){
            for(int j = 0; j < this.columnNumber; j++){
                hiddenBoard[i][j] = "-";
            }
        }
        int round = 0 ; // played rounds
        int numberOfMines = this.rowNumber * this.columnNumber / 4;
        int totalRounds = (this.rowNumber * this.columnNumber) - numberOfMines; // highest number of the plays that can be played

        boolean isWin = false;
        boolean isMine = false;

        while(!isWin && !isMine){
            for(int i = 0; i < this.rowNumber; i++){
                for(int j = 0; j < this.columnNumber; j++){
                    System.out.print(hiddenBoard[i][j] + " ");
                }
                System.out.println();
            }

            boolean isWrongInput = false;
            System.out.print("Satir giriniz: ");
            int row = scan.nextInt();

            if(row < 0 || row > this.rowNumber - 1){
                isWrongInput = true;
                while(isWrongInput){
                    System.out.print("Satir giriniz: ");
                    row = scan.nextInt();
                    if(row >= 0 && row < this.rowNumber){
                        isWrongInput = false;
                    }
                }
            }
            System.out.print("\nSutun giriniz: ");
            int column = scan.nextInt();

            if(column < 0 || column > this.columnNumber - 1){
                isWrongInput = true;
                while(isWrongInput){
                    System.out.print("Sutun giriniz: ");
                    column = scan.nextInt();
                    if(column >= 0 && column < this.columnNumber){
                        isWrongInput = false;
                    }
                }
            }
            hiddenBoard[row][column] = board[row][column];
            if(hiddenBoard[row][column] == "*"){
                isMine = true;
                System.out.println("You stepped on a mine! Game OVER !");
                for(int i = 0; i < rowNumber; i++){
                    for(int j = 0; j < columnNumber; j++){
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            round++;
            if(round == totalRounds){ // if played rounds == highest number of the plays player WINs
                isWin = true;
                System.out.println("Congratulations! You WON the game !");
                for(int i = 0; i < rowNumber; i++){
                    for(int j = 0; j < columnNumber; j++){
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            System.out.println("--------------------------------");
        }
        scan.close();
    }
}
