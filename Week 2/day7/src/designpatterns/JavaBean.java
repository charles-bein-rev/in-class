package designpatterns;

import java.io.Serializable;
import java.util.Objects;

/*Javabean is a more formal POJO. Specifically provides a few more restrictions to the creation of this class:
 * 	-Provide no-args constructor
 * 	- declare all fields
 * 	- should declare gett/setter for each field
 * 	- override toString, hashcodes, and 
 */


public class JavaBean implements Serializable {
	private String name;
	private int id;
	private double amount;
	
	public JavaBean() {
		
	}

	public JavaBean(String name, int id, double amount) {
		super();
		this.name = name;
		this.id = id;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBean other = (JavaBean) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "JavaBean [name=" + name + ", id=" + id + ", amount=" + amount + "]";
	}
	
	
}
