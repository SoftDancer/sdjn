package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{
	private InputStream  data;
	
	private User u ;
	
	 
	
	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public InputStream getData() {

		JSONObject jso = JSONObject.fromObject(u);

		data = new ByteArrayInputStream(jso.toString().getBytes());

		return data;
	}

	
	
	@Override
	public void validate() {
		String loginname = u.getLoginname();
		String password = u.getPassword();
		double salary = u.getSalary();
		System.out.println("--loginname->"+loginname);
		if(loginname == null ||loginname.trim().length() <= 3){
			
			addFieldError("u.loginname", "��¼���������λ");
		}
		if(password == null || password.length() < 6 || password.length() > 8){
			System.out.println(password);
			addFieldError("u.password", "���볤����6~8λ");
		}
		if(salary < 0 || salary > 10000 ){
			System.out.println(salary);
			addFieldError("u.salary", "����������");
		}
	}
	
	public String reg(){
		
		
		ActionContext context = ActionContext.getContext();
		context.put("user", u);
		return SUCCESS;
		
	}
	

}
