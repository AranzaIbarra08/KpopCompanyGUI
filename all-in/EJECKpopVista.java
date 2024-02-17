import java.io.File;
import java.util.Scanner;

public class EJECKpopVista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//VistaGenero miVentana; 
		ControladorGenero miVentana;
		GeneroMusica Kpop;
		Scanner dato; 
		File ArchivoEmp;
		String nombre, nombreA;
		int MAX, anio, i, j, MAXA; 
		boolean resp;

		char tipo;
		double venta;
		

		
		Kpop= new GeneroMusica("coreano", 1990);
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
		
		}
		catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
				
				
				//miVentana= new VistaGenero(); 
				miVentana= new ControladorGenero();
			
				
				miVentana.pack();
				miVentana.setVisible(true);
				
				
	}

}
