/*
 * 
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
