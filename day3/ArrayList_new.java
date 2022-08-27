package week3.day3;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.asn1.ASN1Integer;

public class ArrayList_new {
	


	public static void main(String[] args) {

		List<Integer> numb1 = new ArrayList<Integer>();
		
		numb1.add(1);
		numb1.add(22);
		numb1.add(3);
		numb1.add(54);
		numb1.add(65);
		numb1.add(22);
		numb1.add(43);
		
		System.out.println("listing the element" +numb1);
		int duplicate =22;
		int count =0;
		for (Integer eachlist  : numb1){
		if (eachlist == duplicate){
		count++;
	}}
		System.out.println("listing the element" +count);
	}}

