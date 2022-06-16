package showdetail;
import java.util.Scanner;
import gatherdetail.*;


public class EmployeeMain {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the ID:");
	        String id = sc.nextLine();
	        System.out.println("Enter the Name:");
	        String name = sc.nextLine();
	        System.out.println("Enter the post:");
	        String desg = sc.nextLine();
	        EmployeeData ob1 = new EmployeeData(id,name,desg);
	       
	        System.out.println("Enter the House number:");
	        int house =  Integer.parseInt(sc.nextLine());
	        System.out.println("Enter the street Name:");
	        String street = sc.nextLine();
	        System.out.println("Enter the city:");
	        String city= sc.nextLine();
	        System.out.println("Enter the pincode:");
	        int pincode= Integer.parseInt(sc.nextLine());
	        EmployeeAdd ob2 = new EmployeeAdd();
	        ob2.getDetails(house,street,city,pincode);
	        
	        System.out.println("Enter the email id:");
	        String mailid = sc.nextLine();
	        System.out.println("Enter the phone Number:");
	        long phoneno = sc.nextLong();
	        EmployeeContact ob3= new  EmployeeContact(mailid,phoneno);
	        
	        System.out.println("Enter the basic salary:");
	        int bsal = sc.nextInt();
	        EmployeeSalary ob4 = new EmployeeSalary(bsal);
	        
	        ob1.display1();
	        ob2.diplay2();
	        ob3.getEmployeeContact();
	        ob4.calculateSal(bsal);
	}

	private static int parseint(int nextInt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
