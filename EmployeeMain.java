import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EmployeeMain implements Comparable<Employee> {

	public static void main(String[] args) {
		 ArrayList<Employee> emp=new ArrayList();     //create list//
		 
		 Employee e1=new Employee("aaku",22,"elex",67000);
		 Employee e2=new Employee("sai",29,"mech",20670);
		 Employee e3=new Employee("suraj",31,"civil",1000);    
		 Employee e4=new Employee("anuj",25,"electrical",4689);
		 Employee e5=new Employee("peu",19,"computer",29000);
		 Employee e6=new Employee("gana",36,"elex",6740);
		 
		 emp.add(e1);
		 emp.add(e2);
		 emp.add(e3);
		 emp.add(e4);
		 emp.add(e5);
		 emp.add(e6);
		 
		 //using lambda
   // 1. Printing the List Sorted on their name
   System.out.println(emp.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList()));

   // 2. filtering and printing employees whose salary is above 10000 
	 System.out.println(emp.stream().filter((f1)->f1.getSalary()>10000).collect(Collectors.toList()));
		 
	// Total no.of employees having salary  greater than 10000
	System.out.println(emp.stream().filter((f1)->f1.getSalary()>10000).count());
			
	// 3.Printing employee name and department whose salary is maximum.		
	System.out.println(emp.stream().max((a,b)->a.getSalary()>b.getSalary()?1:-1).map(e->"Name: "+e.getName()+"\nDepartment: "+e.getDept()).get());

	}

}
