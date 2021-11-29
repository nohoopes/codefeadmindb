package codefe.admin.model;

import java.text.NumberFormat;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cusaccount")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	 @Column(name = "CusPhone")
	    private String cusphone;

	    @Column(name = "CusName")
	    private String cusname;

	    @Column(name = "Password")
	    private String password;
	
	public Customer() {
		super();
		id = 0;
		cusname = "";
		password = "";
		cusphone = "";
	}
	
	public Customer(int id, String cusname, String password, String cusphone) {
		super();
		this.id = id;
		this.cusname = cusname;
		this.password = password;
		this.cusphone = cusphone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCusphone() {
		return cusphone;
	}

	public void setCusphone(String cusphone) {
		this.cusphone = cusphone;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
