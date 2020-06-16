package br.com.api.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_pessoa")
@Data
@Entity
public class PessoaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pessoa")
	private Integer codigo;

	@Column(name = "ds_nome")
	private String nome;

	@Column(name = "fl_ativo", columnDefinition = "BIT")
	private boolean ativo;

}
