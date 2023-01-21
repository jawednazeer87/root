package org.jn.core.java.student.sayed.hassain.collection;

import java.util.ArrayList;
import java.util.List;

public class ProjectManagerList {
	static List getProjectList() {
		
		List<ProjectManager> list = new ArrayList<>();
		list.add(new ProjectManager("Website",2));
		list.add(new ProjectManager("Android App",1));
		list.add(new ProjectManager("Android Application",5));
		
		return list;
	}
}
