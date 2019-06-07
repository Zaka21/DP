package dp4;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
	public static void main(String[] args) throws SQLException, ParseException {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		
		//create reiziger
		Reiziger r1 = new Reiziger();
		r1.setReizigerId(7);
		r1.setAchternaam("nieuw");
		r1.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("31-10-1915"));
		r1.setVoorletters("aa");
		//create reiziger
		Reiziger r2 = new Reiziger();
		r2.setReizigerId(8);
		r2.setAchternaam("redie");
		r2.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("11-09-1977"));
		r2.setVoorletters("pedie");
		//create reiziger
		Reiziger r3 = new Reiziger();
		r3.setReizigerId(9);
		r3.setAchternaam("ahah");
		r3.setGeboortedatum(new SimpleDateFormat("dd-mm-yy").parse("05-02-2009"));
		r3.setVoorletters("app");
		
		session.save(r1);
		session.save(r2);
		session.save(r3);
		
		// update r2
		r2.setAchternaam("Please");
		
		session.update(r2);
		
		//delete R3
		session.delete(r3);
		
		
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
	}