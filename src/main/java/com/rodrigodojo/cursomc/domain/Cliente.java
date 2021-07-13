package com.rodrigodojo.cursomc.domain;

import java.util.ArrayList;
import java.util.List;

import com.rodrigodojo.cursomc.domain.enums.TipoCliente;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private TipoCliente tipo;
	
	private List<Endereco> enderecos = new ArrayList<>();

}
