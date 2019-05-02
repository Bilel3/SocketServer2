package socketprojet;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptClient implements Runnable {

	   private ServerSocket socketserver;
	   private Socket socket;
	   private int nbrclient = 1;
		public AcceptClient(ServerSocket s){
			socketserver = s;
		}
		
		public void run() {

	        try {
	        	while(true){
			          socket = socketserver.accept();
	                  System.out.println("The client number "+nbrclient+ " is connected !");
	                  nbrclient++;
	                  socket.close();
	        	}
	        
	        } catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
