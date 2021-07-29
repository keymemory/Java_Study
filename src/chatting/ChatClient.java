package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;

	public ChatClient() {
		try {
			socket = new Socket("172.22.167.81", 9000);
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String str = null;
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));

			while ((str = sReader.readLine()) != null) {
				writer.println(str);
				System.out.println("output : " + str);
			}

			writer.close();
			reader.close();
			sReader.close();
			socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatClient();
	}

}
