/*
public class menuatmeasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Scanner;

import javax.swing.JOptionPane;
// CHAPTER 8 PROGRAM INSIDE THIS ONE. 
// NEXT PROGRAM BANK ACCOUNT-. 
public class menuatmeasy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner user_input = new Scanner(System.in);
			
			mainloop: while(true) {
			
			System.out.println("             --**ATM MACHINE**-- \n" ); 
			System.out.println(" -Select your desired operation from the Menu- \n" ); 
			System.out.println("------------------------------------------------- \n" ); 
			System.out.println("[1]:- View account balance.\n" ); 
			System.out.println("[2]:- Withdraw cash.\n" ); 
			System.out.println("[3]:- Make a deposit.\n" ) ; 
			System.out.println("[4]:- Exit.\n" ) ; 
			
			int user_answer = user_input.nextInt();	
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
		
			switch(user_answer)
			
			{
			case 1:
				System.out.println("Your account balance is:");
				System.out.println("$ 3.458.184,93 .\n");
				//System.out.println("Would you like to do another transaction? [Y/N]");
			
			[b] FIRST TRY :[/b] int temp = JOptionPane.showConfirmDialog(null, "Would you like to do another transaction?", "[Y/N]", JOptionPane.YES_NO_OPTION);;
				if(temp==0){
					JOptionPane.showInputDialog(null, "Select your new transaction");
					new menuatmeasy();
				}
				else {
					JOptionPane.showInputDialog(null, "Thanks for using ATM. Have a nice day.");
					break;
				}
			


	
				 [b]SECOND TRY[/b]boolean condition = true;
				while (condition) {
					
				    // Your code
					 
				    try { 
				    	while (true) { //Creates an infinite loop
				           Serializable  in = input.readLine();
				            if (((String) in).equalsIgnoreCase("y")) {
				                condition = true;
				                break;
				            } else if (((String) in).equalsIgnoreCase("n")) {
				                condition = false;
				                break;
				            } else {
				                System.out.println("Please enter either Y or N.");
				            }
				        } 
				    	}
				    
				  finally{ }
				}
				        
				    
				
					while(true){
						int choiceYN = user_input.nextInt();
						
						if (choiceYN == ' ') {
							System.out.println("Error, Please input [Y/N]");
							return;
						}
						if (choiceYN == 'Y' || choiceYN == 'y') {
							return;
						}
						if (choiceYN == 'N' || choiceYN == 'n'){
							break;
						}
					}
			}
					
				
				 [b]THIRD TRY[/b]int choiceYN = user_input.nextInt(); 	            	
					while ((choiceYN == 'y') || (choiceYN == 'Y'))
	            	{
	            		choiceYN= Integer.parseInt(JOptionPane.showInputDialog("Would you like to do another transaction? [Y/N]") + "\nPress [Y] for YES, [N] for NO");
	            			if(choiceYN == 'N' || (choiceYN == 'n')) {
	            				JOptionPane.showMessageDialog(null, "Thanks for using ATM. Have a nice day. \n");
	            				break mainloop;
	            			}
	            			else if ((choiceYN != 'y') || (choiceYN != 'n')) {
	            				JOptionPane.showMessageDialog(null, "Error Please Input [Y/N] only.");
	            				return ;
	            			}
	            			else if (choiceYN == 'Y' || (choiceYN == 'y')) {
	            				JOptionPane.showMessageDialog(null, "Select the new operation...: \n");
	            					return ;
	            	}
	            	} 
	            	
	            	
					
					
					
	            	
	            	
			case 2:
				System.out.println("Please type the amount that you want to withdraw: ");
				int withdrawalAmount = user_input.nextInt(); 
				System.out.println(withdrawalAmount + " $, are being withdrawed.");
				System.out.println("Please take your cash");
				
				
			
			case 3:
				System.out.println("Please type the amount that you would like to deposit: ");
				int depositAmount = user_input.nextInt();
				System.out.println(depositAmount + " $, are going to be deposited in your account.");
				System.out.println("Please insert the cash");
				
				
				
			case 4:
				System.out.println("Thanks for using ATM. Have a nice day. \n");
				System.exit(user_answer);
			
				
			default: 
				System.out.println("Invalid Choice. Please select an option from the menu.");
			}
			
			
		}
	}

	private static String mainloop() {
		// TODO Auto-generated method stub
		return null;
	}
}

