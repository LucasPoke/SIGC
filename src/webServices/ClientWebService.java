package webServices;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import util.LeitorXML;
import entities.Negociacao;

public class ClientWebService {

	public static final String URL_WEBSERVICE = "http://argentumws.caelum.com.br/negociacoes";
	
	public List<Negociacao> getNegociacoes() {
		
		HttpURLConnection con = null;
		try {
			URL url = new URL(URL_WEBSERVICE);
			con = (HttpURLConnection)url.openConnection();
			InputStream content = con.getInputStream();
			return new LeitorXML().carrega(content);
		} catch (IOException e) {
			throw new RuntimeException();
		} finally {
			con.disconnect();
		}
	}
}
