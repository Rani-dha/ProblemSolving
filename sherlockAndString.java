// https://www.hackerrank.com/challenges/sherlock-and-valid-string/

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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
     HashMap<Character, Integer> hm = new HashMap<>();
     for(int i=0;i<s.length(); i++){
         char ch = s.charAt(i);
         hm.put(ch, hm.getOrDefault(ch,0)+1);
     }
     ArrayList<Integer> hmVal = new ArrayList<>(hm.values());
     
     int max = (int) Collections.max(hmVal);
     int min = (int) Collections.min(hmVal);
    
    if( min == max) return "YES";
    
    int minCount=0, maxCount = 0;
    for(int i=0;i<hmVal.size();i++){
        if( hmVal.get(i) == min)
            minCount ++;
        else if( hmVal.get(i) == max)
            maxCount++;    
    }
    if(maxCount == minCount) return "NO";
    
    return (minCount == 1 || ( maxCount == 1 && max == min+1))? "YES" : "NO";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
