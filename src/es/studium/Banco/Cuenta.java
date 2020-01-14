package es.studium.Banco;

public class Cuenta {
		private int numeroCuenta;
		private double saldo;
		private Cliente cliente;
		
	public Cuenta() {
		numeroCuenta = 0;
		saldo= 0.0;
		cliente = new Cliente();
	}
	public Cuenta(int no, double sa, Cliente cl) {
		numeroCuenta = no;
		saldo = sa;
		cliente = cl;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setNumeroCuenta(int no) {
		numeroCuenta = no;
	}
	public void setSaldo(double sa) {
		saldo = sa;
	}
	public void setCliente(Cliente cl) {
		cliente =cl;
	}
}
