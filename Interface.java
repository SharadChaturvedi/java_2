interface Animal {
    void makessound();//Abs method doesnt have a body.
}
 class Cat implements Animal{
    public void makessound(){
        System.out.println("\nMeeo Meeo");
    }
 }

 public class Interface
 {
 public static void main (String[] args){
    Cat cat = new Cat();
    cat.makessound();

 }
}