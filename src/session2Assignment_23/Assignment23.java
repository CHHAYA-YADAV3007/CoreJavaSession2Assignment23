/**
 * Assignment23.java
 */
package session2Assignment_23;
/**
 * 
 * This class will display below structure with looping structures & conditional structures.
 *     *___*
 *     _*_*
 *     __*
 *     _*_*
 *     *___*
 *     
 *     AUTHOR : CHHAYA YADAV
 *
 */
public class Assignment23 {
	
//Main method declaration	
	
public static void main(String[] args){
	
//Variable declaration
	int  i ,j,k ;
//code logic to write first 3 lines	
for(i=1;i<4;i++){	
	
		for(j=1;j<=i;j++)
		{
			if(j==i)
				System.out.print("*");
			else
				System.out.print("_");
		}	
		
		for(int m = 3; m>i;m--){
			    System.out.print("_"); 
	    }
			
		for(k=4; k>i;k--){
		    if(k==(i+2))
			    System.out.print("*");
		    else if (k==(i+1))
		        System.out.print("");
		    else
		        System.out.print("_");
		}
		System.out.println();
}
	
//code logic to write last two lines
for(i=0;i<2;i++){
	
		for(j=2;j>i;j--){
		
			if (i==(j-1))
		       System.out.print("*");
            else 
			   System.out.print( "_");
				
		}
		
        for(int n = 0; n<=i;n++){
			   System.out.print("_"); 
		}
		
       
        for(j=0;j<=i;j++){
   			if(i==j)
 			   System.out.print("*");
 			else
 			   System.out.print("_");
 		}	
       
       

		System.out.println();
}
	
}
}




