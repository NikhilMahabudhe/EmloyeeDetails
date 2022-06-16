package gatherdetail;

public class EmployeeContact {
 String mailId;
 long phoneNo;
  public EmployeeContact(String a,long b) {
	mailId=a;
	phoneNo=b;
 }
  public void getEmployeeContact() {
	 System.out.println("emp mail id :"+mailId);
	 System.out.println("emp phone number :"+phoneNo);
 }
}
