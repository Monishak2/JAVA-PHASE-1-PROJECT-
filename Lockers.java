package Solution;

import java.util.Scanner;
import java.io.IOException;

public class Lockers {

	public static void main(String[] args) throws IOException {
		int ch=0, choice=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("\t Welcome to LOCKERS PVT LIMITED! ");

		
		while(true)
		{
			System.out.println("Choose one of the Following options :");
			System.out.println("1. List  of Current Files");
			System.out.println("2. Business Operations Menu");
			System.out.println("3. Close the  Application");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("NULL EXCEPTION");  
             }         
			
			switch(ch)
			{
			case 1: //List of files in Ascending Order
				Business.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose one of the following options :");
			        System.out.println("1.  To Add a File");
					System.out.println("2.  To  Delete a File");
					System.out.println("3.  To Search for a File");
					System.out.println("4.  Close the Application ");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					case 1:
					     // file creation
						System.out.println("Input the name of a file to be created: ");
						String fileCreate = sc.next();
						
						Business.createFile(fileCreate);
						break;
						
					case 2:
						//file deletion
						System.out.print("Input the name of a file to be deleted: ");
						String fileDelete = sc.next();
						Business.deleteFile(fileDelete);
						break;
					case 3:
					    // Searching from file
						System.out.println("Input the name of a file to be searched: ");
						String fileSearch = sc.next();
						Business.searchFile(fileSearch);
						break;
					case 4:
						//Exit from the application
						 sc.close();
						System.out.println("Close the application ");
						System.exit(1);
						break;
				default:
						
						System.out.println("\n Invalid Operations \n");
						break;
				}
			
					break;
			case 3:
				
			
				sc.close();
				System.out.println("\n Thank you for your visit");
				System.exit(2);
				break;
			
			default:
				
				System.out.println("\n Sorry, Invalid Input, Please read the options\n");
				break;
			
			}
			
		}
		
	}

}
