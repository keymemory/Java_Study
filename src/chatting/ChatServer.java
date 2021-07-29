package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 소켓 서버
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
			System.out.println("서버 대기 중...");

			while (true) {
				socket = server.accept();
				System.out.println("클라이언트와 연결 성공");

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
