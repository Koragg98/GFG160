/*
Prob.: Count the number of possible triangles
Given an integer array arr[]. Find the number of triangles that can be formed
with three different array elements as lengths of three sides of the triangle. 

A triangle with three given sides is only possible if sum of any two sides is always greater than the third side.
*/

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int cnt=0;
        for(int i=2;i<arr.length;i++)
        {
            int left=0,right=i-1;
            while(left<right)
            {
                if(arr[left]+arr[right]>arr[i])
                {
                    cnt+=(right-left);
                    right--;
                }
                else left++;
            }
        }
        return cnt;
    }
}