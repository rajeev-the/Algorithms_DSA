package Binary_Searching;

public class Binary {


     public static Integer get_binary(int[] arr , int key , int low , int high){
          
        while (low<= high) {

           int mid = (low+high)/2;

           if(arr[mid] == key){
            return mid;
           }
           
           else if(arr[mid] <  key){
             low = mid +1;

           }
           else{
            high = mid -1;
           }
            
        }

        return -1;

     }

    public static void main(String[] args) {

        int []arr = {1,2,3,4,7};

        System.out.println(get_binary(arr, 4, 0, 3));
        
    }
    
}
