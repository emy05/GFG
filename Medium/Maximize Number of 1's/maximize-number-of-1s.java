//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int windowStart=0;
        int maxOnesCount=0;
        int zeroCount=0;
        for(int windowEnd=0;windowEnd<n;windowEnd++){
            if(arr[windowEnd]==0){
                zeroCount++;
            }
            if(zeroCount>m){
                if(arr[windowStart]==0){
                    zeroCount--;
                }
                windowStart++;
            }
            int windowLength=windowEnd-windowStart+1;
            maxOnesCount=Math.max(maxOnesCount,windowLength);
        }
        return maxOnesCount;
    }
}