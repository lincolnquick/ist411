/*
Project: L01: Group Work
Purpose Details: Simple client/server "echo" application
Course: IST 411
Author: Team 3
Date Developed: 5/16/2023
Last Date Changed: 5/21/2023
Revision: 1
*/

import java.io.*;
import java.net.*;

/**
 * This class represents a simple client that connects to an echo server,
 * sends it text input, and displays the server's responses. *
 * @author Team 3
 */

public class EchoClient {
    
    public static void main(String[] args) throws IOException {        
        String serverHostname = "localhost";
        int port = 8080;

        try (Socket echoSocket = new Socket(serverHostname, port);
             PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
             BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) 
        {

            String askForInputPrompt = "Enter text to send to the server. Type 'quit' to close: ";
            System.out.println(askForInputPrompt);
            String userInput;
            
            while ((userInput = stdIn.readLine()) != null && !userInput.equals("quit")) 
            {
                out.println(userInput);
                System.out.println("server response: " + in.readLine());
                System.out.println();
                System.out.println(askForInputPrompt);
            }
        } 
        catch (UnknownHostException e) 
        {
            System.err.println("unsure about host " + serverHostname);
            System.exit(1);
        } 
        catch (IOException e) 
        {
            System.err.println("Couldn't get I/O for the connection to " + serverHostname);
            System.exit(1);
        }
    }
}