import java.io.*;
import java.net.*;
import java.util.*;

class Client {
    
    public static void main(String[] args)
    {
        // establecer conexion con direccion ip y puerto
        try (Socket socket = new Socket("localhost", 9080)) {
            
            // escribir al server
            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
  
            // leer respuesta del server
            BufferedReader in
                = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
  
            Scanner sc = new Scanner(System.in);
            String line = null;
  
            while (!"exit".equalsIgnoreCase(line)) {
                
                // esperando linea de comandos
                line = sc.nextLine();
  
                // enviar mensaje al server
                out.println(line);
                out.flush();
                System.out.println("Server replied "
                                   + in.readLine());
            }
            
            // cerrar el scanner
            sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}