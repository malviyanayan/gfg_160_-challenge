package gfg;


public class Solution{
    
    // ########## Day-2 ##########
    // ||||||||| Completed ********
    void pushZerosToEnd(int[] arr) { 
        int s = 0,e=arr.length-1;
        while(s != arr.length && arr[s]!=0)s++;

        while(s != arr.length && e!=arr.length ){
            e=s+1;
            while(e!=arr.length && arr[e]==0)e++;

            if(s != arr.length && e!=arr.length){
                int temp = arr[s];
            arr[s] = arr[e];
            arr[e]=temp;
            s++;
            }
        }
    }


    // ########## Day-2 ##########
    // ||||||||| Completed ********
    public void reverseArray(int arr[]) {
        int s = 0,e=arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
    
    public static void main(String[] args) {
        Solution son = new Solution(); // Requered for run the program
        // int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        // int[] arr = {10, 20, 30};
        // int[] arr = {0, 0};
        // int[] arr = {3, 5, 0, 0, 4};
        // son.pushZerosToEnd(arr);
        
        // day-3
        // int[] arr = {1, 4, 3, 2, 6, 5};
        // int[] arr = {4, 5, 2};
        int[] arr = {1};
        son.reverseArray(arr);



        for(int next : arr)System.out.print(next+", ");
    }
}