package org.jn.core.java.student.sayed.hassain.collection;

public class ProjectManager {
	private String project;
	private int team;
	
	//constructor
	ProjectManager() {};
	ProjectManager(String project,int team)
	{
		this.project=project;
		this.team=team;
	}
	
	//setters
	void setProject(String project)
	{
		this.project=project;
	}
	void setTeam(int team)
	{
		this.team=team;
	}
	
	//getters
	
	String getProject()
	{
		return project;
	}
	int getTeam() {
		return team;
	}
	@Override
	public String toString() {
		return " {project=" + project + ", team=" + team + "}\n";
	}
	
}
