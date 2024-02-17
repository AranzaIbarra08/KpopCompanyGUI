import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

/*
 * Aranza Ibarra Camarena 
 * 200258 
 */
public class VistaGenero extends JFrame {
	protected JLabel LE, LN, LA, LT, LNE, LP, etAux;
	protected JButton BT1, BT2, BT3, BT4, BT5, BT6, BT7,BT8, BT9; 
	protected JTextField CT1, CT2, CT3, CT5;
	protected JTextArea TA1, TA2, TA3, TA4; 
	protected Border miBorde, borde1; 
	protected JPanel miPanel; 
	
	public VistaGenero() {
		super("Genero de Musica: KPOP");
		miPanel=new JPanel(new GridLayout (5,5)); 
		miPanel.setBackground(Color.pink);
		//cambiar letra
		
		miBorde=BorderFactory.createEmptyBorder(10,20, 10, 10); 
		miPanel.setBorder(miBorde);
		
		//UNO
		LE=new JLabel("Empresas");
		miPanel.add(LE);
		LN=new JLabel("#Empresa"); 
		miPanel.add(LN);
		LA=new JLabel("Artista"); 
		miPanel.add(LA);
		LT=new JLabel("Tipo");
		miPanel.add(LT);
		etAux= new JLabel(""); miPanel.add(etAux);
		
		
		//DOS
		BT1=new JButton("JYP");
		BT1.setBackground(Color.yellow);
		miPanel.add(BT1);
		CT1=new JTextField(10);
		miPanel.add(CT1);
		CT3=new JTextField(10);
		miPanel.add(CT3);
		CT5=new JTextField(10);
		miPanel.add(CT5);
		BT5=new JButton("Busca Empresa");
		BT5.setBackground(Color.yellow);
		miPanel.add(BT5);
		
		//TRES
		BT2=new JButton("SM");
		BT2.setBackground(Color.red);
		miPanel.add(BT2);
		LNE=new JLabel("Empresa");
		miPanel.add(LNE);
		LP=new JLabel("Posicion");
		miPanel.add(LP);
		TA1= new JTextArea();
		borde1=BorderFactory.createLoweredSoftBevelBorder();
		TA1.setBorder(borde1);
		miPanel.add(TA1);
		BT6=new JButton("MAYORES VENTAS");
		BT6.setBackground(Color.red);
		miPanel.add(BT6);
		
		//CUATRO
		BT3=new JButton("HYBE");
		BT3.setBackground(Color.MAGENTA);
		miPanel.add(BT3);
		CT2=new JTextField(10);
		miPanel.add(CT2);
		TA4=new JTextArea();
		miPanel.add(TA4);
		TA2= new JTextArea();
		TA2.setBorder(borde1);
		miPanel.add(TA2);
		BT7=new JButton("MENORES VENTAS");
		BT7.setBackground(Color.MAGENTA);
		miPanel.add(BT7);
		
		//CINCO 
		BT4=new JButton("YG");
		BT4.setBackground(Color.lightGray);
		miPanel.add(BT4);
		etAux= new JLabel(""); miPanel.add(etAux);
		etAux= new JLabel(""); miPanel.add(etAux);
		TA3= new JTextArea();
		TA3.setBorder(borde1);
		miPanel.add(TA3);
		BT8=new JButton("Busca Artista");
		BT8.setBackground(Color.lightGray);
		miPanel.add(BT8);
		
		
		
		
		

		super.setContentPane(miPanel);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
}
}