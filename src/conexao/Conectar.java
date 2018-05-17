package conexao;

import java.sql.Connection; //Métodos para conexão.
import java.sql.DriverManager;//Método para instalar o drive do Nanco de Dados.
import java.sql.SQLException; //Método para tratamento dos erros.


public class Conectar {
	 public void ConnectiongetConnection() {
	
	try {
		// carregar o drive do MySQL e passar informações para conexão
		
		DriverManager.getConnection("jdbc:mysql://localhost/lojacd","root","");
		
		
	}
	 catch(SQLException excecao ) {
		 
		 throw new RuntimeException(excecao);
		 
	 }

	}
 };

