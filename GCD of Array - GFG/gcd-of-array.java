// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    int Arr[] = new int[N];
                    for(int i = 0;i<N;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(N,Arr));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{   
    
    public int Gcd(int A , int B) 
    { 
        if (B == 0) 
	        return A; 
	    return Gcd(B, A % B);  
    } 
    public int gcd(int N , int arr[]) 
    { 
       int ans = arr[0];

    	for(int i = 1; i < N; i++)
    		ans = Gcd(ans, arr[i]);

    	return ans;
    }
}