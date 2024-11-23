package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
    


    // ########## Day-2 ##########
    // ||||||||| Completed ********
    void rotateArr(int arr[], int d) {
        if(arr.length == 0 || (d = d % arr.length)==0)return;
        int[] dup = new int[d];
        int i;
        for(i = 0;i<d;i++){
            dup[i] = arr[i];
        }
        
        int j = 0;
        while(i != arr.length){
            arr[j++] = arr[i];
            i++;
        }
        i=0;
        while(j != arr.length)arr[j++] = dup[i++];

    }


    // ########## Day-4 ##########
    // ||||||||| Completed ********
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;

        while(i>=0 && arr[i]>=arr[i+1])i--;

        if(i>=0){
            int j = n-1;
            while(j>i && arr[j]<=arr[i])j--;
            swap(arr,i,j);
        }

        reverse(arr, i+1, n-1);

    }

    private static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // ########## Day-6 ##########
    // ||||||||| Completed ********
    public List<Integer> findMajority(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();
        double n=nums.length/3;
        for(int key : map.keySet()){
            if(map.get(key) > n)list.add(key);
        }
        return list;
    }


    // ########## Day-6 ##########
    // ||||||||| Completed ********
    public int maximumProfit(int prices[]) {
        if(prices.length <= 1)return 0;
        int maxP = 0,minPrice = prices[0];
        // while(s != prices.length){
        //     if(e==s){
        //         s++;
        //         if(s != prices.length -1 )e = prices.length -1;
        //         else break;
        //     }
        //     if(prices[e]-prices[s]>max)max = prices[e]-prices[s];
        //     e--;
        // }
        for(int i=1;i<prices.length;i++){
            if(maxP < prices[i]-minPrice)maxP = prices[i] - minPrice;
            if(prices[i]<minPrice)minPrice = prices[i];
        }
        
        return maxP;
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
        // int[] arr = {1};
        // son.reverseArray(arr);

        //day-4
        // int[] arr = {1, 2, 3, 4, 5};
        // int d = 2;
        // int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        // int d = 3;
        // int[] arr = {7, 3, 9, 1};
        // int d = 9;
        // int[] arr = {};
        // int d = 9;
        // son.rotateArr(arr, d);


        // day-5
        // int[] arr = {1,2,3};
        // son.nextPermutation(arr);

        // day-6
        // int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        // int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {1, 1, 1, 3, 3, 3, 3};
        // int[] arr = {4, 4, 4, 5, 5, 6, 6, 6};
        // System.out.println(son.findMajority(arr));

        //day - 8
        // int[] arr = {7, 10, 1, 3, 6, 9, 2};
        // int[] arr = {7, 6, 4, 3, 1};
        // int[] arr = {1, 3, 6, 9, 11};
        // int[] arr = {1};
        int[] arr = {};
        System.out.println(son.maximumProfit(arr));


        // for(int next : arr)System.out.print(next+", ");
    }
}