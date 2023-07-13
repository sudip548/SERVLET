package sessionImp;

public class DataClass {
	public static DataClass data;
	private int age;
	private String name;
	private String email;
	public static DataClass getData() {
		return data;
	}
	public static void setData(DataClass data) {
		DataClass.data = data;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public DataClass(int age, String name, String email) {
		super();
		this.age = age;
		this.name = name;
		this.email = email;
	}
	

}
