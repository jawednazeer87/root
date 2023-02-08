package org.jn.core.java.student.shoaeeb.collection.framework;

import java.util.ArrayList;
import java.util.List;

public class TeacherUtil {

	static Teacher[] getTeacher() {
		List<Teacher> ts = new ArrayList<>();
		ts.add(new Teacher(1,"naman","road 123",55000f));
		ts.add(new Teacher(2,"aman","road 155",45000f));
		ts.add(new Teacher(3,"sirdesh","road 129",60000f));
		ts.add(new Teacher(4,"rajat","road 555",450000f));
		ts.add(new Teacher(5,"raman","road 545",60000f));
		
		return ts.toArray(new Teacher[] {} );
		
	}
	
	static Teacher[] fiter(MyInter mi)
	{
		Teacher[] teachers = TeacherUtil.getTeacher();
		List<Teacher> tch  =new ArrayList<>();
		for(Teacher teacher: teachers)
		{
			if(mi.filter(teacher))
			{
				tch.add(teacher);
			}
		}
		return tch.toArray(new Teacher[] {});
				
	}
	

}
