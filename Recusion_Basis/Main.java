class Main{

    public static Integer factorial_res(int n){
        if(n==0 || n==1) return 1;

        return factorial_res(n-1)*n;
    }
    public static Integer get_sum(int[] arr,int index){
        if(index == arr.length) {
            return 0;
        }

        return arr[index] + get_sum(arr, index+1);
    }

    public static void main(String[] args) {
        
        factorial_res(13);
    }

}