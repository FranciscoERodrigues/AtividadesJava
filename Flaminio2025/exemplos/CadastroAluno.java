package exemplos;
import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o seu nome:");
	String nome = sc.next();
	System.out.println("Digite o seu sobrenome:");
	String sobrenome = sc.next();
	System.out.println("Digite a sua idade;");
	int idade = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Digite o seu periodo escolar:");
	String periodo = sc.nextLine();
	
	System.out.println("Digite a sua turma:");
	String turma = sc.nextLine();
	System.out.println("Digite o seu cpf:");
	String cpf = sc.nextLine();
	
	System.out.println("Digite o seu logradouro:");
	String logradouro = sc.nextLine();
	
	System.out.println("Digite o seu CEP:");
	String cep = sc.nextLine();
	
	System.out.println("Digite o seu telefone sem o DDD:");
	String telefone = sc.next();
	System.out.println("Digite o numero do seu RG:");
	String rg = sc.next();
	
	System.out.println("O nome do aluno:"+nome);
	System.out.println("O sobrenome do aluno:" + sobrenome);
	System.out.println("A idade do aluno;" + idade);
	System.out.println("O aluno estuda no periodo escola:" + periodo);
	System.out.println("O aluno estuda na turma:" + turma);
	System.out.println("Digite o CPF do aluno:" + cpf);
	System.out.println("Qual é o logradouro do aluno:" + logradouro);
	System.out.println("Qual é o CEP do aluno:"+ cep);
	System.out.println("Digite o numero de contato do aluno sem o DDD:" + telefone);
	System.out.println("Digite o RG do Aluno:" + rg);
	
	sc.close();
	}
}
