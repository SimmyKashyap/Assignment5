class staticblock { 
    static int i; 
    static {
		 i = 10; 
		System.out.println("static block is running "); 
		 }  
 public static void main(String args[]) { 
     System.out.println(staticblock.i);  
    } 
	} 
