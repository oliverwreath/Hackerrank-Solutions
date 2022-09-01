/**
 * 
 * Problem Statement-
 * [Sock Merchant](https://www.hackerrank.com/challenges/sock-merchant/problem)    
 * [Tutorial](https://youtu.be/NPMxxSyE7jM)  
 * 
 */
package com.hackerrank.generalprogramming.basicprogramming;

import java.util.HashSet;

/**
 * @author Kanahaiya Gupta
 *
 */
public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int element = ar[i];
			if (set.contains(element)) {
				set.remove(element);
				count++;
			} else {
				set.add(element);
			}

		}
		return count;

	}
}
