public class Problem1_MultiplesOf3And5 {
    public static void main(String args[]) {
      int n=1000;
      System.out.println("The sum of all the multiples of 3 or 5 below " + n + ": " + sumOfMultiples(n));
    }
    
    public static int sumOfMultiples(int max) {
        int sum = 0;
        for(int i = 1; i < max; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
