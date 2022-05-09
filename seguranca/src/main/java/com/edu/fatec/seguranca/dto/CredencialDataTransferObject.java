package com.edu.fatec.seguranca.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CredencialDataTransferObject implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nomeUsuario;
	private String senha;
}