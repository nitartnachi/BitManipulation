/*
 * A number is Sparse if there are no two adjacent 1s in its binary representation. 
 * For example 5 (binary representation: 101) is sparse, but 6 (binary representation: 110) is not sparse.
 */

package com.nitin.algo;

public class SparseNumber {
	
	public static void main(String[] args) {
		int num = 3;
		System.out.println("isSparse: " + isSparse(num));
	}
	
	private static boolean isSparse(int num) {
		int cont = 0;
	 
		while (num > 0) {
			// get right most bit & shift right
			if((num & 1) == 1){
			    cont++;
			    if(cont > 1)
			        return false;
			}
			else if(cont > 0)
			    cont--;
			num = num >> 1;
		}
	 
		return true;
	}

}
