package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// ���� ����
// ServerSocket
// Socket

public class ChatServer {

	ServerSocket server;
	Socket socket;
	PrintWriter writer;
	BufferedReader reader;
	String lineStr;

	public ChatServer() {

		try {
			server = new ServerSocket(9999);
			System.out.println("���� ��� ��...");

			while (true) {
				socket = server.accept();
				System.out.println("Ŭ���̾�Ʈ�� ���� ����");

				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				while ((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}

				writer.close();
				reader.close();
				socket.close();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatServer();
	}

}
