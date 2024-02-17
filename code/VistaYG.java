import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class VistaYG extends JFrame {
	protected JLabel YG, ANIO, AUX, FEM, MAS, SOL; 
	protected JTextField ctm00, ctm01, ctm02, ctm03, ctm04, ctm05;
	protected JTextField ctm06,ctm07, ctm08, ctm09, ctm10, ctm11; 
	protected Border miBorde; 
	
	protected JPanel miPanel; 
	
	
	public VistaYG(){
		super("YG");
		miPanel=new JPanel(new GridLayout (5,5)); 
		miPanel.setBackground(Color.lightGray);
		
		miBorde=BorderFactory.createEmptyBorder(10,10, 10, 10); 
		miPanel.setBorder(miBorde);
		//UNO 
		YG= new JLabel("YG");
		miPanel.add(YG);
		ANIO= new JLabel("Anio:2005");
		miPanel.add(ANIO);
		AUX=new JLabel("");
		miPanel.add(AUX);
		AUX=new JLabel("");
		miPanel.add(AUX);
		AUX=new JLabel("");
		miPanel.add(AUX);
		// DOS 
		AUX=new JLabel("");
		miPanel.add(AUX);
		AUX=new JLabel("");
		miPanel.add(AUX);
		AUX=new JLabel("");
		miPanel.add(AUX);
		AUX=new JLabel("");
		miPanel.add(AUX);
		AUX=new JLabel("");
		miPanel.add(AUX);
		//TRES 
		FEM=new JLabel("FEMENINO");
		miPanel.add(FEM);
		ctm00=new JTextField(20); miPanel.add(ctm00); 
		ctm01= new JTextField(20); miPanel.add(ctm01);
		ctm02=new JTextField(20); miPanel.add(ctm02); 
		ctm03=new JTextField(20); miPanel.add(ctm03); 
		
		//CUATRO
		MAS=new JLabel("MASCULINO");
		miPanel.add(MAS);
		ctm04=new JTextField(20); miPanel.add(ctm04); 
		ctm05=new JTextField(20); miPanel.add(ctm05);
		ctm06=new JTextField(20); miPanel.add(ctm06); 
		ctm07=new JTextField(20); miPanel.add(ctm07); 
		
		//QUINTO
		SOL=new JLabel("SOLISTA");
		miPanel.add(SOL);
		ctm08=new JTextField(20); miPanel.add(ctm08); 
		ctm09=new JTextField(20); miPanel.add(ctm09);
		ctm10=new JTextField(20); miPanel.add(ctm10); 
		ctm11=new JTextField(20); miPanel.add(ctm11); 
	
		
		
		
		
	super.setContentPane(miPanel);
	super.setDefaultCloseOperation(HIDE_ON_CLOSE);
	}



}
