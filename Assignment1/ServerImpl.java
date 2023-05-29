

import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf{

	public ServerImpl() throws RemoteException{
		//contructor
	}
	
	public double add(double d1, double d2) throws RemoteException{
		return d1+d2;
	}	

}
