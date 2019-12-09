//***********************************************************************************************
    // Written by: Tashfia Naharin Proma
	// Winter 2018
//***********************************************************************************************

//Date: 23rd March 2018

/*This program gives user options to choose from and displays pattern according to their user's input.
  The program repeats until user chooses option 9, to leave.
*/

import java.util.Scanner;
public class Displaypatterns {

public static void main(String[] args) {
		
	Scanner keyIn= new Scanner(System.in);  //Declaring the scanner.
	
	//Declaring the variables.
	int startingNum, choice, size;
	char character, character1, character2, characterEven, characterOdd;
	String inputChar, inputChar1, inputChar2;
	char [][] square;
   	int [][] number;
   	
	System.out.println("|-------****-------****-------****-------****-------****-------|");
	System.out.println("|       Welcome to the Decorated Square Drawing Program!       |");	//Welcome message
	System.out.println("|-------****-------****-------****-------****-------****-------|");
    System.out.println();

	do {
	    System.out.println("What type of square would you like?");  //Displaying cases.
	    System.out.println("       1 - Full square");
	    System.out.println("       2 - Hollow square");
	    System.out.println("       3 - An X");
	    System.out.println("       4 - Horizontal Bars");
	    System.out.println("       5 - Vertical Bars");
	    System.out.println("       6 - Diagonal Bars");
	    System.out.println("       7 - Integer Filled Square");
	    System.out.println("       8 - Checkered (must be a multiple of 4)");
	    System.out.println("       9 - Quit");
	    
	    
	    //This loop is to ensure the choice is in between the given range.
	    do {
	        System.out.print("Enter your choice (1 to 9): ");  //Asking user for input.
		    choice= keyIn.nextInt();
		    if(choice>9 || choice<1)
		    System.out.println("Sorry! That is an illegal choice."); //Error message if not in range.
	       } while (choice>9 || choice<1);
		
	        System.out.println();
	    
	    //The choices and the respective patterns they will make.
	    switch(choice)
	      { 
	       case 1: {  //First choice.
	    	   
			    	//This loop is to ensure the size is between the given range.
		    	    do {
		    		    System.out.print("How many rows and columns (min 4 & max 20)? ");
		    		    size= keyIn.nextInt();
		    	       } while(size>20 || size<4);
		    	    
		    	    square = new char [size][size];  //This is to make the array of the input size.
		    	    
	    		    System.out.print("Which character do you want to fill your square with? ");
	    		 	inputChar =keyIn.next();  //For storing the character.
	    		 	
	    		 	 //to ensure it is one character.
	    		 	character =inputChar.charAt(0);
	    		 	
	    		     System.out.println();
	    		 	 System.out.println("Here is your pattern");  //A message to let user know.
	    		     System.out.println();
	    		     
	    		     //for storing the character in array and displaying the pattern;
	    		     for(int row =0; row<square.length; row++)
	    		 	  {
	    		 		  for(int column =0; column<square[row].length; column++)
	    		 		   { square[row][column]=character;  
	    		 		    System.out.printf("%2c",square[row][column]);  
	    		 		   }
	    		 	   	  System.out.println();
	    		 	  }
	                 System.out.println();  // for creating space when the first do-loop repeats all case. 
	               }   
	       break;
	       
	       case 2: {  //Second choice.
	    	   
			    	 //This loop is to ensure the size is between the given range.
			   	    do {
			   		    System.out.print("How many rows and columns (min 4 & max 20)? ");
			   		    size= keyIn.nextInt();
			   	       } while(size>20 || size<4);
			   	    
			   	    square = new char [size][size];  //This is to make the array of the input size.
			   	    
				    System.out.print("Which character do you want for the border? ");
					inputChar =keyIn.next();
						
					//to ensure it is one character.
				    character =inputChar.charAt(0);
						
				    //The for loop below is used to store the character.
					for (int i = 0; i < size; i++)
					{square[0][ i] = character;  //top of the square.
					 square[i][0] = character;   //Left side of the square.
					 square[i][size - 1] = character;  //Right side of the square.
					 square[size - 1][i] = character;  //Bottom of the square.
				    }
					
					System.out.println();
					System.out.println("Here is your pattern");
					System.out.println();
					    
					//This for loops is used to display the hollow square.
				    for(int row =0; row<square.length; row++)
				  	  {
					  	   for(int column =0; column<square[row].length; column++)
					  	   System.out.printf("%2c",square[row][column]);  
					  		  
					  	   System.out.println();
				      }
				     System.out.println();      
	               }
	       break;
	       
	       case 3: {   //Third choice.
	    	   
	    	        //This loop is to ensure the size is between the given range.
			    	do {
		    		    System.out.print("How many rows and columns (min 4 & max 20)? ");
		    		    size= keyIn.nextInt();
			    	   } while(size>20 || size<4);
			    	    
			    	square = new char [size][size];  //This is to make the array of the input size.
			    		
			    	System.out.print("Which character do you want for the X? ");
			    	inputChar1 =keyIn.next();
			    	
			    	System.out.print("Which character do you want around the X? ");
			    	inputChar2 =keyIn.next();
			    		
			    	//to ensure it is both are a single character.
			    	character1 =inputChar1.charAt(0);
			    	character2 =inputChar2.charAt(0);
			    	
			    	System.out.println();
			    	System.out.println("Here is your pattern");
			        System.out.println();
			    	    
			    	    //This for loop is for storing in the array and displaying the pattern.
			    	 for(int row =0; row<square.length; row++)
			    		  {
			    			  for(int column =0; column<square.length; column++)
			    			  {   
			    				  if (row==column || row+column-1==(square.length-2))
			    				  square[row][column]=character1;  
			    			      else
			    			      square[row][column]=character2;
			    			  
			    			      System.out.printf("%2c",square[row][column]);  
			    		       }
			    		   	  System.out.println();
			    		  }
			         System.out.println();  
	               }
	       break; 
	       
	       case 4: {  //Fourth Choice.  
	    	   
			    	//This loop is to ensure the size is between the given range.
			   	    do {
			   		    System.out.print("How many rows and columns (min 4 & max 20)? ");
			   		    size= keyIn.nextInt();
			   	       } while(size>20 || size<4);
			   	    
			   	    square = new char [size][size];  //This is to make the array of the input size.
			   	    
		    	   
		    		
		    		System.out.print("Which character do you want for the even rows? ");
		    		inputChar1 =keyIn.next();
		    		
		    		System.out.print("Which character do you want for the odd rows?");
		    		inputChar2 =keyIn.next();
		    		
		    		//to ensure both input is one character.
		    		characterEven =inputChar1.charAt(0);
		    		characterOdd =inputChar2.charAt(0);
		    		
		    		System.out.println();
		    		System.out.println("Here is your pattern");
		    	    System.out.println();
		    	     
		    	    //This for loops is used to display the horizontal bar and store in the array too.
		    	    for(int row =0; row<square.length; row++)
		    		  {
		    			  for(int column =0; column<square[row].length; column++)
		    			  {   if ((row%2)==0)
		    				  square[row][column]=characterOdd;  
		    			      else
		    			      square[row][column]=characterEven;
		    			  
		    			      System.out.printf("%2c",square[row][column]);  
		    			  }
		    			  
		    		   	  System.out.println();
		    		  }
		    	     System.out.println();  
	    	       }
		   break;
	       
	       case 5: {  //Fifth choice.
	    	   
	    	        //This loop is to ensure the size is between the given range.
			        do {
			    	    System.out.print("How many rows and columns (min 4 & max 20)? ");
			    	    size= keyIn.nextInt();
			           } while(size>20 || size<4);
			        
			    	square = new char [size][size];
			    	
			    	System.out.print("Which character do you want for the even columns? ");
			    	inputChar1 =keyIn.next();
			    	
			    	System.out.print("Which character do you want for the even columns? ");
			    	inputChar2 =keyIn.next();
			    	
			    	//to ensure both input are one character.
			    	characterEven =inputChar1.charAt(0);
			    	characterOdd =inputChar2.charAt(0);
			    	
			    	System.out.println();
			    	System.out.println("Here is your pattern");
			        System.out.println();
			        
			        //This for loops is used to display the vertical bar and store characters too.
			        for(int row =0; row<square.length; row++)
			    	  {
			    		  for(int column =0; column<square[row].length; column++)
			    		  {   if ((column%2)==0)
			    			  square[row][column]=characterOdd;  
			    		      else
			    		    	  square[row][column]=characterEven;
			    		  
			    		    System.out.printf("%2c",square[row][column]);  
			    		  }
			    		  
			    	   	  System.out.println();
			    	  }
			        System.out.println(); 
			       }
	       break;
	       
	       case 6: {  //Sixth choice.
	    	   
	    	        //This loop is to ensure the size is between the given range.
		    		do {
		    		    System.out.print("How many rows and columns (min 4 & max 20)? ");
		    		    size= keyIn.nextInt();
		    	       } while(size>20 || size<4);
		    	    
		    		square = new char [size][size];  //This is to make the array of the input size.
		    		
		    		System.out.print("Which character do you want for the even diagonals? ");
		    		inputChar1 =keyIn.next();
		    		
		    		System.out.print("Which character do you want for the odd diagonals? ");
		    		inputChar2 =keyIn.next();
		    		
		    		//to ensure the inputs are  one character.
		    		character1 =inputChar1.charAt(0);
		    		character2 =inputChar2.charAt(0);
		    		
		    		System.out.println();
		    		System.out.println("Here is your pattern");
		    	    System.out.println();
		    	    
		    	    //for storing and displaying. 
		    	    for(int row =0; row<square.length; row++)
		    		  {
		    			  for(int column =0; column<square[row].length; column++)
		    			  {  
		    				  if (((row%2)==0 &&(column %2)==0 )||((row%2)!=0 &&(column %2)!=0 ))
		    					  square[row][column]=character1;  
		    				  else 
		    				      square[row][column]=character2;
		    				  
		    				  System.out.printf("%2c",square[row][column]);  
		    			  }
		    			  
		    		   System.out.println();
		    		  }
		    	    System.out.println();
	               }
	       break;
	       
	       case 7: {  //Seventh choice.
	    	        
	    	        //This loop is to ensure the size is between the given range.
		    	   	do {
		    	   	    System.out.print("How many rows and columns (min 4 & max 20)? ");
		    	   	    size= keyIn.nextInt();
		    	          } while((size>20 || size<4));
		    	       
		    	   	number = new int [size][size];
		    	   
		    	   //This loop to ensure the number is between the range.	
	    	       do {   
	    	   	    System.out.println("What is the starting number for your integer filled square (between 0 and 50 ");
	    	   	    System.out.print("inclusive): ");
	    	   	    startingNum = keyIn.nextInt();
	    	   	    }while ((startingNum>50)||(startingNum<0));
	    	      
    	          //for storing in the array.
    	          for(int t=0;t<size;t++)
    	          {
    	              for(int p=t; p<size; p++)
    	              {
    	           	   number[p][t]=startingNum;
    	               startingNum++;
    	              }
    	          }
    	          
    	          for(int t=(size-1) ;t>=0; t--)
    	          {
    	              for(int p=(t-1);p>=0;p--)
    	              {
    	           	   number[p][t]=startingNum;
    	           	   startingNum++;
    	              }
    	          }
		    	                  
	    	   	  System.out.println();
	    	      System.out.println("Here is your pattern"); //Displayed to let user know.
	    	   	  System.out.println();
	    	   	
	    	      //For printing the number pattern.
	    	      for(int row =0; row<size; row++)
		    	       {
		    	   		  for(int column =0; column<size; column++)
		    	   		  { 
		    	   	       System.out.printf("%3d",number[row][column]);  
		    	   		  }
		    	   	   	  System.out.println();
		    	       }
	    	        System.out.println();
	               }
	       break;
	       
	       case 8: {  //Eighth choice.
	    	   
	    	        //This loop is to ensure the size is between the given range.
		    		do {
		    		    System.out.print("How many rows and columns (max 20 and multiple of 4)? "); 
		    		    size= keyIn.nextInt();
		    	       } while((size>20 || size<4 )||(size % 4!=0));
		    	    
		    		square = new char [size][size];  //This is to make the array of the input size.
		    		
		    		System.out.print("Which character do you want for the 1st checker? ");
		    		inputChar1 =keyIn.next();
		    		
		    		System.out.print("Which character do you want for the 2nd checker? ");
		    		inputChar2 =keyIn.next();
		    		
		    		//to ensure both are one character.
		    		character1 =inputChar1.charAt(0);
		    		character2 =inputChar2.charAt(0);
		    	    
		    	   //This for loop is for  storing the character's in array.
		    	    for(int row =0; row<square.length; row++)
		    		  {
		    			  for(int column =0; column<square[row].length; column++)
		    			  {  
		    				 if ((column%4)==0 && ((row%4)==0))
		    				 { 
		    					square[row][column]=character2;
		    					column++;
		    					square[row][column]=character2;
		    				 }
		    				 
		    				 else if (((column%4)!=0 && (column%2)==0)&&((row%4)!=0 && (row%2)==0))
		    				 { 
		    					square[row][column]=character2;
		    					column++;
		    					square[row][column]=character2;
		    				 }
		    				 
		    				 else if ((column%4)==0 && ((row-1)%4)==0)
		    				 { 
		    					square[row][column]=character2;
		    					column++;
		    					square[row][column]=character2;
		    				 }
		    				
		    				 else if (((column%4)!=0 && (column%2)==0)&&((row-1)%4!=0 && (row-1)%2==0))
		    				 { 
		    					square[row][column]=character2;
		    					column++;
		    					square[row][column]=character2;
		    				 }
		    				 else 
		    				 {
		    					square[row][column]=character1;
		    					column++;
		    					square[row][column]=character1;
		    				 }
		    				    
		    			  }
		    			  
		    		  } 
		    	    System.out.println();
		    		System.out.println("Here is your pattern");
		    	    System.out.println();
		    	    
		            //For displaying the pattern.
		    	    for(int row =0; row<square.length; row++)
		    		  {
		    			  for(int column =0; column<square[row].length; column++)
		    			  { 
		    		       System.out.printf("%2c",square[row][column]);  
		    			  }
		    			  
		    		   	  System.out.println();
		    		  }
		           System.out.println();
	              }
	       break;
	       
	       case 9:
	       break; 
	       
         } 
	        
	  }while(choice!=9); //This do-while loop is to repeat until choice is 9.
	
	  System.out.println();
	  System.out.println("Hope you enjoyed your patterns!! Come back soon ...");  //Closing Message.

      keyIn.close(); //Closing the scanner.
	}

}
