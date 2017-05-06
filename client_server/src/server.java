/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bang_ipu12
 * 
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class server {
    
    public static void main(String[] args)
    {
        try {
        ServerSocket masuk = new ServerSocket(1234,5);
        Socket terima = masuk.accept();
        InputStream is = terima.getInputStream();
        OutputStream os = terima.getOutputStream();
        
        String res = "Selamat Datang\r\n";
        int a;
        while(true)
        {
            a=is.read();
            System.out.print((char)a);
            
            if ((char)a=='\n')
            break;
        }
        os.write(res.getBytes());
        os.flush();
    
        } catch (IOException ex){
            
        }
        
    }
    }
