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

public class tcpServer {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(12345,5);
        for(;;)
        {
        Socket con = ss.accept();
        
        BufferedReader fromClient = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        
        DataOutputStream toClient = new DataOutputStream(con.getOutputStream());
        
        String line = fromClient.readLine();
        System.out.println("got :\""+line+"\"");
        String result = line.length() +":"+ line.toLowerCase() +'\n';
        
        toClient.writeBytes(result);
        System.out.println("Terimakasih by Saiful Rizal \n");
        con.close();
        //ss.close();
        }
    }
}
