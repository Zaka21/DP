package dp1;


import java.text.ParseException;
import java.util.List;
public interface Reizigerdao {	
	public List<Reiziger> findAll();	
	public List<Reiziger> findByGBdatum(String GBdatum) 
			throws ParseException;	
	public Reiziger save(Reiziger reiziger);	
	public Reiziger update(Reiziger reiziger);	
	public boolean delete(Reiziger reiziger);}
