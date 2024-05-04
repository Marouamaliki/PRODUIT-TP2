import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interfac extends Remote{
	public void demandeEncher(String nomClient,int prixActuel) throws RemoteException;
	public void  comparaison(int prix,int prixActuel) throws RemoteException;
}

