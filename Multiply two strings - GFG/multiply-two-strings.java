//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
         //int t1= Integer.parserInt(s1);
         //int t2=Integer.parserInt(s2);
         
         //int t3 = t1*t2;
         //String t4 = String.format(t3);
        // return "t4";
        BigInteger t1 = new BigInteger(s1);
        BigInteger t2 = new BigInteger(s2);
        BigInteger t3=t1.multiply(t2);
        return t3.toString();
    }
}