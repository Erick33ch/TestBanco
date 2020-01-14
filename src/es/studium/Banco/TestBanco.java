package es.studium.Banco;

public class TestBanco {
	public static void main(String[] args) {
		
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuAnto = new Cuenta(48151, 100, antonio);
		Cuenta cuBea = new Cuenta(62342, 100, beatriz);
 
		/* Antonio y Beatriz consultan el saldo */
		System.out.println(consultarSaldo(cuAnto));
		System.out.println(consultarSaldo(cuBea));
 
		/* Beatriz transfiere 50€ a Antonio */
		cuBea.setSaldo(transferirSaldo(cuBea));
		cuAnto.setSaldo(transferirSaldo2(cuAnto));
 
		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		System.out.println(consultarSaldo(cuAnto));
		System.out.println(consultarSaldo(cuBea));
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		double ingresos = cuAnto.getSaldo() + 100;
		cuAnto.setSaldo(ingresos);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		double gastoSaldo = cuBea.getSaldo() - 30;
		cuBea.setSaldo(gastoSaldo);
 
		/* Antonio transfiere 50€ a Beatriz */
		cuAnto.setSaldo(transferirSaldo(cuAnto));
		cuBea.setSaldo(transferirSaldo2(cuBea));
	}

	private static double transferirSaldo2(Cuenta cuentaBeatriz) {
		return cuentaBeatriz.getSaldo() + 50;
	}

	private static double transferirSaldo(Cuenta cuentaAntonio) {
		return cuentaAntonio.getSaldo() - 50;
	}

	private static String consultarSaldo(Cuenta cuentaAntonio) {
		return "La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.";
	}
}
