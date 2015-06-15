package util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import entities.Negociacao;

public class LeitorXML {

	public List<Negociacao> carrega(InputStream inputStream) {
		XStream stream = new XStream(new DomDriver());
		stream.alias("negociacao", Negociacao.class);
		return (List<Negociacao>)stream.fromXML(inputStream);
	}
	
	public static void main (String args[])
	{/*
		Negociacao negociacao = new Negociacao(42.3, 100, Calendar.getInstance());
		XStream stream = new XStream(new DomDriver());
		System.out.println(stream.toXML(negociacao));
*/
		String xmlDeTeste = "<list>" +
		          "  <negociacao>" +
		          "    <preco>43.5</preco>" +
		          "    <quantidade>1000</quantidade>" +
		          "    <data>" +
		          "      <time>1322233344455</time>" +
		          "    </data>" +
		          "  </negociacao>" +
		          "</list>";
		LeitorXML leitor = new LeitorXML();
		InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());	
		List<Negociacao> lista = leitor.carrega(xml);
		
		for (int i = 0; i < lista.size(); i++)
		{
			System.out.println("Preco: ");
			System.out.println(lista.get(i).getPreco());
		}
	}
}
