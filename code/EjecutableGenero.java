import java.io.File;
import java.util.Scanner;

public class EjecutableGenero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneroMusica Kpop;
		ControladorGenero miVentana;
		Scanner dato; 
		File ArchivoEmp;
		String nombre, nombreA;
		int MAX, anio, i, r, r1, j, MAXA; 
		boolean resp;
		String  ventasmayores, ventasmenores;
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
		
		
		System.out.println(Kpop.toString());
		
		r=Kpop.buscaEmpresa("YG");
		if(r<0) {
			r1=r+5; 
			System.out.println("La empresa se encuentra en la posición: "+r1);
		}
		else 
			System.out.println("La empresa se encuentra en la posición: "+r);
			
		ventasmayores=Kpop.mayoresVentas(0, 'F');
		
		ventasmenores=Kpop.menoresVentas(0, 'M');
			
		System.out.println("El artista femenino de JYP con mas ventas es: "+ventasmayores);
		
	System.out.println("El artista masculino de JYP con menos ventas es: "+ventasmenores);
		
		resp=Kpop.encuentraArtista("REDVEL", 1);
		if(!resp)
			System.out.println("El artista NO pertenece a esa empresa");
		else 
			System.out.println("El artista SI pertenece a esa empresa");
		resp=Kpop.bajaArtistas("BP", 'F', 3);
		if(resp)
			System.out.println("Baja Exitosa");
		else 
			System.out.println("Baja NO exitosa");
		
		System.out.println(Kpop.empresas[3].toString());
		miVentana= new ControladorGenero();
		
		
		miVentana.pack();
		miVentana.setVisible(true);
		
		}
		catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		

	}

}


