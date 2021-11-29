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
@Table(name="products")
public class FoodDrink {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String name;
	private double price;
	private String type;
	private int status;
	private String code;
	private String description;
	public FoodDrink() {
		super();
		id = 0;
		name = "";
		price = 0;
		type ="";
		status = 0;
		code = "";
		description="";
	}
	
	public FoodDrink(int id, String name, double price, String type,int status,String code,String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.status = status;
		this.code = code;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

