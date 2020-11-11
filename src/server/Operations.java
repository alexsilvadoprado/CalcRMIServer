package server;


import interfaces.Operators;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Operations extends UnicastRemoteObject implements Operators
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3879780728148181129L;

	protected Operations() throws RemoteException
	{
		super();
	}

	@Override
	public double soma(double valorX, double valorY) throws RemoteException
	{
		return valorX + valorY;
	}

	@Override
	public double subtracao(double valorX, double valorY)
			throws RemoteException
	{
		return valorX - valorY;
	}

	@Override
	public double multiplicacao(double valorX, double valorY)
			throws RemoteException
	{
		return valorX * valorY;
	}

	@Override
	public double divisao(double valorX, double valorY) throws RemoteException
	{
		return valorX / valorY;
	}
}
