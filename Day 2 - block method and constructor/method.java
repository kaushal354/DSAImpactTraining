// using static keyword static block will be created and it is a singleton block
//static method :- for static method no need to create an object static will act as instance or object and using class name 
//you can call static methods

class Demo{
static{
	System.out.println("Static Block");
	}
	Demo(){
	System.out.println("Cosntructor");
	}
}
public class q2{
	public static void main(String[] args){
	Demo d1 = new Demo();
	Demo d2 = new Demo();
	}
}

class q2{
	public static void main(String[] args){
	Demo d1 = new Demo();
	Demo d2 = new Demo();
	}
}

class Demo{
static{
	System.out.println("Static Block");
	}
	Demo(){
	System.out.println("Cosntructor");
	}
}

// example for static method
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