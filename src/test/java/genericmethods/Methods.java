package genericmethods;

public class Methods {
    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int number:arr) {
            if(number>max){
                max=number;
            }

        }
        return max;
    }
    public static int minElement(int[] arr){
        int min = arr[0];
        for (int number:arr) {
            if(number<min){
                min=number;
            }

        }
        return min;
    }
    public static int fibonacci(int num){
        //1,1,2,3,5,8,13,21...
        if(num<=1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);

    }

    public static int factoriel(int n){
        //5! = 5*4*3*2*1
        int fac = 1;
        for (int i = 1; i <=n ; i++) {
            fac = fac*i;
        }
        return fac;
    }
    public static boolean isPrime(int n){

        if(n<2){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(n)  ; i++) {
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
    public static int reverseNum(int num){
        int reversedNum = 0;
        //127 --> 721
        //--- we need to sperate 7 first
        while(num>0){
            reversedNum = reversedNum*10 + num%10;
            num =num/10;
        }

       return reversedNum;
    }
}
