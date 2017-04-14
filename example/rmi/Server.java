package example.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

	public Server() {
		super();
	}

	public static void main(String[] args) {
	        
//		if (System.getSecurityManager() == null) {
  //         System.setSecurityManager(new SecurityManager());
    //    }
		
       try {
            String name = "Hello";
            HelloWorld helloworld = new HelloWorld();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(helloworld, 0);
            
            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind(name, stub);
            
            System.err.println("Server ready");
       } catch (Exception e) {
    	   System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
	
}
