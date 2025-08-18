package Linear_Saerching;
class Main{
    public static Integer Linear_seraching(int[] arr,int key){

        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr =  {0,2,1,4,5 };
       System.out.println(Linear_seraching(arr, 1));
        
    }

}