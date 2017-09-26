package java_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) {
		URL opi=null;
		URL homepage=null;
		
//		http://dgit.or.kr/
		try {
			homepage=new URL("http://dgit.or.kr:80");
			opi=new URL(homepage,"SUB/?ctId=15");
			System.out.printf("protocol : %s%n",opi.getProtocol());
			System.out.printf("host : %s%n",opi.getHost());
			System.out.printf("port : %s%n",opi.getPort());
			System.out.printf("path : %s%n",opi.getPath());
			System.out.printf("file : %s%n",opi.getFile());
			BufferedReader br=new BufferedReader(new InputStreamReader(opi.openStream()));
			String line=null;
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
			
		} catch (MalformedURLException e) {
			System.out.println("잘못된 url");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
