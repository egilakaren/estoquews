package br.com.estudos.estoque.relatorio;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class RelatorioService {

	@Oneway // Neste caso, o que queremos é criar um serviço de "mão única". Deixando claro aos clientes que esse serviço não terá resposta e que ele não precisará esperar pelo processamento da requisição. 
    @WebMethod(operationName="GerarRelatorio")
    public void gerarRelatorio() { 
        // código omitido
    }

}
