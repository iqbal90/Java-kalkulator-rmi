
/*
Filename: HelloWorld.java
*/
import java.rmi.*;
import java.rmi.Naming.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;
import java.util.*;
interface CalInterface extends Remote
{
	 public int add(int a,int b) throws RemoteException;
	 public int subt(int a,int b) throws RemoteException;
	 public int mult(int a,int b) throws RemoteException;
	 public int div(int a,int b) throws RemoteException;
}