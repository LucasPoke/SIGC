package entities;

import java.util.Calendar;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("negociacao")
public final class Negociacao {

	  private double preco;
	  private int quantidade;
	  private Calendar data;

	  public Negociacao() {
		  super();
	  }
	  public Negociacao(double preco, int quantidade, Calendar data) {
	    this.preco = preco;
	    this.quantidade = quantidade;
	    this.data = data;
	  }

	  public double getPreco() {
	    return preco;
	  }

	  public int getQuantidade() {
	    return quantidade;
	  }

	  public Calendar getData() {
	    return data;
	  }
	}