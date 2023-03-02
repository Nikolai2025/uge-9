import java.util.Scanner;


class Main{
	
	public static void main(String[]args){
		int retire =67;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please type your name: ");
	String name = sc.nextLine();
	

	System.out.println("Please type your age: ");
	int age = sc.nextInt();
	
	System.out.println("your name is "+name+" and your are "+age+" years old");
	sc.nextInt();
	int retirement=retire-age;

	System.out.println("you will retire in "+ retirement+ "years");

}
}