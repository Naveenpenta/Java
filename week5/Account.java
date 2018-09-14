/*
4. Create a class Account with an instance variable balance (double). It shouldcontain a
 constructor that initializes the balance, ensure that the initial balance is
 greater than 0.0.
 Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
 Create two methods namely credit and debit, getBalance.
 The Credit adds the amount (passed as parameter) to balance and does not return any
 data. Debit method withdraws money from an Account. GetBalance displays the
 amount.
 Ensure that the debit amount does not exceed the Account’s balance. In that case the
 balance should be left unchanged and the method should print a message indicating
 “Debit amount exceeded account balance”
 */
package week5;

/**
 *
 * @author RGUKT
 */
import java.util.*;
class Account{
	String Acct_Name;
	static int Acct_acctno=1234;
	double Acct_Bal=0.0;
	String Acct_Address;
	
	
	Account(String Acct_Name,double Acct_Bal,String Acct_Address){
			this.Acct_Name=Acct_Name;
			this.Acct_acctno=Acct_acctno+1;
			this.Acct_Bal=Acct_Bal;
			this.Acct_Address=Acct_Address;
		
		
	}
	
	
	void getDetails(){
		System.out.println("Account Number: "+Acct_acctno);
		System.out.println("Name          : "+Acct_Name);
		System.out.println("Balance       : "+Acct_Bal);
		System.out.println("Address       : "+Acct_Address);		
	}
	void credit(int num){
		
		Acct_Bal=Acct_Bal+num;
		
	}
	void debit(int num){
			if(num>Acct_Bal)
			{
				System.out.println("debit amount exceeded account balance");
				
			}
			else{
				System.out.println("money is debited");
				Acct_Bal=Acct_Bal-num;
				
			}	
		
	}
	
	
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		//Scanner in=new Scanner(System.in);
		Scanner str=new Scanner(System.in);
		//Account Acc[]= new Account[100];
		Account acc=new Account("Naveen",1200,"Basar");
		acc.getDetails();
		acc.credit(1000);
		acc.getDetails();
		acc.debit(1000);
		acc.getDetails();
		Account accc=new Account("Nen",10,"asar");
		accc.getDetails();
		accc.credit(1000);
		accc.getDetails();
		accc.debit(1000);
		accc.getDetails();
		
		
		
	}
}






/*
do{
		System.out.println("Enter number \n 1 create Account\n2 if you have already have Account");
		int choice=in.nextInt();
		if(choice==1){
			
			 Acc[i]=new Account();
			System.out.println("Enter your Name");
			String namee=str.nextLine();
			Acc[i].Acct_Name=namee;
			System.out.println("Enter Account number");			
			Acc[i].Acct_acctno=in.nextInt();
			System.out.println("Enter  Address");
			String add=str.nextLine();
			Acc[i].Acct_Address=add;
			System.out.println("Your Account is Created Succussfully");
			System.out.println("Your Account Details: ");
			Acc[i].GetDetails();	
			i=i+1;
		}
		
		if(choice==2){
			System.out.println("Enter Account Number\n  to do some operations\n");
			int number=in.nextInt();
			System.out.println("Enter Number \n 1 Credit \n 2 Debit \n 3 getBalance");
			int ch=in.nextInt();
			if(ch==1){
				for(int t=0;t<Acc.length;t++){
					System.out.print(Acc[t].Acct_acctno);
					/*if(Acc[t].Acct_acctno==number){
						Acc[t].credit(number);
						
					}
				}	
			}		
		}
		System.out.println("Enter 1 for Continue 2 for Exit ");
		k=in.nextInt();
		}while(k==1);
		
		
	}
		
}*/	
