package example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public Client() {
		super();
	}

	public static void main(String[] args) {
//		if (System.getSecurityManager() == null) {
  ///         System.setSecurityManager(new SecurityManager());
     //   }
		
		try {
            Registry registry = LocateRegistry.getRegistry();
            Hello stub = (Hello) registry.lookup("Hello");
            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}

}
