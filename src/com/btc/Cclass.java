package com.btc;

import com.btc.hankook.*;

public class Cclass {

	public static void main(String[] args) {
		Aclass a1 = new Aclass();
		a1.output();
//		a1.print();
		a1.outputPrint();
//		a1.defaultPrint();
//		a1.protectedPrint();
		
		System.out.println("----------------------");
		ExtendClass ec = new ExtendClass();
		ec.output();
	}

}
