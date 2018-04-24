package br.com.estudos.estoque.modelo.item;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.ResponseWrapper;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaItens {

	@XmlElement(name = "item")
	private List<Item> itens;

	ListaItens() {}
	
	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	@WebMethod(operationName = "todosOsItens")
	@ResponseWrapper(localName = "itens")
	@WebResult(name = "item")
	public List<Item> getItens() {
		return itens;
	}
}
