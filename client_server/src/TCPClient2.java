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

public class TCPClient2 {
    public static void main(String args[])throws Exception
    {
        String line;
        String server="localhost";
        
        BufferedReader userdata=new BufferedReader(new InputStreamReader(System.in));
        
        if(args.length>1)
        {
            System.err.println("Usage : java TCPClient2 localhost");
            System.exit(1);
        } else if(args.length==1)
        {
            server = args[0];
            System.out.println("server : "+server);
        }
        Socket sock = new Socket(server,1234);
    }
    
}
