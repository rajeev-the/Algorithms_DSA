package Hash_Map;
import java.util.*;;

public class Hash {

    public static void getcount(int[] arr){

        HashMap<Integer,Integer> sp = new HashMap<>();

        for(int i : arr){
            sp.put(i, sp.getOrDefault(i, 0)+1);
        }
        System.out.println(sp);

    }

    public static int[] getsum(int[] arr , int key){
        HashMap<Integer,Integer> sp = new HashMap<>();
        
        for(int i =0 ; i < arr.length ; i++){

            int comp = arr[i]- key;
            if(sp.containsKey(comp)){
                return new int[] {sp.get(comp),i };
            }

            sp.put(arr[i], i);

        }
        return new int[]{-1,-1};
    }

    public static int longzerosum(int[] arr){
        Map<Integer,Integer> sp = new HashMap<>();

        int sum =0 , maxlen = 0;

        for(int i =0 ; i< arr.length ; i++){
            sum +=arr[i];
            
            if(sum == 0){
                maxlen = i+1;

            }
            else if(sp.containsKey(sum)){
                maxlen = Math.max(maxlen, i- sp.get(sum));
            }
            else{
                sp.put(sum, i);

            }
            
        }

        return maxlen;

    }

    public static void main(String[] args) {
        
    }
    
}
