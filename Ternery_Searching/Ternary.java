package Ternery_Searching;

public class Ternary {
    

    public static Integer ternary_searching(int[] arr , int key){

        int low = 0 ,high = arr.length -1;

        while (low <= high) {
            
            int mid1 =  low + (high -low)/3;
            int mid2 = high - (high-low)/3;
            if(arr[mid1] == key) return mid1;
            if(arr[mid2] == key) return mid2;

            if(key < arr[mid1]){
                high = mid1 -1;
            }
            else if( key > arr[mid2]){
                low = mid2+1;
            }
            else{
                low =  mid1+1;
                high = mid2 -1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        
    }
}
