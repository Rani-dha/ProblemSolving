// https://www.hackerrank.com/challenges/matrix-rotation-algo/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(int ma[][], int m, int n ,int rot) {
    // Write your code here
    
    int rotCount =1;
    while( rotCount <= rot){
    int l=0,t=0, d = m-1, r = n-1,prev = 0, cur =0;
    while(t<=d && l<= r){
        prev = ma[t+1][r];
        for(int i = r;i >= l;i--){
           cur = ma[t][i];
           ma[t][i] = prev;
           prev = cur; 
        }
        t++;
        
        for(int i=t; i<= d; i++){
            cur = ma[i][l];
            ma[i][l] = prev;
            prev = cur;
        }
        l++;
        
        for(int i=l; i<= r; i++){
            cur = ma[d][i];
            ma[d][i] = prev;
            prev = cur;
        }
        d--;
        
        for(int i=d;i>=t; i--){
            cur = ma[i][r];
            ma[i][r] = prev;
            prev = cur;
        }
        r--;
    }
    rotCount++;
    }
    
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(ma[i][j] + " ");
        }
        System.out.println();
    }


    }

}

public class Solution {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int rot = sc.nextInt();
    int ma[][] = new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n; j++){
            ma[i][j] = sc.nextInt();
        }
    }
   

        Result.matrixRotation(ma,m,n, rot);
    }
}
