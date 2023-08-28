interface humanInterface{
	public void eat();
	public void sht();
}
interface animalInterface{
	public void decay();
	public void photosynthesize();
}

class implementsInterface implements animalInterface,humanInterface{
	public void eat(){
		System.out.println("human is eating..");
	}
	public void sht(){
		System.out.println("human is shting..");
	}
	public void decay(){
		System.out.println("plant is decaying..");
	}
	public void photosynthesize(){
		System.out.println("plant is eating..");
	}
}

public class interfaceDemo{
	public static void main(String args[]){
		implementsInterface i=new implementsInterface();
		i.eat();
		i.sht();
		i.decay();
		i.photosynthesize();
	}
}