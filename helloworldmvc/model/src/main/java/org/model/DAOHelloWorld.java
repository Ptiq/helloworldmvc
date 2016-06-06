package org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOHelloWorld {
	private static String LOGIN = "root";
	private static String PASSWORD = "Yannlebg33";
	private static String URL = "jdbc:mysql://localhost/helloworldmvc?autoReconnect=true&useSSL=false";

	public static String getLOGIN() {
		return LOGIN;
	}

	public static String getPASSWORD() {
		return PASSWORD;
	}

	public static String getURL() {
		return URL;
	}

	public static void setLOGIN(final String lOGIN) {
		LOGIN = lOGIN;
	}

	public static void setPASSWORD(final String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public static void setURL(final String uRL) {
		URL = uRL;
	}

	private Connection connection;

	private Statement statement;

	public DAOHelloWorld(){
		this.connection = null;
		this.statement = null;
	}
	public void close(){

	}
	/*private ResultSet executeQuery(final String query) throws SQLException{
		return this.statement.executeQuery(query);
	}*/

	/*private int executeUpdate(final String query) throws SQLException{
		return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
	}*/

	public Connection getConnection() {
		return this.connection;
	}

	/*public Model getHelloWorldByld(final int id){
		return null;
	}*/

	/*	private int getLastId() {
		try {
			final ResultSet resultSet = this.statement.getGeneratedKeys();
			if (resultSet.next()) {
				return resultSet.getInt(1);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}*/

	public Statement getStatement() {
		return this.statement;
	}


	/*public void insertJavaPetri(final JavaPetri javaPetri) throws SQLException {
		if (executeUpdate(QueryJavaPetri.getQueryInsert(javaPetri)) == 1) {
			final int idJavaPetri = getLastId();
			if (idJavaPetri != -1) {
				executeUpdate(QueryJavaCell.getQueryInsert(javaPetri, idJavaPetri));
			}
		}
	}*/
	public Boolean open(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(DAOHelloWorld.URL,
					DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
			this.statement = this.connection.createStatement();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public void setConnection(final Connection connection) {
		this.connection = connection;
	}
	public void setStatement(final Statement statement) {
		this.statement = statement;
	}
}
