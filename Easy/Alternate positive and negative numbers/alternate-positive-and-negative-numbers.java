//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    void rearrange(int arr[], int n) {
      int[] positive=new int[n];
      int[] negative=new int[n];
      
      int posIndex=0;
      int negIndex=0;
      
      for(int i=0;i<n;i++){
          if(arr[i]>=0){
              positive[posIndex++]=arr[i];
          }else{
              negative[negIndex++]=arr[i];
          }
      }
      
      int i=0;
      int j=0;
      int k=0;
      while(i<posIndex && j<negIndex){
          arr[k++]=positive[i++];
          arr[k++]=negative[j++];
      }
      while(i<posIndex){
          arr[k++]=positive[i++];
      }
      while(j<negIndex){
          arr[k++]=negative[j++];
      }
      
      
    }
}