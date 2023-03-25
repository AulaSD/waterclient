package application;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import interfaces.IServiceBeberAgua;
import model.Pessoa;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IServiceBeberAgua service = (IServiceBeberAgua) Naming.lookup("//localhost/calculo");
			Pessoa pessoa = new Pessoa("Mauro",80);
			double qtd_beber = service.calculaQuantidadeAgua(pessoa);
			System.out.println("Quantidade de Água a Beber:" + qtd_beber);
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
