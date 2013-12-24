import java.io.*;
import java.net.*;
import java.util.*;
public class ChatServer{
	public static void main(String args[])throws IOException{
		String s1,s2,s3;
		ServerSocket socket=null;
		socket=new ServerSocket(1099);
		System.out.println("Welcome to.......\n");
		Socket s=null;
		s=socket.accept();
		PrintStream p1=new PrintStream (s.getOutputStream(),true);
		s2="You are connected to Server on port no:1099";
		p1.println(s2);
		DataInputStream din1=new DataInputStream(System.in);
		DataInputStream din2=new DataInputStream(s.getInputStream());
		try{
		while(true){
		s3=din2.readLine();
		if (s3.compareTo("q")==0){
			System.exit(0);		
		}
		System.out.println("Client Says:\t"+s3);
		s1=din1.readLine();
		p1.println(s1);
			
		}
		}
		catch(Exception e){
		System.out.print("Exception");
		}
	
	}
}
