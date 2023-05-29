//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        /*HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<S.length();i++){
            hs.add(S.charAt(i));
        }
        return hs.toString().replaceAll("\\,|\\[|\\]|\\s", "");*/
        
        HashMap<Character,Integer> hm = new HashMap<>();
        String s="";
        
        for(int i =0;i<S.length();i++){
            if(!hm.containsKey(S.charAt(i))){
                hm.put(S.charAt(i),1);
                s+=S.charAt(i);
            }
        }
        return s;
    }
}