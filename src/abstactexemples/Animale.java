package abstactexemples;

public abstract class Animale {
	public abstract void makeSound();
	
	
	
//public void makeSound()
//{
//System.out.println(""); 
	// impossible sans spécification d'animale
//}
public void dormir()
{
System.out.println("zzzzz");	

}
public void manger(String nourriture)
{
	
System.out.println("manger : "+ nourriture);
}
}
