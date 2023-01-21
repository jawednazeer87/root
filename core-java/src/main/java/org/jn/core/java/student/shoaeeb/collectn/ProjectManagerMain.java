package org.jn.core.java.student.shoaeeb.collectn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ProjectManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProjectManager> list = ProjectManagerList.getProjectList();
		//sort the list with team
		Collections.sort(list,new Comparator<ProjectManager>() {

			@Override
			public int compare(ProjectManager o1, ProjectManager o2) {
				// TODO Auto-generated method stub
				if(o1.getTeam()>o2.getTeam())
				{
					return 1;
				}
				if(o1.getTeam()==o2.getTeam())
				{
					return 0;
				}
				else {
					return -1;
				}
			}
			
		});
		
		System.out.println(list);
	}

}
