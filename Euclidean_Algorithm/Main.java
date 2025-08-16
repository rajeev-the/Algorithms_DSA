class Main {

     public static Integer getgcd(int a , int b ){
       
        while (b!=0) {
            
           int  remainder = a%b ;

           a = b;
           b = remainder;
           
        }

        return a;

     }

     public static Integer Lcm(int a , int b){
               
        return (a*b)/getgcd(a, b);
     }

    public static void main(String[] args) {
        
        System.out.println(Lcm(5, 6));

    }
}