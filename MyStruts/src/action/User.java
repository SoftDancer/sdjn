package action;

import java.util.ArrayList;
import java.util.List;



public class User {
	private String loginname;
	private String password;
	private boolean sex;
	private double salary;
	private List<String> fav = new ArrayList<String>();
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getfav() {
		return fav;
	}
	public void setfav(List<String> fav) {
		this.fav = fav;
	}

	
}
