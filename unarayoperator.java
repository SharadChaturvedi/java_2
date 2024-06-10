public class unarayoperator {

    public static void main(String [] args)
{
    int var1, var2;
    var1=50;

   // var2=-var1;//inverting the sign of the value of var1
   // var2= ++var1;//pre-increment ,increase var1 by 1 then assign to var2
   // var2 = var1++;//post increment store previous value then increase var1 by 1
   // var2=--var1;//pre-decreement decrease var1 by 1 then assign to var2
    var2=var1--;
    System.out.println("the var1=" + var1 + ", var2=" + var2);
}    
}
