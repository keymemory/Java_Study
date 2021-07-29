package my.day12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConEx {

	public URLConEx() {
		String code = null;
		System.out.println("웹 주소 입력 : ");
		Scanner sc = new Scanner(System.in);
		String address = sc.next();

		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("file.html", false);

			while ((code = webData.readLine()) != null) {
				fw.write(code);
			}
			System.out.println("End");
			
			fw.close();
			webData.close();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new URLConEx();

	}

}
