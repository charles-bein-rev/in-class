package encap.one;

public class GettersAndSetters {
	private String name;
	private long id;
	private String accountType;
	private int SSN;
	private String pass;
	private double accountValue;
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	private String getPass() {
		return pass;
	}
	private void setPass(String pass) {
		this.pass = pass;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	int getSSN() {
		return SSN;
	}
	protected void setSSN(int sSN) {
		SSN = sSN;
	}
	double getAccountValue() {
		return accountValue;
	}
	protected void setAccountValue(double accountValue) {
		this.accountValue = accountValue;
	}
}
