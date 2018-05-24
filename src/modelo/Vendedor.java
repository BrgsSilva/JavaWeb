package modelo;

public class Vendedor {
	
	public static class VendedorData {
		private String nomeVendedor;
		private String emailVendedor;
		private String telefoneVendedor;
		private String categoria;

		public VendedorData() {
		}

		public String getNomeVendedor() {
			return nomeVendedor;
		}

		public void setNomeVendedor(String nomeVendedor) {
			this.nomeVendedor = nomeVendedor;
		}

		public String getEmailVendedor() {
			return emailVendedor;
		}

		public void setEmailVendedor(String emailVendedor) {
			this.emailVendedor = emailVendedor;
		}

		public String getTelefoneVendedor() {
			return telefoneVendedor;
		}

		public void setTelefoneVendedor(String telefoneVendedor) {
			this.telefoneVendedor = telefoneVendedor;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
	}
	private VendedorData data = new VendedorData();
	

}
