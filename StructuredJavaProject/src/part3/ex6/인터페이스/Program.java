package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {


	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		// setting.txt를 읽어오기위한 파일 입력
		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		// System.out.println(className); 
		scan.close();
		fis.close();
		//
		// 문자열을 이용해 클래스 정보 얻기 
		Class clazz = Class.forName(className);
		A a = new A();
		// 클래스정보를 통해 새로운 인터페이스를 만들 수 있다. 
		// 그러므로 메서드를 통해 인터페이스를 만들 수 있다. 
		X x = (X) clazz.newInstance();
		a.setX(x);
		a.print();
	}

}
