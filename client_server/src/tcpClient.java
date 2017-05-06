/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bang_ipu12
 */
import java.io.*;
import java.net.*;

public class tcpClient {
    public static void main (String[] args) throws Exception
    {
        String line;    //user input
        BufferedReader userdata = new BufferedReader(new InputStreamReader(System.in));
        
        Socket sock = new Socket("localhost",12345); //conect ke localhost port 12345
        DataOutputStream toServer = new DataOutputStream(sock.getOutputStream());
        BufferedReader fromServer = new BufferedReader(
                new InputStreamReader(sock.getInputStream()));
        
        line = userdata.readLine();
        toServer.writeBytes(line+'\n');
        String result = fromServer.readLine();
        System.out.print(result);
        sock.close();
        
        
    }
    
}
