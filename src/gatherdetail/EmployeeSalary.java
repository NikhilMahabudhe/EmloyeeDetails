package gatherdetail;

public class EmployeeSalary {
int bSal,totalSal;
public EmployeeSalary(int a){
	bSal=a;
}
public void calculateSal( int bSal) {
totalSal=bSal*20;
System.out.println("total salary is:"+totalSal);
}
}