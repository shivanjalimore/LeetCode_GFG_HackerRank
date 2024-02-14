package LeetCode.Array.Easy;

public class Fibonacci_Number_509 {
    class Solution {
        public int fib(int N) {
            // Base Condition.
                if(N <= 1){
                    
                    return N;
                }
                
                // Problem broken down into 2 functional calls
                // and their results combined and returned.
                int last = fib(N-1);
                int slast = fib(N-2);
                
                return last + slast;
        }
}
