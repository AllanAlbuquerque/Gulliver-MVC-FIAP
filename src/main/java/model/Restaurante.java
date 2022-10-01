package model;

public class Restaurante {
	private String nome;
	private String preco;
	private String cidade;
	private String imgPath;
	
	public Restaurante(String nome, String preco, String cidade, String imgPath) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.cidade = cidade;
		this.imgPath = imgPath;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}
