package abstactexemples;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animale a=new Animale(); => on ne peut plus instancier une classe abstract
		Chat ch=new Chat();
		Chien c=new Chien();
		ch.manger("viande");
		ch.makeSound();
		c.manger("viande");
		c.makeSound();
	}

}
