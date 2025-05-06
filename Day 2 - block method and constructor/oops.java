class Animal{
static void eat(){
System.out.println("Animal is eating");
}
}
class Dog extends Animal{
static void eat(){
System.out.println("Dog is eating");
}
}
public class Main{
public static void main(String[] args){
Animal.eat();
Dog.eat();
}
}