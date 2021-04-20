// Circular Array Rotation

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//import java.util.ArrayList;
import java.lang.reflect.Array; 


public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
int arr[]= new int[queries.length];
int l=0;
int n = a.length;
k = k % n;

//System.out.println(k + " lv "+ l + " " + n);
//System.out.println(Arrays.toString(a));

 for(int i=0;i<k;i++){
            int last = a[n-1];
            for(int j= n-1; j > 0; j--){
                a[j] = a[j-1];
            }
            a[0] = last;            
        }
System.out.println(Arrays.toString(a));
for(int res =0; res< queries.length; res++){
    int r = queries[res];
  //  arr[res] = a.charAt(r);
     int x = (int)Array.get(a, r);
     arr[res] = x; 
}
//System.out.println("fa" + Arrays.toString(a));
//System.out.println("farr" +Arrays.toString(arr));

return arr;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
