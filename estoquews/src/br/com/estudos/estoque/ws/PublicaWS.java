package br.com.estudos.estoque.ws;

import javax.xml.ws.Endpoint;

public class PublicaWS {

	public static void main(String[] args) {
		EstoqueWS service = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		System.out.println(url);
		Endpoint.publish(url, service);
	}
}
