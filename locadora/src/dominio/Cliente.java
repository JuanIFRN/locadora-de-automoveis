package dominio;

import java.sql.Date;

public class Cliente {
	private String nome;
	private String cpf;
	private Date nascimento;
	private String sexo;
	private int numcnh;
	private String tipocnh;
	private Date vencimentocnh;
	private String tel;
	private String email;
	private String endereço;
	
	public Cliente() {
		
	}
	
	
	
	public Cliente(String nome, String cpf, Date nascimento, String sexo, int numcnh, String tipocnh,
			Date vencimentocnh, String tel, String email, String endereço) {

		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.numcnh = numcnh;
		this.tipocnh = tipocnh;
		this.vencimentocnh = vencimentocnh;
		this.tel = tel;
		this.email = email;
		this.endereço = endereço;
	}

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getNumcnh() {
		return numcnh;
	}
	public void setNumcnh(int numcnh) {
		this.numcnh = numcnh;
	}
	public String getTipocnh() {
		return tipocnh;
	}
	public void setTipocnh(String tipocnh) {
		this.tipocnh = tipocnh;
	}
	public Date getVencimentocnh() {
		return vencimentocnh;
	}
	public void setVencimentocnh(Date vencimentocnh) {
		this.vencimentocnh = vencimentocnh;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}



	@Override
	public boolean equals(Object obj) {
		Cliente aComparar = (Cliente) obj;
		
		if(this.cpf == aComparar.cpf) {
			return true;
		}else {
			return false;
		}
		
	}

	public String toString() {
		
		return super.toString();
	}
	
}
