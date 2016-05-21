package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		
		 Contato contato = new Contato();
		 contato.setNome("Caelum2");
		 contato.setEmail("contato@caelum.com.br");
		 contato.setEndereco("R. Vergueiro 3185 cj572");
		 contato.setDataNascimento(Calendar.getInstance());
		 
		 // grave nessa conexão!!!
		 ContatoDao dao = new ContatoDao();
		 
		 // método elegante
		 dao.adiciona(contato);
		 
		 System.out.println("Gravado!");
		
		
	}
	
}
