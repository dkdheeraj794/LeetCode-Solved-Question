//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
    /*HashSet<Character> st=new HashSet<>();
    for(int i=0;i<S.length();i++){
    st.add(S.charAt(i));
    }
    return st.size();*/
    
   /* HashMap<Character,Integer> hm = new HashMap<>();
    String s ="";
    
    for(int i=0;i<S.length();i++){
        if(!hm.containsKey(S.charAt(i))){
            hm.put(S.charAt(i),1);
            s+=S.charAt(i);
        }
    }
    return s.length();*/
    
    int left=0;
    int right=0;
    HashSet<Character> hs = new HashSet<>();
    int max=0;
    
    while(right<S.length()){
        char c = S.charAt(right);
        if(hs.add(c)){
            max=Math.max(max,right-left+1);
            right++;
        }
        else{
            while(S.charAt(left)!=c){
                hs.remove(S.charAt(left));
                left++;
            }
            hs.remove(S.charAt(left));
            left++;
        }
        
    }
    return max;
    }
}