package dominio;

public class Funcionario {
	private String nome;
	private int codigo;
	private String login;
	private String senha;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int codigo, String login, String senha) {
		this.nome = nome;
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void recuperarSenha(String novaSenha) {
		this.senha = novaSenha;
	}
	
}
