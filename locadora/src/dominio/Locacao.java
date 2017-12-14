package dominio;

import java.sql.Date;

public class Locacao {
	
	private Cliente cliente; 
	private Automovel automovel;
	private Funcionario funcionario;
	private int id;
	private Date dtIniLocacao;
	private Date dtFimLocacao;
	private int kmInicial;
	private int kmFinal;
	private double valorDiaria;
	private int diasDeAtraso;
	private double multaPorDia;
	private String formaPagamento;
	private int parcelas;
	private double valorParcela;
	private boolean flPago;
	private Date dtPagamento;
	private double valorTotal;
	
	

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Locacao() {
		
	}
	

	public Locacao(Cliente cliente, Automovel automovel, Funcionario funcionario, int id, Date dtIniLocacao,
			Date dtFimLocacao, int kmInicial, int kmFinal, double valorDiaria, int diasDeAtraso, double multaPorDia,
			String formaPagamento, int parcelas, double valorParcelas, boolean flPago, Date dtPagamento,
			double valorTotal) {
		this.cliente = cliente;
		this.automovel = automovel;
		this.funcionario = funcionario;
		this.id = id;
		this.dtIniLocacao = dtIniLocacao;
		this.dtFimLocacao = dtFimLocacao;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorDiaria = valorDiaria;
		this.diasDeAtraso = diasDeAtraso;
		this.multaPorDia = multaPorDia;
		this.formaPagamento = formaPagamento;
		this.parcelas = parcelas;
		this.valorParcela = valorParcelas;
		this.flPago = flPago;
		this.dtPagamento = dtPagamento;
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Automovel getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDtIniLocacao() {
		return dtIniLocacao;
	}
	public void setDtIniLocacao(Date dtIniLocacao) {
		this.dtIniLocacao = dtIniLocacao;
	}
	public Date getDtFimLocacao() {
		return dtFimLocacao;
	}
	public void setDtFimLocacao(Date dtFimLocacao) {
		this.dtFimLocacao = dtFimLocacao;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public int getDiasDeAtraso() {
		return diasDeAtraso;
	}
	public void setDiasDeAtraso(int diasDeAtraso) {
		this.diasDeAtraso = diasDeAtraso;
	}
	public double getMultaPorDia() {
		return multaPorDia;
	}
	public void setMultaPorDia(double multaPorDia) {
		this.multaPorDia = multaPorDia;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public double getValorParcelas() {
		return valorParcela;
	}
	public void setValorParcelas(double valorParcelas) {
		this.valorParcela = valorParcelas;
	}
	public boolean isFlPago() {
		return flPago;
	}
	public void setFlPago(boolean flPago) {
		this.flPago = flPago;
	}
	public Date getDtPagamento() {
		return dtPagamento;
	}
	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void informarCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void informarAutomovel(Automovel automovel){
		this.automovel = automovel;
	}
	
	public void informarFuncionario(Funcionario funcionario){
		this.funcionario = funcionario;
	}
	
	
	public void pagar(double valor, int diasDeAtraso, String formaDePagamento, int parcela, double valorParcela, Date dtPagamento) {
		this.valorTotal = valor;
		this.diasDeAtraso = diasDeAtraso;
		this.formaPagamento = formaDePagamento;
		this.parcelas = parcela;
		this.valorParcela = valorParcela;
		this.dtPagamento = dtPagamento;
		this.flPago = true;		
		
	}
	
	
	
}
