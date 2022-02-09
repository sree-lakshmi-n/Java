// Shows possible moves for bishop, rook, knight , and queen for given position of the chess piece
package com.basics.twodimensionalarrays;

import java.util.Scanner;

public class ChessMoves {
    char[][] data;
    public ChessMoves(char[][] data){
        this.data = data;
    }
    public boolean isValid(int x){
        if(x>=0 && x<=7)
            return true;
        return false;
    }
    public void chessPiecePosition(int x, int y){
        data[x][y] = 'O';
    }
    // Bishop Moves
    public void putBishopPosition(int x, int y){
        data[x][y] = 'B';
    }
    public void bishopMoves(int x, int y){
        for (int i = 0; i < 8; i++) {
            if(x-i>=0 && y-i>=0)
                data[x-i][y-i]='x';
            if(x+i<8 && y+i<8)
                data[x+i][y+i] = 'x';
            if(x-i>=0 && y+i<8)
                data[x-i][y+i] = 'x';
            if(x+i<8 && y-i>=0)
                data[x+i][y-i] = 'x';
        }
    }
    // Rook Moves
    public void putRookPosition(int x, int y){
        data[x][y] = 'R';
    }
    public void rookMoves(int x, int y){
        for (int i = 0; i < 8; i++) {
            data[x][i] = 'x';
            data[i][y] = 'x';
        }
    }
    // Knight Moves
    public void putKnightPosition(int x, int y){
        data[x][y] = 'K';
    }
    public void knightMoves(int x, int y){
        if(x-1>=0){
            if(y+2<8)
                data[x-1][y+2] = 'x';
            if(y-2>=0)
                data[x-1][y-2] = 'x';
        }
        if(x-2>=0){
            if(y-1>=0)
                data[x-2][y-1] = 'x';
            if(y+1<8)
                data[x-2][y+1] = 'x';
        }
        if(x+1<8){
            if(y+2<8)
                data[x+1][y+2] = 'x';
            if(y-2>=0)
                data[x+1][y-2] = 'x';
        }
        if(x+2<8){
            if(y+1<8)
                data[x+2][y+1] = 'x';
            if(y-1>=0)
                data[x+2][y-1] = 'x';
        }
    }
    public void putQueenPosition(int x, int y){
        data[x][y] = 'Q';
    }
    public void reset(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                data[i][j] = '.';
            }
        }
    }
    public void printArr(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ChessMoves cm = new ChessMoves(new char[][]{
                {'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}
        });
        Scanner sc = new Scanner(System.in);
        System.out.println("What should be your chess piece's x-position? (from 0 to 7)");
        int x = sc.nextInt();
        System.out.println("What should be your chess piece's y-position? (from 0 to 7)");
        int y = sc.nextInt();
        if(cm.isValid(x) && cm.isValid(y)){
            System.out.println("Your chess piece on the board \n");
            cm.chessPiecePosition(x,y);
            cm.printArr();
            System.out.println("========================");
            System.out.println("\nBishop Moves \n");
            cm.bishopMoves(x,y);
            cm.putBishopPosition(x,y);
            cm.printArr();
            System.out.println("========================");
            System.out.println("\nRook Moves \n");
            cm.reset();
            cm.rookMoves(x,y);
            cm.putRookPosition(x,y);
            cm.printArr();
            System.out.println("========================");
            System.out.println("\nKnight Moves \n");
            cm.reset();
            cm.knightMoves(x,y);
            cm.putKnightPosition(x,y);
            cm.printArr();
            System.out.println("========================");
            System.out.println("\nQueen Moves \n");
            cm.reset();
            cm.rookMoves(x,y);
            cm.bishopMoves(x,y);
            cm.putQueenPosition(x,y);
            cm.printArr();
        }
        else
            System.out.println("Enter valid inputs");
    }
}
