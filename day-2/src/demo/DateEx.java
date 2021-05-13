package demo;

import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		//we have to use 2 clases with same name but from diff pacages
		//one should be fully qualified otherwise java get confuesed
		//which should be fully qualifited: which should be used less
		
		Date date=new Date();
		
		java.sql.Date date2=new java.sql.Date(date.getTime());
		
	}
}
