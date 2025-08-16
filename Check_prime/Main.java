public class Main {

    public static boolean is_prime(int num){
        if( num <= 1) return false;
        if( num == 2 || num ==3)  return true;
        if(num % 2 == 0) return false;

        for(int i = 3 ; i*i <= num ; i+=2){
                if(num % i == 0){
                    return false;
                }

         
        }

   return true;
         
    }

    public static void main(String[] args) {
        
       int num = 97;
        if (is_prime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
    
}
