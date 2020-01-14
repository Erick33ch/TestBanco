package es.studium.Banco;

public class TestBanco {
	public static void main(String[] args) {
		/**
		 * @author denny
		 * @version 1.2
		 * @año 2020
		 */
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		//Renombramos los nombres para hacerlos más pequeños
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuAnto = new Cuenta(48151, 100, antonio);
		Cuenta cuBea = new Cuenta(62342, 100, beatriz);
		/**
		 * Extraer metodo 
		 * @return saldo de sus respectivas cuentas
		 */
		/* Antonio y Beatriz consultan el saldo */
		System.out.println(consultarSaldo(cuAnto));
		System.out.println(consultarSaldo(cuBea));
		/**
		 * Extraer metodo
		 * @return bea transfiere 50€ a Antonio
		 */
		/* Beatriz transfiere 50€ a Antonio */
		cuBea.setSaldo(transferirSaldo(cuBea));
		cuAnto.setSaldo(recibirSaldo(cuAnto));
 
		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		System.out.println(consultarSaldo(cuAnto));
		System.out.println(consultarSaldo(cuBea));
		//En estas Extragimos metodo y varibles
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		double ingresos = suma100(cuAnto);
		cuAnto.setSaldo(ingresos);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		double gastoSaldo = resta30(cuBea);
		cuBea.setSaldo(gastoSaldo);
 
		/* Antonio transfiere 50€ a Beatriz */
		cuAnto.setSaldo(transferirSaldo(cuAnto));
		cuBea.setSaldo(recibirSaldo(cuBea));
	}

	private static double resta30(Cuenta cuBea) {
		return cuBea.getSaldo() - 30;
	}

	private static double suma100(Cuenta cuAnto) {
		return cuAnto.getSaldo() + 100;
	}

	private static double recibirSaldo(Cuenta cuentaBeatriz) {
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
