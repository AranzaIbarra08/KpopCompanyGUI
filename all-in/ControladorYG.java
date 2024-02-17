import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JTextField;

public class ControladorYG extends VistaYG{
	private final int MAXF=3;
	private final int MAXC=4;
	private JTextField matrizAux[][];
	
	public void creaMatriz() { 
		
		matrizAux=new JTextField[MAXF][MAXC];
		matrizAux[0][0]=ctm00;matrizAux[0][1]=ctm01; matrizAux[0][2]=ctm02;matrizAux[0][3]=ctm03;
		matrizAux[1][0]=ctm04;matrizAux[1][1]=ctm05; matrizAux[1][2]=ctm06;matrizAux[1][3]=ctm07;
		matrizAux[2][0]=ctm08;matrizAux[2][1]=ctm09;matrizAux[2][2]=ctm10; matrizAux[2][3]=ctm11;
		
	}
	public void muestraMatriz() {
		Empresa YG; 
		File miArchivo; 
		Scanner lectura; 
		int n, i;
		String nombre;
		char tipo; 
		double ventas;
		boolean resp;
		
		YG= new Empresa("YG", 1996);
		miArchivo=new File("DatosYG.txt");
		try {
			lectura= new Scanner(miArchivo);
			n=lectura.nextInt();
			for(i=1;i<=n; i++) {
				nombre=lectura.next();
				ventas=lectura.nextDouble();
				tipo=lectura.next().charAt(0);
				resp=YG.altaAristas(nombre, ventas, tipo);
			}
			lectura.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int m, j; 
		for(m=0; m<MAXF; m++)
			for (j=0; j<MAXC; j++)
				matrizAux[m][j].setText(YG.regresaArtista(m,j));
	}
	
	public ControladorYG() {
		super();

		creaMatriz();
		
		muestraMatriz();
	
	}
}
