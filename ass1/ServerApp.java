import java.rmi.*;

public interface ServerApp  extends Remote{

    public double addition(double num1, double num2) throws RemoteException;
    public double subtraction(double num1, double num2) throws RemoteException;
    public double multiplication(double num1, double num2) throws RemoteException;
}
