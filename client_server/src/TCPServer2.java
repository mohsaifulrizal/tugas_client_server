
import java.io.*;
import java.net.*;

public class TCPServer2 implements Runnable{
    Socket con;
    TCPServer2(Socket sock){
        this.con=sock;
    }
public static void main(String args[]) throws Exception
{
    ServerSocket masuk = new ServerSocket(1234,5);
    
    for(;;)
    {
        Socket con = masuk.accept();
        System.out.println("Koneksi Diterima");
        
        new Thread(new TCPServer2(con)).start();
    }
}
@Override
public void run()
{
    try{
        BufferedReader fromClient = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        
        DataOutputStream toClient = new DataOutputStream(con.getOutputStream());
        String line;
        
        while((line=fromClient.readLine())!=null){
            System.out.println("info PC \""+line+"\"");
            String result=line.length()+":"+line.toLowerCase();
            toClient.writeBytes(result);
        }
        System.out.println("maaf Koneksi Ditutup \n");
        con.close();
    }catch(IOException e){
        System.out.println(e);
    }
}
}
