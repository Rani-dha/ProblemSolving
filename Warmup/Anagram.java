// Anagrams

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {

String a = s.substring(0,s.length()/2);
String b = s.substring(s.length()/2, s.length());
int noOfChar = 0;
//System.out.println( a + " " +b);
int alen = a.length();
int blen = b.length();
if(alen != blen)
     return -1;
     
a = a.toLowerCase();
b = b.toLowerCase();
int[] afreq = new int[26];
int[] bfreq = new int[26];

for (int i=0; i< alen; i++){
    char c = a.charAt(i);
    int index = c-'a';
    afreq[index]++;
}

for (int j=0; j< blen; j++){
    char d = b.charAt(j);
    int index = d-'a';
    bfreq[index]++;
}
// System.out.println();
// System.out.print("a ");
// for(int l =0; l<26; l++){
//    // if(afreq[l]== bfreq[l] ){ 
//     System.out.print(afreq[l]);       
//    // }   
// }
// System.out.println();
// System.out.print("b ");
// for(int l =0; l<26; l++){
//    // if(afreq[l]== bfreq[l] ){ 
//     System.out.print(bfreq[l]);       
//    // }   
// }
//System.out.println();
//System.out.print("char");
for(int l =0; l<26; l++){
   if(afreq[l] != bfreq[l] ){ 
       if (afreq[l] > bfreq[l]){
       noOfChar += (afreq[l] - bfreq[l]); 
      // else if(bfreq[l] < bfreq[l])
       //System.out.println("fchar " + noOfChar + " a "+ afreq[l] +" b" + bfreq[l]);    
   }
   }   
}
    //System.out.println("return char " + noOfChar);   

return noOfChar;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
