package interfaceGrafica;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  

public class CalculadoraJ implements ActionListener {  
	
	//Criação dos campos de texto
	JTextField campoTexto01,campoTexto02,campoTexto03;
	//Criação do botão
	JButton botaoSoma,botaoSubtracao;
	//
   
	CalculadoraJ(){
		//Criação de um frame(Quadro)
		JFrame quadroPrincipal = new JFrame();
		campoTexto01 = new JTextField();
		campoTexto01.setBounds(50,50,150,20);
		campoTexto02 = new JTextField();
		campoTexto02.setBounds(50,100,150,20);
		campoTexto03 = new JTextField();
		campoTexto03.setBounds(50,150,150,20);
		
		//campoTexto03 NÃO pode ser editado ou preenchido.
		campoTexto03.setEditable(false);
		
		//Instanciação dos botões e inserção dos botões no Frame. 
		botaoSoma = new JButton("+");
		botaoSoma.setBounds(50,200,50,50);
		botaoSubtracao = new JButton("-");
		botaoSubtracao.setBounds(50,200,50,50);
		
		//Adicionando evendo ao botão
		// this = acão
		botaoSoma.addActionListener(this);
		botaoSubtracao.addActionListener(this);
		
		//adicionar componentes ao nosso quadro
		quadroPrincipal.add(campoTexto01);
		quadroPrincipal.add(campoTexto02);
		quadroPrincipal.add(campoTexto03);
		quadroPrincipal.add(botaoSoma);
		quadroPrincipal.add(botaoSubtracao);

		//configurando as informações do frame(quadro)
		quadroPrincipal.setSize(300,300);
		quadroPrincipal.setLayout(null);
		quadroPrincipal.setVisible(true);			
	}	
	
	//Criação da ação quando é disparado a acão atraves do aperto do botão.
	
	  public void actionPerformed(ActionEvent e){
		  
		  //Declaração das Variaveis
		  
		String numero1=campoTexto01.getText();
		String numero2=campoTexto02.getText();
	
	// Converter os valores das variaves por inteiros.
	
		int numero01=Integer.parseInt(numero1);
		int numero02=Integer.parseInt(numero2);
		
	// criar um resultado para o resultado.
		
		int resultado = 0;
		
		//Verificar qual botão foi clicado
		
		if(e.getSource() == botaoSoma) {			
			resultado=numero01+numero02;
		}else if(e.getSource() == botaoSubtracao) {
			resultado=numero01+numero02;					
		}
		
		//converter o resultado inteiro para string 
		
		String resultadoFinal = String.valueOf(resultado);
		
		
		
		
		
		}
		
	
	
	
	
	
		  
		  
	  }
	
	
}