package com.nicolasgarcia.clases;



public class Aplicacion {

	public static void main(String[] args) {
		Personas persona1 = new Personas("nicolas", 21);
		Personas persona2 = new Personas("romina", 21);
		Personas persona3 = new Personas("alonzo", 22);	
		
		CuentaBancaria cuenta1 = new CuentaBancaria(1000.0, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(2000.0, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(500.0, persona3);

        // Realizamos algunas operaciones de depósito y retiro en las cuentas bancarias
        cuenta1.depositar(500.0);
        cuenta2.retirar(1000.0);
        cuenta3.depositar(200.0);
        cuenta3.retirar(50.0);

        // Imprimimos el saldo actual de cada cuenta bancaria después de realizar las operaciones
        System.out.println("Cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Cuenta 2: " + cuenta2.getSaldo());
        System.out.println("Cuenta 3: " + cuenta3.getSaldo());

        // Ejecutamos el método imprimeInformacionDeTodasLasCuentas() de la clase CuentaBancaria
        CuentaBancaria.infoDeCuentasBancarias();
	}

}
