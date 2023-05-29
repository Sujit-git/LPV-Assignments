import java.util.*;

public class TokenRing{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of nodes you want in the Ring : ");
		int n = sc.nextInt();
		
		System.out.println("Ring Formed is as below : ");
		for(int i=0;i<n;i++){
			System.out.print(i + " ");
		}
		System.out.println("0");
		
		int choice = 0;
		
		do{
			System.out.print("Enter sender: ");
			int sender = sc.nextInt();
		
			System.out.print("Enter receiver: ");
			int receiver = sc.nextInt();
				
			System.out.print("Enter Data to send: ");
			int data = sc.nextInt();
			
			System.out.print("Token Passing : ");
			
			int token  = 0;
			for(int i=token;i<sender;i++){
				System.out.print(" "+ i +" -> ");
			}
			System.out.println(sender);
			
			System.out.println("Sender: "+ sender + " sending Data: "+ data);
			for(int i=sender; i!=receiver;i=(i+1)%n){
				System.out.println("Data: "+ data +" Forwarded by "+i);
			}
			System.out.println("Receiver: "+ receiver +" Received Data: "+ data);
			
			token  = sender;
			
			System.out.println("Do you want to send Data Again?? If YES Enter 1 Otherwise Enter 0");
			choice = sc.nextInt();	
		}while(choice==1);
	
		System.out.println("Thank you!");
	}	
	
}
