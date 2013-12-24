import java.io.*;
import java.net.*;
import java.util.*;
public class ChatClient{
	public static void main(String args[])throws IOException{
		Socket ss=null;
	
		ss=new Socket("localhost",1099);
		DataInputStream dd1=new DataInputStream(System.in);
		DataInputStream dd2=new DataInputStream(ss.getInputStream());
		PrintStream pp=new PrintStream (ss.getOutputStream(),true);
		String str,str1,str2;
		String connectionmsg;
		connectionmsg=dd2.readLine();
		System.out.println(connectionmsg);
		
		try{
		while (true){
		str1=dd1.readLine();
		pp.println(str1);
		str=dd2.readLine();
		System.out.println("Server says:\t"+str);
		}
		}
		
		catch(Exception e){
			System.out.print("exception");
			System.exit(0);	
		}
	ss.close();
	}
}
