// // User function Template for Java

class Solution {
    public static void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void rotate(int[] arr) {
        // code here
        int end= arr.length-1;
        int secEnd= arr.length-2;
        while(secEnd>=0){

            swap(arr, secEnd, end);
            secEnd--;
            end--;
        }
    }
}