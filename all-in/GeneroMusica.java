import java.util.Objects;

/*
 * Aranza Ibarra Camarena 
 * 200258 
 * En esta clase ya se une tanto el arreglo de las empresas como la matriz de artistas 
 * Tiene las funciones que SÍ se van a utilizar en todo. 
 * Estas son las importantes 
 */
public class GeneroMusica {
	protected Empresa[] empresas; 
	private final int MAX=4;
	protected String idioma; 
	protected int anio;
	
	
	protected int ocupados; 
	
	
	public GeneroMusica() {
		empresas= new Empresa[MAX]; 
		ocupados=0;
		
		
	}


	public GeneroMusica(String idioma, int anio) {
		this();
		this.idioma = idioma;
		this.anio = anio;
	}


	public String getIdioma() {
		return idioma;
	}


	public int getAnio() {
		return anio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idioma);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GeneroMusica other = (GeneroMusica) obj;
		return Objects.equals(idioma, other.idioma);
	}
	public int compareTo(GeneroMusica otro) {
		return idioma.compareTo(otro.getIdioma());
		
	}
	public String toString() {
		StringBuilder sb; 
		int i; 
		
		sb=new StringBuilder(); 
		sb.append("KPOP: \n"); 
		sb.append("Idioma:  "+idioma+"\n"); 
		sb.append("Anio:  "+anio+"\n");
			for(i=0; i<MAX;i++) {
				if(empresas[i]!=null) {
					sb.append("Empresas: \n"); 
					sb.append("Nombre: "+empresas[i].getNombre()+"\n"); 
					sb.append("Anio:  "+empresas[i].getAnio()+"\n");
					sb.append("Artistas: \n");
					sb.append(empresas[i].toString());
				}
			}
	
			return sb.toString();
	}
	public boolean altaEmpresa(String nombre, int anio) {
		boolean resp, encontre;
		Empresa empresa;
		int j; 
		encontre=false;
		resp=false;
		
		empresa=new Empresa (nombre, anio);
		
		j=0;
		while (j<MAX && !encontre && empresas[j]!=null) {
			if(empresas[j].equals(empresa))
				encontre=true;
			else 
				j++;
		}
		if (!encontre) {
			empresas[j]=empresa;
			resp=true;
		}
		return resp;	
		
	}

	
	public boolean bajaEmpresa(String nombre, int anio) {
		boolean resp;
		Empresa empresa;
		
		empresa= new Empresa(nombre, anio); 
		
		resp=ManejadorArreglosGenerico.bajaOrdenada(empresas, MAX, empresa);
		return resp; 
		
	}
	//Aquí se utiliza un generico de arreglos
	public int buscaEmpresa(String nombre) {
		int resp;
		Empresa empresa;
		
		empresa=new Empresa(nombre, 0);
		
		resp=ManejadorArreglosGenerico.buscaSec(empresas, MAX, empresa);
		
		return resp; 
		
		
	}
	
	
	public boolean altaArtistas(String nombre, double ventas, char tipo, int emp) {
		boolean resp;
		
		resp=false; 
		
		
		resp=empresas[emp].altaAristas(nombre, ventas, tipo);
	
			return resp; 
	}
	public boolean bajaArtistas(String nombre, char tipo, int emp) {
		boolean resp;
		
		resp=false; 
		
		
		resp=empresas[emp].bajaArtista(nombre, tipo);
	
			return resp; 
	}
	public String mayoresVentas(int e, char tipo) {

		String artista;
		artista="No Artista";
		if(e>=0 && e<MAX)
			artista=empresas[e].mayoresVentas(tipo);
		
		return artista;
		
	}
	public String menoresVentas(int e, char tipo) {
		
		String artista;
		artista="No Artista";
		if(e>=0 && e<MAX)
		artista=empresas[e].menoresVentas(tipo);
		return artista; 
		
	}
// se utiliza OTRO generico de arreglos
	public int encuentraEmpresa(String nombre) {
		int r;
		Empresa empresa; 
		empresa= new Empresa(nombre, 0);
		r=ManejadorArreglosGenerico.buscaBinaria(empresas, MAX, empresa);
		return r; 
	}
	//esta funcion viene de un generico de matrices  
	public boolean encuentraArtista(String nombre, int emp) {
		boolean r; 
		
		r=false; 
		 
		
		r=empresas[emp].encuentraArtista(nombre);
		
		return r; 
	}
}		

	

