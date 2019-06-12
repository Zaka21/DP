package dp1;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

public class main {
	public static void main(String[] args) throws ParseException {

		
		Date GBkees = new Date(95, 7, 1);
		Date GBpeter = new Date(94, 11, 26);

		
		Reiziger r1 = new Reiziger("kees", GBkees);
		Reiziger r2 = new Reiziger("Peter", GBpeter);

		Reizigerimpl i1 = new Reizigerimpl();

		
		i1.save(r1);
		i1.save(r2);
		System.out.println("De reizigers in de database: \n" + i1.findAll());

		
		i1.delete(r2);
		System.out.println("De reizigers na het verwijderen van r2: \n" + i1.findAll());

	
		List<Reiziger> findByDate = i1.findByGBdatum("1995-08-01");
		System.out.println("Reizigers met geboortedatum 01-07-1995:\n" + findByDate);

		
		r1.setNaam("willem");
		i1.update(r1);
		System.out.println("De reizigers in de database: \n" + i1.findAll());

	}
}
