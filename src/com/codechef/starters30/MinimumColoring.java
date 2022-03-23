// Minimum Coloring
// https://www.codechef.com/START30D/problems/MINCOLOR

package com.codechef.starters30;

import java.util.Scanner;

public class MinimumColoring {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                int[][] matrix = new int[n][m];
                /*
                * 2 cases:-
                * - Chess like
                * If the two given boxes are not in diagonal of each other, the whole grid can be filled with just these two colors just like a chess board. => Min no. of colors = 2
                * - Non Chess like
                * If the two given boxes are such that they aren't chess like, ignore the second color box and fill the grid with just color 1 and color 2. => Min no. of colors = 3
                * */
                /*
                * Parity of a tile = its row num + col num
                * If parities of given two tiles are diff (ie, if one is odd and other is even or vice versa), then it's chess like.
                * */
                boolean chessLike = (x1+y1)%2 != (x2+y2)%2;
                x1--;
                y1--;
                x2--;
                y2--;
                matrix[x1][y1] = 1;
                matrix[x2][y2] = 2;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        if((j == x1 && k == y1) || (j == x2 && k == y2))
                            continue;
                        if((x1+y1)%2 == (j+k)%2)
                            matrix[j][k] = 1;
                        else
                            matrix[j][k] = chessLike?2:3;
                    }
                }
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        System.out.print(matrix[j][k] + " ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}