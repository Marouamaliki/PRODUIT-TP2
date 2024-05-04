import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class Serveur extends UnicastRemoteObject implements Interfac{
        public String nomClient;
	public int prix;
	public String produit;
	public Serveur() throws RemoteException{
		super();}
	@Override
	public void demandeEncher(String nomClient,int prixActuel) throws RemoteException{
			System.out.println("le nom est:"+nomClient+"le prix actuel est:"+prixActuel);
	}
	@Override
	public void comparaison(int prix,int prixActuel) throws RemoteException{
			if(prix>prixActuel){
				prix=prixActuel;
				System.out.println("accepter et vendre");
			}
			else{
				System.out.println("refus de vendre");}}
	public void afficheprodui(String produit) throws RemoteException{
		System.out.println("le produits est:"+produit);}
public static void main(String[] args){
try{
	Interfac service=new Serveur();
	Registry registre = LocateRegistry.createRegistry(1099);
	registre.rebind("monservice",service);
	System.out.println("le serveur RPC est pret");
}catch(Exception e){
	e.printStackTrace();}
}
}

