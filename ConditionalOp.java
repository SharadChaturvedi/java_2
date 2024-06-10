public class ConditionalOp {

    public static void main(String[] args){
        boolean b1,b2,result;

        b1=true;
        b2=false;

        result= b1 || b2;// OR operator gives the value true if one of the value is True 
        System.out.println("The result is " + result);

        result = b1 && b2;//  AND operators returns true only if both operands are true else it gives false 
        System.out.println("The result is " + result); 
    }
    
}
