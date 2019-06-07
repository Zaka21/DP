package dp2;

import java.sql.SQLException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws SQLException {
		ReizigerOracleDaolmpl reizigerOracleDao = new ReizigerOracleDaolmpl();
		List<Reiziger> reizigers = reizigerOracleDao.findAll();
		for (Reiziger reiziger : reizigers) {
			System.out.println(reiziger.getNaam());
		}
	}
}
