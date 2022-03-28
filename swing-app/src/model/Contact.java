package model;

public class Contact {
	private String name;
	private String lastName;
	private String phone;
	private int id;
	
    public Contact(int id, String name, String lastName, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
	}
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + "]";
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
