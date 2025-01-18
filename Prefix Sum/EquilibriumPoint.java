
/*
Prob.: Equilibrium Point
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements 
before that index is the same as the sum of elements after it. Return -1 if no such point exists. 
*/

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum=0,prefixSum=0;
        for(int x:arr) totalSum+=x;
        
        for(int i=0;i<arr.length;i++)
        {
            int suffixSum=totalSum-(prefixSum+arr[i]);
            if(prefixSum==suffixSum) return i;
            prefixSum+=arr[i];
        }
        return -1;
    }
}