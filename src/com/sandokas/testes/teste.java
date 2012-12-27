package com.sandokas.testes;

public class teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (255<<24) | (127<<16) | (0<<8) | (127<<0);
		a = a & 0xff;
		System.out.println(a);
	}

}
