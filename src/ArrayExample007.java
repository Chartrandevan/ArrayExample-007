/********************************************************************
 * Programmer:	sveinson
 * Class:  CS40S
 *
 * Assignment: Array Example
 * Program Name:  ArrayExample007
 *
 * Description: examples of array processing from loading an array
 *              to some common array functions
 *
 * Input: integer values, either from keyboard or file
 *
 * Output: various results of array processing
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class ArrayExample007 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";                 // delimiter string for splitting input string
        String nl = System.lineSeparator();     // new line character
    	
    // create instances of objects for i/o and formatting
    
    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
        try{
    	BufferedReader fin = new BufferedReader(new FileReader("arrayData.xt"));
        } // end try
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"file not found");
        } // end catch
        
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
        printBanner();
        fileBanner(fout);
        bannerOut = windowBanner();
 	    	
    // ************************ get input **********************

    /*	prompt = "Enter your prompt text here. \n";	
    	prompt += "you may need to add additional lines\n";
    	prompt += "or delete some of these prompt lines.\n\n";
    
    	
    	strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
    */
    	/* **********************************
    	 * split the input string into tokens
    	 * use the value in delim as the delimieter
    	 * uncomment the line to use it.
    	 ************************************/
    	//String[] tokens = strin.split(delim);
    	

    // ************************ processing ***************************
    
    // ************************ print output ****************************

    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
    
   //************************************************
    // Purpose: print an output banner to the output window
    // Interface: IN: none
    // Returns: none
    // *****************************************************
    public static void printBanner(){
        System.out.println("*******************************************");
        System.out.println("Name:		your name here");
        System.out.println("Class:		CS20S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");
    }  // end print banner
    
    //************************************************
    // Purpose: print an output banner to the output file
    // Interface: IN: PrintWriter
    // Returns: none
    // *****************************************************
    public static void fileBanner(PrintWriter fo){
        fo.println("*******************************************");
        fo.println("Name:		your name here");
        fo.println("Class:		CS20S");
        fo.println("Assignment:	Ax Qy");
        fo.println("*******************************************");    
    } // end fileBanner
    
    //************************************************
    // Purpose: Make an output banner string to use with message
    //          dialogs
    // Interface: IN: none
    // Returns: output banner string
    // *****************************************************
    public static String windowBanner(){
        // *** local variabls ***
        
        String bannerOut;               // output banner for windows
        
        // **** create banner ****
        
        bannerOut = "*******************************************\n";
        bannerOut += "Name:		your name here\n";
        bannerOut += "Class:		CS20S\n";
        bannerOut += "Assignment:	Ax Qy\n";
        bannerOut += "*******************************************\n\n";  
        
        // *** return the banner ***
        
        return bannerOut;           
    } // end windowBanner
}  // end class
