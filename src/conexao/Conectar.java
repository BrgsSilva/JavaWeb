package conexao;

import java.sql.Connection; //M�todos para conex�o.
import java.sql.DriverManager;//M�todo para instalar o drive do Nanco de Dados.
import java.sql.SQLException; //M�todo para tratamento dos erros.


public class Conectar {
	
	 public void ConnectiongetConnection() throws ClassNotFoundException {
	
	try {
		
		//Carrega o driver em tempo de execu��o.
		Class.forName("com.mysql.jdbc.Driver");
		
		
		// carregar o drive do MySQL e passar informa��es para conex�o
		DriverManager.getConnection("jdbc:mysql://localhost/lojacd","root","");
		
		
		
		
	}
	 catch(SQLException excecao ) {
		 
		 throw new RuntimeException(excecao);
		 
	 }

	}
 };

