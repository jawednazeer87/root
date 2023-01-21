package org.jn.core.java.student.shoaeeb.clsses;

import java.util.ArrayList;
import java.util.List;

public class MangoUtil {
	public static Mango[] getMangoes()
	{
		
		Mango m1 = new Mango(45,"yellow","sweet");
		Mango m2 = new Mango(55,"sour","sour");
		Mango m3 = new Mango(56,"green","sweet");
		Mango m4 = new Mango(51,"yellow","sweet");
		Mango m5 = new Mango(47,"green","sour");
		Mango m6 = new Mango(46,"green","sour");
		return new Mango[] {m1,m2,m3,m4,m5,m6};
		
	}

	public static Mango[] filter(MangoIntrfce lambda) {
		// TODO Auto-generated method stub
		List<Mango> list  = new ArrayList<>();
		Mango[] mangoes = MangoUtil.getMangoes();
		for(Mango mango:  mangoes)
		{
			if(lambda.filter(mango))
			{
				list.add(mango);
			}
		}
		return list.toArray(new Mango[] {});
	}
	
	
}
