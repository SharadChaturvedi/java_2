public class JavaStringFunctions {
    public static void main(String[] args) {
        //String str1 = "HELLO";
       // String str2 = "Hello";
       String str1="Sharad",str2="Riya";
        
        System.out.println("The length of \"" + str1 + "\" is " + str1.length());
        // str1.length() will give the length of the String str1

        if (str1.equals(str2)){
            System.out.println("Both strings" +str1 + str2+ "are equal");
        }
        else
        
            System.out.println("Both strings  " + str1 + " and " + str2 + "  are not equal");


             // Compare strings ignoring case
             //Here .equalsIgnoreCase  it doest care about the Upper Case or Lower Case
             // if they have the same value it will give equal values 

           
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both strings are equal ignoring case");
        } else {
            System.out.println("Both strings are not equal");
        }

        
        
    }
}
