//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
       int count=0;
       int candidate=0;
       for(int num:a){
           if(count==0){
               candidate=num;
               count=1;
           }else if(num==candidate){
               count++;
           }else{
               count--;
           }
       }
       count=0;
       for(int num:a){
           if(num==candidate){
               count++;
           }
       }
       if(count>size/2){
           return candidate;
       }else{
           return -1;
       }
    }
}