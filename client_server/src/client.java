/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bang_ipu12
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class client {
    public static void main(String[] args)
    {
        try
        {
            Socket sk = new Socket("localhost", 1234);
            InputStream is = sk.getInputStream();
            OutputStream os = sk.getOutputStream();
            
            String pesan = "Saiful Rizal pc 2\r\n";
            os.write(pesan.getBytes());
            
            int a;
            while(true)
            {
                a=is.read();
                System.out.print((char)a);
                if((char)a=='\n');
                break;
            }
            is.close();
            os.close();
            sk.close();
        } catch (UnknownHostException ex){
            Logger.getLogger(client.class.getName());
        } catch (IOException ex){
            Logger.getLogger(client.class.getName());
        }
    }
    
}
