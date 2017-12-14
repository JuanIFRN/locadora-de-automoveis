package dominio;

public class Automovel {

	private String placa;
	private String chassi;
	private String modelo;
	private int ano;
	private String cor;
	private double valorDiaria;
	private int portas;
	private int malas;
	private int capacidade;
	private int km;
	private String descricao;
	private boolean flDisponivel;
	
	public Automovel() {
		
	}
	
	public Automovel(String placa, String chassi, String modelo, int ano, String cor, double valorDiaria, int portas,
			int malas, int capacidade, int km, String descricao, boolean flDisponivel) {
		super();
		this.placa = placa;
		this.chassi = chassi;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.portas = portas;
		this.malas = malas;
		this.capacidade = capacidade;
		this.km = km;
		this.descricao = descricao;
		this.flDisponivel = flDisponivel;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getMalas() {
		return malas;
	}
	public void setMalas(int malas) {
		this.malas = malas;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFlDisponivel() {
		return flDisponivel;
	}
	public void setFlDisponivel(boolean flDisponivel) {
		this.flDisponivel = flDisponivel;
	}
	
	
	public boolean isDisponivel() {
		return this.isDisponivel();
	}
	
	public void alugar(boolean alugado) {
		this.flDisponivel = alugado;
	}
	public void alterarValorDiaria(double novoValor) {
		this.valorDiaria = novoValor;
	}
	
	
	
}
