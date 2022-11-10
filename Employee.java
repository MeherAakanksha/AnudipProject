
public class Employee {
private  String name;
private int age;
private String Dept;
private int Salary;

public Employee() {      //default constructor
	super();
}

public Employee(String name, int age, String dept, int salary) {    //Parameterized constructor
	super();
	this.name = name;
	this.age = age;
	Dept = dept;
	Salary = salary;
}

    //getter setter called
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDept() {
	return Dept;
}

public void setDept(String dept) {
	Dept = dept;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}

@Override      //to string method
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", Dept=" + Dept + ", Salary=" + Salary + "]";
}

}
