package managedBeans;

import java.util.List;

import entities.Negociacao;
import webServices.ClientWebService;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ArgentumBean {

	private List<Negociacao> lista;
	
	public ArgentumBean() {
		ClientWebService c = new ClientWebService();
		this.lista = c.getNegociacoes();
	}
	
	public List<Negociacao> getNegociacoes() {
		return this.lista;
	}
}
