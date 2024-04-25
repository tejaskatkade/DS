import java.rmi.*;
import java.rmi.server.*;

public class ServerAppImpl extends UnicastRemoteObject implements ServerApp {

    protected ServerAppImpl() throws RemoteException {
        //super();
    }

    @Override
    public double addition(double num1, double num2) throws RemoteException {
        return num1 + num2;
    }

    @Override
    public double subtraction(double num1, double num2) throws RemoteException {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) throws RemoteException {
        return num1 * num2;
    }
    
}
