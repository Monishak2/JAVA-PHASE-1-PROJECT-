package Solution;



	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;

	public class Business{

		//To arrange the files in ascending oder bubble sort is used
		protected static String[] sort_sub(String array[], int size){
			String temp = "";
			for(int i=0; i<size; i++){
				for(int j=1; j<(size-i); j++){
					if(array[j-1].compareToIgnoreCase(array[j])>0){
						temp = array[j-1];
						array[j-1]=array[j];
						array[j]=temp;
					}
				}
			}
			return array;
		}
		

		
		//Listing files
		protected static void listFiles() {
			
			int fileCount = 0;
		    ArrayList<String> filenames = new ArrayList<String>();
		
			File directoryPath = new File(System.getProperty("user.dir"));
			File[] listOfFiles = directoryPath.listFiles();
			fileCount = listOfFiles.length;
			
			
			System.out.println("Files in ascending Oder: ");
			for (int i = 0; i < fileCount; i++) {
			  if (listOfFiles[i].isFile()) {
			   filenames.add(listOfFiles[i].getName());
			  } 
			}
			
			String[] str = new String[filenames.size()];
			 
		   for (int i = 0; i < filenames.size(); i++) {
		        str[i] = filenames.get(i);
		    }
			
		    String[] sorted_filenames = sort_sub(str, str.length);
			
			for(String currentFile: sorted_filenames) {
				System.out.println(currentFile);
			}

		}
		
		//File delete function
		protected static void deleteFile(String fileToBeDeleted) {
			
			File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeDeleted );
			
			if(file.exists()) {
				if ( file.delete() ) {
					System.out.println("File deleted successfully!");
				}
			} else {
				System.out.println("File not deleted it is not found");
			}
		}
		
		//Searching of File
		protected static void searchFile(String fileToBeSearched) {
		        
			File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeSearched );
			
			//Check whether file whether file exists or not.
			//If yes then display associated message
			if(file.exists()) {
				System.out.println(" File found");
			} else {
				System.out.println(" File is not found,Please re-check");
			}	PrintWriter pw;  
	        try {  
	            pw = new PrintWriter(fileToBeSearched); //may throw exception   
	            pw.println("saved");  
	        }  
	        // providing the checked exception handler  
	        catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        } 
		}

		//Create a file
		protected static void createFile (String fileToBeCreated) {
			File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeCreated );
			
			try {
				if (file.createNewFile() ) {
					System.out.println("File Created Sucessfully");
				} else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	