
public class DataStructuresPrep {

    public int subtractAlgorithm(int a, int b) {
       int c= 0;
       while (a>(b+c)) {
        c= c+1;
        
       }
       return c;
    }


    public int multiplyAlgorithm(int a, int b) {
        int c =0;
        while(b<=a){
            c+=a;
            b++;
        }
        return c;
    }


    public int divideWAlgorithm(int dividend, int divisor) {
        int c =0;
        for(int i = 0; i<divisor;i++){
            if(!(dividend-divisor<0)){
                c++;
            }
            dividend-=divisor;
        }
        return c;
    }

    public boolean isPerfectNumber(int number) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public int getFactorial(int number) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public int findMaximum(int[] numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public int powerAlgorithm(int base, int exponent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public boolean isPrime(int number) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public int countDigits(int number) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
