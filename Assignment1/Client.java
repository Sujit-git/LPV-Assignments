
import java.rmi.*;
import java.util.Scanner;


public class Client{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		try{
			String ServerURL = "rmi://localhost/Server";
			ServerIntf serverIntf = (ServerIntf)Naming.lookup(ServerURL);
			
			System.out.print("Enter 1st number: ");
			double d1 = sc.nextDouble();
			System.out.print("Enter 2nd number: ");
			double d2 = sc.nextDouble();
			
			System.out.println("1st number is : "+ d1 +" and 2nd number is : "+ d2);
			System.out.println("Addition is "+ serverIntf.add(d1, d2));
		}
		catch(Exception e){
			System.out.println("Error is : "+ e);
		}	
		
	}

}
