package server;

import interfaces.Constantes;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Operations op = new Operations();
			
			Registry registry = LocateRegistry.createRegistry(Constantes.RMI_PORT);
			registry.bind(Constantes.RMI_ID, op);
			System.out.println("SERVER ONLINE");
		} catch (Exception e)
		{
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
		
	}
}
