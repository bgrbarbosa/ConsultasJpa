package br.com.consulta.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long idProduto;
	
	@Column
	private String nomeProduto;
	
	@Column
	private String descProduto;
	
	@Column
	private String urlImage;
	
	@Column
	private Double precoProduto;
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produto(Long idProduto, String nomeProduto, String descProduto, String urlImage, Double precoProduto) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descProduto = descProduto;
		this.urlImage = urlImage;
		this.precoProduto = precoProduto;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescProduto() {
		return descProduto;
	}

	public void setDescProduto(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}


	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", descProduto=" + descProduto
				+ ", urlImage=" + urlImage + ", precoProduto=" + precoProduto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descProduto, idProduto, nomeProduto, precoProduto, urlImage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descProduto, other.descProduto) && Objects.equals(idProduto, other.idProduto)
				&& Objects.equals(nomeProduto, other.nomeProduto) && Objects.equals(precoProduto, other.precoProduto)
				&& Objects.equals(urlImage, other.urlImage);
	}
	
}
