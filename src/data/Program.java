package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data3 = new Date();
		Date data4 = new Date(System.currentTimeMillis());
		Date data5 = new Date(0);
		Date data6 = new Date(1000L * 60 * 60L * 8L);
		
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
		System.out.println(data6);
		
		System.out.println("--------------------------------------------------");
		
		try {
			Date h1 = data1.parse("16/07/2021");
			System.out.println(h1);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		try {
			Date h2 = data2.parse("16/07/2021 10:07:08");
			System.out.println(h2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		

	}
	
}
