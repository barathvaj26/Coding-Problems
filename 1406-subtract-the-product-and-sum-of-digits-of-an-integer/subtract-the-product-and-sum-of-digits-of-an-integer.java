class Solution {
    public int subtractProductAndSum(int n) {
        int Result = ProductOfDigits(n) - SumOfDigits(n);
        return Result;

        }
        int ProductOfDigits(int n){
            int product = 1;
            while(n > 0){
                int n1 = n%10;
                product = n1 * product;
                n = n/10;
            }
            return product;
        }
        int SumOfDigits(int n){
            int sum = 0;
            while(n > 0){
                int n2 = n%10;
                sum = n2+sum;
                n = n/10;
            }
            return sum;
        }
        
    }
