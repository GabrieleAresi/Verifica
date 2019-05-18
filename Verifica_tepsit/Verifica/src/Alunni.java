
public class Alunni
{
	private String nome;
	private String cognome;
	private int eta;
	private double voti;
	
	public Alunni(String nome, String cognome, int eta, double voti)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.voti=voti;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCognome() 
	{
		return cognome;
	}

	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

	public int getEta() 
	{
		return eta;
	}

	public void setEta(int eta)
	{
		this.eta = eta;
	}

	public double getVoti() 
	{
		return voti;
	}

	public void setVoti(double voti) 
	{
		this.voti = voti;
	}
	
}
