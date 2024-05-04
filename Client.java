import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
public class Client{
	public static void main(String[] args){
try{
		Registry registre=LocateRegistry.getRegistry("localhost",1099);
		Interfac service = (Interfac) registre.lookup("monservice");
	        service. demandeEncher("maroua",20000);
       	        service.comparaison(200001,20000);
    }catch(Exception e){
		e.printStackTrace();}
}            
}
