import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;
import java.util.*;
public class CalServer extends UnicastRemoteObject implements CalInterface {

	public CalServer() throws RemoteException {
		super();
	}
    public int add(int a,int b)
    {
		System.out.println("num1:"+a );
		System.out.println("num2:"+b );
		return(a+b);
	}
	public int subt(int a,int b)
	{
		System.out.println("num1:"+a );
		System.out.println("num2:"+b );
		return(a-b);
	}
	public int mult(int a,int b)
	{
		System.out.println("num1:"+a );
		System.out.println("num2:"+b );
		return(a*b);
	}
	public int div(int a,int b)
	{
		System.out.println("num1:"+a );
		System.out.println("num2:"+b );
		return(a/b);
	}
	
	public static void main(String args[])
	{
		String clienthost=null;
		try
		{
			CalServer ms=new CalServer();
			java.rmi.Naming.rebind("MathServ",ms);
			System.out.println("Server Ready");
			clienthost = RemoteServer.getClientHost();
	    }
	    catch(RemoteException RE)
	    {
			System.out.println("Remote Server Error:"+ RE.getMessage());
			System.exit(0);
		}
		catch(MalformedURLException ME)
		{
			System.out.println("Invalid URL!!");
		}catch(ServerNotActiveException ex){
			
		}
		System.out.println("clienthost:"+clienthost);
	}
}
