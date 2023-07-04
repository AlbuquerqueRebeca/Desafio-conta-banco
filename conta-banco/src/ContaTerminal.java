import java.util.Scanner;

public class ContaTerminal {
       
     //atributos
	  int numero;
	  String agencia;
	  String nomeCliente;
	  double  saldo;
	  
	  
	  
	  
	  
	 //construtores com parametros e seus tipos 
	 public void setNumero(int numero) {  //construtor do tipo inteiro
		this.numero = numero;
	}
	  
	public void setAgencia(String agencia) { 
		this.agencia = agencia;
	}
	
	public void setNomeCliente(String nomeCliente) { // construtor  do tipo string
		this.nomeCliente = nomeCliente;
	}
	
	public void setSaldo(double saldo) { //contrutor do tipo double
		this.saldo = saldo;
	}
	 
	  public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // para o armazenamento de dados do usuario

		//mensagens para digitar os dados
		//para aparecer no terminal
		
		System.out.print("Por favor, digite o numero da sua conta: ");
		int numero = entrada.nextInt();
		System.out.println("Usuário: 1021");

		System.out.print("Por favor, Digite a sua agência: ");
		String agencia = entrada.next(); 
		entrada.nextLine();

		System.out.print("Digite seu nome: ");
		String nomeCliente = entrada.nextLine();

	    System.out.print("Digite seu saldo: ");
		double saldo = entrada.nextDouble();
      //mensagem da abertura de conta para o usuario
		System.out.println("\nOlá! Mario Andrade,\nobrigado por criar uma conta em nosso banco, \nsua agência é 067-8, conta: 1021 e seu saldo R$ 237.48 \njá está dísponivel para saque   " + numero + agencia + nomeCliente + saldo );
		
		//criando a instancia

		ContaTerminal minhaConta = new ContaTerminal();
		
		minhaConta.setNumero(numero);
		minhaConta.setAgencia(agencia);
		minhaConta.setNomeCliente(nomeCliente);
	    minhaConta.setSaldo(saldo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	  }

	  
	 
	  

	 
	  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	   















	  }  
     


      
	  
	



     
     







       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        






















    

