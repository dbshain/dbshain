package bean;

import java.io.Serializable;

public class ShainBean implements Serializable {
	private int no;
	private String name;
	private String address;
	private int pos_no;
	private int dep_no;


	public int getDep_no() {
		return dep_no;
	}
	public void setDep_no(int dep_no) {
		this.dep_no = dep_no;
	}


	public int getPos_no() {
		return pos_no;
	}
	public void setPos_no(int pos_no) {
		this.pos_no = pos_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public  String getName() {
		return name;
	}

	public   void setName(String name) {
		this.name = name;
	}





}
