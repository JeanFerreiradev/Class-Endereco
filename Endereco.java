import java.util.ArrayList;

public class Endereco {
	private ArrayList<Endereco> endereco;
	private String cep = "22785-620";
	private String tipoLogradouro = "Estrada";
	private String logradouro = "Verador Alceu de Carvalho";
	private String complemento = "casa 7";
	private String bairro = "Vergem Grande";
	private String cidade = "Rio de Janeiro";
	private String estado = "Rio de Janeiro";
	private double longitude = -43.498323;
	private double latitude = -22.988517;

	public Endereco() {
		endereco = new ArrayList<Endereco>();
	}

	public Endereco(String cep, String tipoLogradouro, String logradouro, String complemento, String bairro,
			String cidade, String estado) {
		endereco = new ArrayList<Endereco>();
		cep = "";
		tipoLogradouro = "";
		logradouro = "";
		complemento = "";
		bairro = "";
		cidade = "";
		estado = "";

	}

	public Endereco(String cep, String tipoLogradouro, String logradouro, String bairro, String cidade, String estado) {
		endereco = new ArrayList<Endereco>();
		cep = "";
		tipoLogradouro = "";
		logradouro = "";
		bairro = "";
		cidade = "";
		estado = "";
	}

	public Endereco(String cep, String tipoLogradouro, String logradouro, String complemento, String bairro,
			String cidade, String estado, double longitude, double latitude) {
		endereco = new ArrayList<Endereco>();
		cep = "";
		tipoLogradouro = "";
		logradouro = "";
		complemento = "";
		bairro = "";
		cidade = "";
		estado = "";
		latitude = 0.0;
		longitude = 0.0;
	}

	public Endereco(double longitude, double latitude) {
		endereco = new ArrayList<Endereco>();
		latitude = 0.0;
		longitude = 0.0;
	}

	public Endereco(String cep) {
		endereco = new ArrayList<Endereco>();
		cep = "";
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;

	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return getTipoLogradouro() + " " + getLogradouro() + " - " + getBairro() + ", " + getCidade() + " - "
				+ getEstado() + ", " + getCep();
	}
}
