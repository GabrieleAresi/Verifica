
public class Docente
{
	private String nome;
	private String cognome;
	private double mediaVoti;
	
	public Docente(String nome, String cognome, double mediaVoti)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.mediaVoti=mediaVoti;
	}

	public String getNome() 
	{
		return nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public double getMediaVoti() 
	{
		return mediaVoti;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

	public void setMediaVoti(double mediaVoti) 
	{
		this.mediaVoti = mediaVoti;
	}
	
	
}
