package bean;

import java.io.Serializable;

public class DepBean implements Serializable{

	private String dep_name;
	private int dep_no;

	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public int getDep_no() {
		return dep_no;
	}
	public void setDep_no(int dep_no) {
		this.dep_no = dep_no;
	}




}