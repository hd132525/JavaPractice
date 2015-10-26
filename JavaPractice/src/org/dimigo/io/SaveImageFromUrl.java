package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {
	
	public static void main(String[] args){
		String imageUrl = "https://scontent-nrt1-1.xx.fbcdn.net/hphotos-xpt1/v/t1.0-9/11219601_1079755682059433_7150149326098168285_n.png?oh=907e7002f4ebbbc8a6a40ece8723f5c8&oe=568B062C";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream()) {
				OutputStream os = new FileOutputStream("files/logo.png");
				
				byte[] buf = new byte[100];
				int result;
				
				while((result = is.read(buf))!=-1) {
					os.write(buf, 0, result);
				}
				
				os.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			System.out.println("가져오기 완료!");
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
}
