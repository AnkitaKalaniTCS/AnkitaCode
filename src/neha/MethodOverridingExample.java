package neha;

import javax.management.remote.SubjectDelegationPermission;

public class MethodOverridingExample {
public static void main(String[] argStrings) {
	
	Animal animal=new Animal();
	Dog dog=new Dog();
	Animal a = new Dog();
	a.eat();
	animal.eat();
	dog.eat();
	
	
}
}
