package udemy;


import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
	
System.out.println();
Scanner scan = new Scanner(System.in);
System.out.println("Digite seu nome: ");
String nome = scan.nextLine();

System.out.println("Digite seu sobrenome: ");
String sobrenome = scan.nextLine();

System.out.println("Digite sua idade: ");
int idade = scan.nextInt();


System.out.println("Nome: "+ nome + "\nSobrenome: "+ sobrenome + "\n Idade:" + idade);
scan.close();

}
}