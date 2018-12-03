package bean;

import java.io.Serializable;

public class PosBean implements Serializable{

	private String pos_name;
	private int pos_no;

	public String getPos_name() {
		return pos_name;
	}
	public void setPos_name(String pos_name) {
		this.pos_name = pos_name;
	}

	public int getPos_no() {
		return pos_no;
	}
	public void setPos_no(int pos_no) {
		this.pos_no = pos_no;
	}




}