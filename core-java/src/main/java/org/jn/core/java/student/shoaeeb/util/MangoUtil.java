package org.jn.core.java.student.shoaeeb.util;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.interfce.MangoIntrfce;
import org.jn.core.java.student.shoaeeb.model.Mango;

public class MangoUtil {
	
	public static Mango[] getMangoes()
	{
		Mango m1=new Mango("yellow","sweet",5);
		Mango m2=new Mango("green","sour",4);
		Mango m3=new Mango("yellow","sweet",6);
		Mango m4=new Mango("green","sour",2);
		Mango m5=new Mango("green","sour",5);
		Mango m6=new Mango("yellow","sweet",3);
		
		return new Mango[] {m1,m2,m3,m4,m5,m6};
	}
	public static Mango[] filter(MangoIntrfce lambda)
	{
		Mango mango[] =  MangoUtil.getMangoes();
		List<Mango> list =  new ArrayList<>();
		for(Mango mangoes: mango)
		{
			if(lambda.filter(mangoes))
			{
				list.add(mangoes);
			}
		}
		return list.toArray(new Mango[] {});
		
	}
	public static void print(Mango[] mangoes) {
		for (Mango mango: mangoes) {
			System.out.println(mango);
		}
	}
}
