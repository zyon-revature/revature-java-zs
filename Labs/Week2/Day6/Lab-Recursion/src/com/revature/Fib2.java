package com.revature;

import java.util.HashMap;

public class Fib2 {
    protected static HashMap<Integer, Integer> nTerms = new HashMap<>();

    public int fibonacci(int n){
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        if(nTerms.containsKey(n))
            return nTerms.get(n);

        int result = fibonacci(n-1) + fibonacci(n -2);
        nTerms.put(n, result);

//         System.out.println("HashMap size: " + nTerms.size());
//         System.out.println("List of keys: " + nTerms.keySet());
        return result;
    }
}
