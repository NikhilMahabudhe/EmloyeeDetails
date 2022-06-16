package gatherdetail;

public class EmployeeAdd {
	 int hNO,pinCode;
	    String hStreet,city;
	    public void getDetails(int a,String b,String c,int d){
	        hNO=a;
	        hStreet=b;
	        city=c;
	        pinCode=d;
	    }
	    public void diplay2(){
	        System.out.println("Employee house number is:"+hNO);
	        System.out.println("Employee Street Name is:"+hStreet);
	        System.out.println("Employee city name is:"+city);
	        System.out.println("Employee pin code is:"+pinCode);
	    }
}
