import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * Aranza Ibarra Camarena 
 * 200258 
 * 
 */
public class ControladorGenero extends VistaGenero {
	private GeneroMusica Kpop; 
	
	
	
	public void limpia() {
		CT1.setText("");
		CT3.setText("");
		CT5.setText("");
		CT2.setText("");
		
		
	}
	

	public void leeArchivo() {
		
		Scanner dato; 
		File ArchivoEmp;
		String nombre, nombreA;
		int MAX, anio, i, j, MAXA; 
		boolean resp;
		
		char tipo;
		double venta;
		

		
		
		ArchivoEmp= new File("DatosEmpresas1.txt");
		try {
		dato=new Scanner(ArchivoEmp);
		MAX=dato.nextInt();
		for(i=0; i<MAX; i++) {
			nombre=dato.next();
			anio=dato.nextInt();
			resp=Kpop.altaEmpresa(nombre, anio);
			
			MAXA=dato.nextInt();
			for(j=0; j<MAXA;j++) {
				nombreA=dato.next();
				venta=dato.nextInt();
				tipo=dato.next().charAt(0);
				resp=Kpop.altaArtistas(nombreA, venta, tipo,i);
				
		}
			
			
		}
			dato.close();
			
		} catch (FileNotFoundException f) {
			TA3.setText("FILE NOT FOUND");
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
		
	}
	public class EscuchaBuscaEmpresa implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int r, r1;
			String nombre, r2; 
			TA4.setText("");
			nombre=CT2.getText();
			r=Kpop.buscaEmpresa(nombre);
			
			if(r<0 ) {
				r1=r+5;
				r2=Integer.toString(r1);
				
			TA4.setText(r2);
		}
			if(r==4) {
				r2="-1";
			TA4.setText(r2);
			}
			else { 
				r1=r;
				r2=Integer.toString(r1);
				TA4.setText(r2);
		}
			limpia();
		}
	}
	public class EscuchaVentasMas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String emp, artista;
			int emp2;
			char T;
			TA1.setText("");
			emp=CT1.getText();
			emp2=Integer.parseInt(emp);
			T=CT5.getText().charAt(0);
			
			artista=Kpop.mayoresVentas(emp2, T);
			TA1.setText(artista);
			limpia();
		}
	}
	public class EscuchaVentasMenos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String emp, artista;
			int emp2;
			char T;
			TA2.setText("");
			emp=CT1.getText();
			emp2=Integer.parseInt(emp);
			T=CT5.getText().charAt(0);
			
			artista=Kpop.menoresVentas(emp2, T);
			TA2.setText(artista);
			limpia();
		}
	
	
}
	public class EscuchaBuscaArtista implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int emp2; 
			boolean resp;
			String emp, nombre, resp1;
			
			TA3.setText("");
			emp=CT1.getText();
			emp2=Integer.parseInt(emp);
			
			nombre=CT3.getText();
			resp=Kpop.encuentraArtista(nombre, emp2);
			if(resp)
				resp1="SI ESTA";
			else 
				resp1="NO ESTA";
			TA3.setText(resp1);
			limpia();
			
		}
	}
	
	public class EscuchaJYP implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ControladorJYP JYP;
			
			
			JYP=new ControladorJYP();
			JYP.pack();
			JYP.setVisible(true);
			
			
		}
		
	}
	public class EscuchaSM implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ControladorSM SM;
			
			
			SM=new ControladorSM();
			SM.pack();
			SM.setVisible(true);
			
			
		}
		
	}
	public class EscuchaHYBE implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ControladorHYBE HYBE;
			
			
			HYBE=new ControladorHYBE();
			HYBE.pack();
			HYBE.setVisible(true);
			
			
		}
		
	}
	public class EscuchaYG implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ControladorYG YG;
			
			
			YG=new ControladorYG();
			YG.pack();
			YG.setVisible(true);
			
			
		}
		
	}
	public ControladorGenero() {
		super();
		Kpop=new GeneroMusica("coreano", 1990);
		leeArchivo();
		
		BT5.addActionListener(new EscuchaBuscaEmpresa());
		BT6.addActionListener(new EscuchaVentasMas());
		BT7.addActionListener(new EscuchaVentasMenos());
		BT8.addActionListener(new EscuchaBuscaArtista());
		BT1.addActionListener(new EscuchaJYP());
		BT2.addActionListener(new EscuchaSM());
		BT3.addActionListener(new EscuchaHYBE());
		BT4.addActionListener(new EscuchaYG());
		
		limpia();
		
		
	}

}
