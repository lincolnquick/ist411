
/*
Project: L01: Group Work
Purpose Details: Simple client/server "echo" application
Course: IST 411
Author: Team 3
Date Developed: 5/16/2023
Last Date Changed: 5/21/2023
Revision: 1
*/

import java.net.*;
import java.io.*;

/**
 * This class represents a simple echo server
 * which listens to a specific port for client connections
 * then reads input from the client and sends it back to the client. 
 * @author Team 3
 */

public class EchoServer {
    
    public static void main(String[] args) throws IOException { // initializes the server and waits for a client connection.
        
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket clientSocket = serverSocket.accept();
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) 
        {
            System.out.println("Client connected on port " + port + ".");
            String inputLine;
            while ((inputLine = in.readLine()) != null) 
            {
                System.out.println("Received message: " + inputLine + " from client.");
                out.println(inputLine);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Exception caught when trying to listen on port " + port);
            System.out.println(e.getMessage());
        }
    }
    
    public static void echo(Socket clientSocket) {
        
    try (PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
         BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) 
    {
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
        {
            out.println(inputLine);
        }        
    }
    catch (IOException e) 
    {
        e.printStackTrace();
    }
}
}
