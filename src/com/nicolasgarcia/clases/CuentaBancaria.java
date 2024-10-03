package com.nicolasgarcia.clases;
import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
	private double saldo;
	private Personas titular;
	private int numeroCuenta;
	private static ArrayList<CuentaBancaria> listaDeCuentas = new ArrayList<>();
	
	public CuentaBancaria(double saldo, Personas titular) {
		this.saldo = saldo;
		this.titular = titular;
		this.numeroCuenta = generarNumCuentaAleatorio();
		listaDeCuentas.add(this);
	}
	
	// metodo para generar numero de cuenta aleatorio
	private int generarNumCuentaAleatorio() {
		Random random = new Random();
		return random.nextInt(100000) + 100000;
	}
	
	public void depositar(Double monto) {
		this.saldo += monto;
	}
	
	public void retirar(Double monto) {
		if(saldo >= monto) {
			this.saldo -= monto;
		}else {
			System.out.println("No hay saldo suficiente");
		}
	}

	public void desplegarInfo() {
		System.out.println("Informacion titular");
		System.out.println("El numero de cuenta es: " + this.numeroCuenta);
		System.out.println("El nombre del titular es: " + this.titular);
		System.out.println("El saldo del titular es: " + this.saldo);
	}
	
	public static void infoDeCuentasBancarias() {
		for(int i = 0; i <= listaDeCuentas.size() -1; i++) {
			CuentaBancaria cuenta = listaDeCuentas.get(i);
            System.out.println("Titular: " + cuenta.getTitular().getNombre());
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Saldo: " + cuenta.getSaldo());
            System.out.println();
		}
	}
	
	// getter y setters
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Personas getTitular() {
		return titular;
	}
	public void setTitular(Personas titular) {
		this.titular = titular;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public static ArrayList<CuentaBancaria> getListaDeCuentas() {
		return listaDeCuentas;
	}
	public static void setListaDeCuentas(ArrayList<CuentaBancaria> listaDeCuentas) {
		CuentaBancaria.listaDeCuentas = listaDeCuentas;
	}
	
	

}
