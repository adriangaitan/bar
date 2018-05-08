
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ConexionBBDD {

	private String bd;
	private String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr = "SYSTEM";
	private String pwd = "lorca";
	private Connection conexion;
	

	public ConexionBBDD()  {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexi�n establecida");
			}
			else
				System.out.println("Fallo en Conexi�n");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexi�n con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
	public DefaultTableModel ConsultaTablaCategorias() {
		String [] columnas={"IDPRODUCTO","NOMBRE","PRECIO","CANTIDAD_RESTANTE"};
		String [] registro=new String[4];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM ADRIAN.PRODUCTO";
		 
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				 registro[0]=rset.getString("IDPRODUCTO");
		         registro[1]=rset.getString("NOMBRE");
		         registro[2]=rset.getString("PRECIO");
		         registro[3]=rset.getString("CANTIDAD_RESTANTE");
		         
		         ModeloTabla.addRow(registro);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return ModeloTabla;
		
	}
	}