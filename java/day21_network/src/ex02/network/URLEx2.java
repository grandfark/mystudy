package ex02.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) 
			throws MalformedURLException{
		
//		URL url = new URL("https://www.google.com/search?q=ssd&source=hp&ei=IBJGZNSILvmM2roPmva78As&iflsig=AOEireoAAAAAZEYgMLxf6Q8thekptWtI9u-cb57rEmDo&ved=0ahUKEwjUmPGQ48H-AhV5hlYBHRr7Dr4Q4dUDCAs&uact=5&oq=ssd&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAEIAEELEDMggIABCABBCxAzILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgcIABCABBAKOhEILhCABBCxAxCDARDHARDRAzoECAAQAzoUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6DgguEIAEELEDEMcBENEDUABYoAJg9AJoAHAAeACAAVSIAfABkgEBM5gBAKABAQ&sclient=gws-wiz");

		URL url = new URL("https://www.google.com/search?q=kim+yuna&source=hp&ei=sxVGZLz1Eorg2roPnfejqAk&iflsig=AOEireoAAAAAZEYjw9maPPFXzuTDQtIdwgWRNZvfPjoY&ved=0ahUKEwj8mv3E5sH-AhUKsFYBHZ37CJUQ4dUDCAs&uact=5&oq=kim+yuna&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgsIABCABBCxAxCDAToECAAQAzoUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6BAguEAM6DgguEIAEELEDEMcBENEDOgsILhCABBCxAxCDAToICAAQgAQQsQM6CwguEIAEEMcBEK8BOgsILhCABBCxAxDUAjoICC4QgAQQsQM6DgguEIAEELEDEIMBENQCOgcILhCABBAKOgcIABCABBAKOgYIABAeEAo6BAgAEB46CQgAEB4Q8QQQClAAWL8dYM8jaABwAHgAgAHvAYgB-gaSAQU1LjIuMZgBAKABAQ&sclient=gws-wiz");
		
		//URL이 갖고 있는 함수들 활용
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호스트와 포트 : "+url.getAuthority());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트: "+url.getPort());
		System.out.println("경로 : "+url.getPath());
		System.out.println("질의 : "+url.getQuery());
		System.out.println("파일명 : "+url.getFile());
		System.out.println("참조 : "+url.getRef());
	}
}
