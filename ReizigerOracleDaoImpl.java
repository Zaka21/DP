package dp;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class ReizigerOracleDaolmpl extends OracleBaseDao implements ReizigerDao {

	public List<Reiziger> findAll() {
		return null;
	}

	public List<Reiziger> findByGBdatum(Date date) {
		return null;
	}

	public Reiziger save(Reiziger reiziger) {
		return reiziger;
	}

	public Reiziger update(Reiziger reiziger) {
		return reiziger;

	}

	public boolean delete(Reiziger reiziger) {
		return true;
	}

	public void closeConnection() throws SQLException {
		getConnection().close();
	}
}
