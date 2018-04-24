package br.com.estudos.estoque.modelo.usuario;

import javax.xml.ws.WebFault;

@SuppressWarnings("serial")
@WebFault(name = "AutorizacaoFault")
public class AutorizacaoException extends Exception {

	public AutorizacaoException(String mensagem) {
		super(mensagem);
	}
	
	public String getFaultInfo() {
		return "Token invalido";
	}
}
