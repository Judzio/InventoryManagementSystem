package server;

import java.net.*;
import java.io.*;

public class ManagementSystem implements Runnable
{
    protected Socket socket;
    public ManagementSystem(Socket clientSocket)
    {
        this.socket = clientSocket;
    }
    public void run()
    {
        //Deklaracje zmiennych
        BufferedReader brinp = null;
        DataOutputStream out = null;
        String threadName = Thread.currentThread().getName();

        //inicjalizacja strumieni
        try{
            brinp = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch(IOException e){
            System.out.println(threadName + "| Błąd przy tworzeniu strumieni " + e);
            return;
        }
        String line = null;

        //pętla główna
        while(true){
            try{
                line = brinp.readLine();
                System.out.println(threadName + "| Odczytano linię: " + line);

                //badanie warunku zakończenia pracy
                if((line == null) || "quit".equals(line)){
                    System.out.println(threadName + "| Zakończenie pracy z klientem: " + socket);
                    socket.close();
                    return;
                }
                else{ //odesłanie danych do klienta
                    String test = "dzienki";
                    out.writeBytes(test + "\n");
                    System.out.println(threadName + "| Wysłano linię: " + test);
                }
            }
            catch(IOException e){
                System.out.println(threadName + "| Błąd wejścia-wyjścia." + e);
                return;
            }
        }
    }
}
