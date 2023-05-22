//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
       ArrayList<Long> result = new ArrayList<>();
        calculateFactorial(N, 1L, result);
        return result;
    }
    static void calculateFactorial(long N, long current, ArrayList<Long> result) {
        if (current > N) {
            return;
        }
        result.add(current);
        calculateFactorial(N, current * (result.size() + 1), result);
    }
}