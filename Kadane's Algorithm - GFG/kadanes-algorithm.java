// { Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{
    
    int largest(int arr[], int n)
     {
         int i;
           
         // Initialize maximum element
         int max = arr[0];
        
         // Traverse array elements from second and
         // compare every element with current max  
         for (i = 1; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
        
         return max;
     }

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        int maxi = largest(arr,n);
        if(maxi<0){
            return maxi;
        }
        long curr=0;
        long best=0;
        for(long i : arr){
            
            curr = Math.max(0, curr+i);
            best = Math.max(best , curr);
        }
        return best;
        // Your code here
        
    }
    
}

