import java.io.*;
import java.util.Scanner;

/*
 * Segundo Ejecutable con un archivo de texto 
 * Aranza Ibarra Camarena 
 * 200258 
 * 
 */
public class EjecutableEmpresa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa JYP, SM, HYBE, YG; 
		File ArchivoJYP, ArchivoSM, ArchivoHYBE, ArchivoYG;
		Scanner dato; 
		int i, MAXF, venta;
		String nombre, ventasmayores, ventasmenores;
		char tipo;
		boolean resp;
		
		JYP= new Empresa("JYP", 1997);
		ArchivoJYP= new File("DatosJYP.txt");
		try {
			dato=new Scanner(ArchivoJYP);
			MAXF=dato.nextInt();
			
			for(i=0; i<MAXF;i++) {
				nombre=dato.next();
				venta=dato.nextInt();
				tipo=dato.next().charAt(0);
				resp=JYP.altaAristas(nombre, venta, tipo);
				/*if (resp)
					System.out.println("Alta Exitosa"); 
				else 
					System.out.println("Alta NO Exitosa");
					*/
				}
			System.out.println(JYP.toString());
			
			ventasmayores=JYP.mayoresVentas('F');
			System.out.println("\n El/la artista con mayores ventas:  "+ventasmayores);
			
			ventasmenores=JYP.menoresVentas('M');
			System.out.println("\n El/la artista con menores ventas:  "+ventasmenores);
			
			SM=new Empresa("SM", 1995);
			ArchivoSM= new File("DatosSM.txt");
				dato=new Scanner(ArchivoSM);
				MAXF=dato.nextInt();
				
				for(i=0; i<MAXF;i++) {
					nombre=dato.next();
					venta=dato.nextInt();
					tipo=dato.next().charAt(0);
					resp=SM.altaAristas(nombre, venta, tipo);
					/*if (resp)
						System.out.println("Alta Exitosa"); 
					else 
						System.out.println("Alta NO Exitosa");
						*/
					}
				System.out.println(SM.toString());
				
				ventasmayores=SM.mayoresVentas('F');
				System.out.println("\nEl/la artista con mayores ventas:  "+ventasmayores);
				
				ventasmenores=SM.menoresVentas('M');
				System.out.println("\nEl/la artista con menores ventas:  "+ventasmenores);
			
				HYBE=new Empresa("HYBE", 2005);
				ArchivoHYBE= new File("DatosHYBE.txt");
					dato=new Scanner(ArchivoHYBE);
					MAXF=dato.nextInt();
					
					for(i=0; i<MAXF;i++) {
						nombre=dato.next();
						venta=dato.nextInt();
						tipo=dato.next().charAt(0);
						resp=HYBE.altaAristas(nombre, venta, tipo);
						/*if (resp)
							System.out.println("Alta Exitosa"); 
						else 
							System.out.println("Alta NO Exitosa");
						*/
						}
					System.out.println(HYBE.toString());
					
					ventasmayores=HYBE.mayoresVentas('F');
					System.out.println("\nEl/la artista con mayores ventas:  "+ventasmayores);
					
					ventasmenores=HYBE.menoresVentas('M');
					System.out.println("\nEl/la artista con menores ventas:  "+ventasmenores);
				
					YG=new Empresa("YG", 1996);
					ArchivoYG= new File("DatosYG.txt");
						dato=new Scanner(ArchivoYG);
						MAXF=dato.nextInt();
						
						for(i=0; i<MAXF;i++) {
							nombre=dato.next();
							venta=dato.nextInt();
							tipo=dato.next().charAt(0);
							resp=YG.altaAristas(nombre, venta, tipo);
							/*if (resp)
								System.out.println("Alta Exitosa"); 
							else 
								System.out.println("Alta NO Exitosa");
								*/
							}
						System.out.println(YG.toString());
						
						ventasmayores=YG.mayoresVentas('F');
						System.out.println("\nEl/la artista con mayores ventas:  "+ventasmayores);
						
						ventasmenores=YG.menoresVentas('M');
						System.out.println("\nEl/la artista con menores ventas:  "+ventasmenores);
		}
			catch (Exception e) {
				System.out.println(e.toString());
				e.printStackTrace();
			}
			
			

		}

	}
