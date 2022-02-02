

public class Throw1 {
	
	   public static void validate(int marks) {  
	        if(marks<40) {  
	         	      throw new ArithmeticException("Person is not eligible to addmission");    
	        			}  
	        else {  
	            System.out.println("Person is eligible to addmission");  
	        	}  
	    }  

	public static void main(String[] args) {
		   
		        validate(35);  
		        System.out.println("rest of the code...");    
		

	}

}