/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jrtec
 */
public class EchoServerTest {
    
    @Test
    public void testEcho() throws Exception {
        // Create mock socket and I/O streams
        Socket socket = Mockito.mock(Socket.class);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("hello\n".getBytes());

        // When getInputStream or getOutputStream are called on the socket, return the mock streams
        Mockito.when(socket.getInputStream()).thenReturn(inputStream);
        Mockito.when(socket.getOutputStream()).thenReturn(outputStream);

        EchoServer.echo(socket);

        // Check if the echoed output is as expected
        assertEquals("hello\n", outputStream.toString());
    }
    
}
