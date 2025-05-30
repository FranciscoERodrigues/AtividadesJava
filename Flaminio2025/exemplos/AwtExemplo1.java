package exemplos;

import java.awt.*;    

public class AwtExemplo1 extends Frame {
	
	AwtExemplo1(){
		
		Button b = new Button("Clique aqui !!");
		
		b.setBounds(30,100,80,30); 
		
	    add(b);  
	    
	    setSize(300,300);  
	    
	    setTitle("Este é nosso exemplo básico de AWT");   
	    
	    setLayout(null);  
	    
	    setVisible(true);  

	}
	
	public static void main(String args[]) {   
	  
	 AwtExemplo1 f = new AwtExemplo1();    
	  

	}    
	
	

}
