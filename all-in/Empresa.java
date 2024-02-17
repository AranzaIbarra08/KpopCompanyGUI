import java.util.Objects;

/*
 * Aranza Ibarra Camarena 
 * 200258 
 * Clase para poder dar funcionalidad base a las empresas 
 * Esta se pasara después al Genero de Música
 */
public class Empresa implements Comparable<Empresa>{
	protected String nombre; 
	protected int anio; 
	private final int MAXF=3;
	private final int MAXC=4;
	protected int ocupados; 
	protected Artista[][] artistas; 
	
	public Empresa() {
		artistas= new Artista[MAXF][MAXC]; 
		ocupados=0;
	}

	public Empresa(String nombre, int anio) {
		this();
		this.nombre = nombre;
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return nombre.equals(other.getNombre());
	}
	public int comparteTo(Empresa otra) {
		return nombre.compareTo(otra.getNombre());
	}
	public String toString() {
		StringBuilder sb; 
		int i, j; 
		
		sb=new StringBuilder(); 
		for (i=0; i<MAXF; i++) {
			for (j=0; j<MAXC; j++)
				if(artistas[i][j]!=null)
					sb.append(artistas[i][j].getNombre()+"\t");
			sb.append("\n");
		}
		return sb.toString();
	}
	public boolean altaAristas(String nombre, double venta, char tipo) {
		boolean resp, encontre; 
		Artista artista; 
		int j;
		encontre=false;
		resp=false; 
		
		artista= new Artista (nombre, venta, tipo);
		
		switch (tipo) {
			case 'F':{
				j=0;
				while (j<MAXC && !encontre && artistas[0][j]!=null) {
					if(artistas[0][j].equals(artista))
						encontre=true;
					else 
						j++;
				}
				if (!encontre) {
					artistas[0][j]=artista;
					ocupados++;
					resp=true;
				}
				 break;

				
	}
			case 'M':{
				j=0;
				while (j<MAXC && !encontre && artistas[1][j]!=null) {
					if(artistas[1][j].equals(artista))
						encontre=true;
					else 
						j++;
				}
				if (!encontre) {
					artistas[1][j]=artista;
					ocupados++;
					resp=true;
				}
				break;
			}
			case 'S': {
				j=0;
				while (j<MAXC && !encontre && artistas[2][j]!=null) {
					if(artistas[2][j].equals(artista))
						encontre=true;
					else 
						j++;
				}
				if (!encontre) {
					artistas[2][j]=artista;
					ocupados++;
					resp=true;
				}
				break;
			}

		}
			return resp; 
	}
	public boolean bajaArtista(String nombre, char tipo) {
		boolean resp, encontre; 
		int j;
		
		encontre=false;
		resp=false;
		
		switch (tipo) {
		case 'F':{
			j=0;
			while (j<MAXC && !encontre && artistas[0][j]!=null) {
				if(artistas[0][j].getNombre().equals(nombre))
					encontre=true;
				else 
					j++;
			}
			
			if (encontre) {
				while(j<(MAXC-1) && artistas[0][j+1]!=null) {
					artistas[0][j]=artistas[0][j+1];
					artistas[0][j+1]=null;
					j++;
					resp=true;
				}
			}
			break;
			}
		case 'M':{
			j=0;
			while (j<MAXC && !encontre && artistas[1][j]!=null) {
				if(artistas[1][j].getNombre().equals(nombre))
					encontre=true;
				else 
					j++;
			}
			
			if (encontre) {
				while(j<(MAXC-1) && artistas[1][j+1]!=null) {
					artistas[1][j]=artistas[1][j+1];
					artistas[1][j+1]=null;
					j++;
					resp=true;
				}
			}
			break;
			}
			
		case 'S':{
			j=0;
			while (j<MAXC && !encontre && artistas[2][j]!=null) {
				if(artistas[2][j].getNombre().equals(nombre))
					encontre=true;
				else 
					j++;
			}
			
			if (encontre) {
				while(j<(MAXC-1) && artistas[2][j+1]!=null) {
					artistas[2][j]=artistas[2][j+1];
					artistas[2][j+1]=null;
					j++;
					resp=true;
				}
			}
			break;
			}
		
}
		return resp;
		
	}
	
	
	public String menoresVentas(char tipo) {
		int c, max;
		String artista;
		artista=" ";
		switch(tipo){
		case 'F':{
				max=0;
				c=1;
				while(c<MAXC && artistas[0][c]!=null) {
					if((artistas[0][c].getVenta())<(artistas[0][max].getVenta()))  {
						max=c;
						c++;
					}
					else 
						c++;
			}
				artista=artistas[0][max].getNombre();
			
		
			break;
		}
		case 'M':{
			max=0;
			c=1;
			while(c<MAXC && artistas[1][c]!=null) {
				if((artistas[1][c].getVenta())<(artistas[1][max].getVenta()))  {
					max=c;
					c++;
				}
				else 
					c++;
		}
			artista=artistas[1][max].getNombre();
		
	
		break;
		}
		case 'S':{
			max=0;
			c=1;
			while(c<MAXC && artistas[2][c]!=null) {
				if((artistas[2][c].getVenta())<(artistas[2][max].getVenta()))  {
					max=c;
					c++;
				}
				else 
					c++;
		}
			artista=artistas[2][max].getNombre();
		
	
		break;
		}
		
		}
		return artista;
	}
	public String mayoresVentas(char tipo) {
		int c, max;
		String artista;
		artista=" ";
		switch(tipo){
		case 'F':{
				max=0;
				c=1;
				while(c<MAXC && artistas[0][c]!=null) {
					if((artistas[0][c].getVenta())>(artistas[0][max].getVenta()))  {
						max=c;
						c++;
					}
					else 
						c++;
			}
				artista=artistas[0][max].getNombre();
			
		
			break;
		}
		case 'M':{
			max=0;
			c=1;
			while(c<MAXC && artistas[1][c]!=null) {
				if((artistas[1][c].getVenta())>(artistas[1][max].getVenta()))  {
					max=c;
					c++;
				}
				else 
					c++;
		}
			artista=artistas[1][max].getNombre();
		
	
		break;
		}
		case 'S':{
			max=0;
			c=1;
			while(c<MAXC && artistas[2][c]!=null) {
				if((artistas[2][c].getVenta())>(artistas[2][max].getVenta()))  {
					max=c;
					c++;
				}
				else 
					c++;
		}
			artista=artistas[2][max].getNombre();
		
	
		break;
		}
		
		}
		return artista;
	}
	

	@Override
	public int compareTo(Empresa o) {
		// TODO Auto-generated method stub
		return 0;
	} 
	//aqui se utiliza un genero de matrices 
	public boolean encuentraArtista(String nombre) {
		boolean resp; 
		Artista artista; 
		artista= new Artista(nombre, 0, ' ');
		
		resp=ManejadorMatricesGenerico.buscaMatriz(artistas, MAXF, MAXC, artista);
		
		return resp;
	}
	public String regresaArtista(int f,int c) {
		String resp; 
		
		
		if(f>=0 && f<MAXF && c>=0 && c<MAXC)
			if(artistas[f][c]!=null)
				resp=artistas[f][c].getNombre();
			else 
				resp="      ";
		else 
			resp="ERROR";
		return resp; 
	}
	//Todas estas funciones son necesarias para poder hacer la funcionalidad del genero 
	//Con esto, poder hacer un arreglo con una matriz 
}

