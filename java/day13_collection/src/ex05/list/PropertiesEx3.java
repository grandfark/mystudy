package ex05.list;
import java.util.*;
import java.io.*;

class PropertiesEx3
{
	public static void main(String[] args)
	{
		Properties prop = new Properties();
		//propddp 에 키와 값을(key, value) 저장한다.
		prop.setProperty("timeout","30");//자바는 20분이 기본 값으로 가진다.
		prop.setProperty("language","한글");//유휴시간 로그인이 살아있는 시간
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		try {
			 prop.store(new FileOutputStream("output.txt"), "Properties Example");
			 prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch(IOException e) {
			e.printStackTrace();		
		}
	}
}