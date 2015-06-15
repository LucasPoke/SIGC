package managedBeans;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class OlaMundoMBean {

	public String nome;
	
	public String getHorario() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return "Atualizado em " + sdf.format(new Date());
	}
	
	public void digaOi() {
		System.out.println("CLICOU");
	}
	
	public String mensagemInicial() {
		return "SEJE BENVIMDO\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("setNome");
		this.nome = nome;
	}
}
