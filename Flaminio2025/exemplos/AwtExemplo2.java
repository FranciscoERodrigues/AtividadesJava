package exemplos;

import java.awt.*;    

class AwtExemplo2{
	
	AwtExemplo2(){
		
	Frame f = new Frame();
		
	Label l = new Label("ID do funcionário:");
		
	Button b = new Button("Enviar");  
	    
	TextField t = new TextField();  

	l.setBounds(20, 80, 80, 30);  
	t.setBounds(20, 100, 80, 30);  
	b.setBounds(100, 100, 80, 30); 
	
	f.add(t);
	f.add(b);
	f.add(l);
		
    f.setSize(400,300);  
    f.setTitle("Informações do funcionário");   
    f.setLayout(null); 
    f.setVisible(true);  
 
	}
	
	public static void main(String []args) {
		
		AwtExemplo2 awt_obj  = new AwtExemplo2();    
	}
	
	
}
