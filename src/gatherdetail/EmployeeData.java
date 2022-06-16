package gatherdetail;

public class EmployeeData {
	String eId,eName,eDesg;
    public EmployeeData(String a, String b, String c){
         eId=a;
         eName=b;
         eDesg=c;
    }
     public void display1(){
         System.out.println("Employee Id is:"+eId);
         System.out.println("Employee Name is:"+eName);
         System.out.println("Employee post is:"+eDesg);
    }
}
