
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
	public Connection conexion;
	

	public ConexionBBDD()  {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
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
	public DefaultTableModel ConsultaSoloCategorias() {
		String [] columnas={"IDCATEGORIA", "TIPO_PRODUCTO"};
		String [] registro=new String[2];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM ADRIAN.CATEGORIA";
		 
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				 registro[0]=rset.getString("IDCATEGORIA");
		         registro[1]=rset.getString("TIPO_PRODUCTO");
		         
		         ModeloTabla.addRow(registro);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return ModeloTabla;
		
	}
	public DefaultTableModel ConsultaMesas() {
		String [] columnas={"IDMESA", "NUMERO_SILLAS","UBICACION_SILLAS"};
		String [] registro=new String[3];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM ADRIAN.MESA";
		 
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				 registro[0]=rset.getString("IDMESA");
		         registro[1]=rset.getString("NUMERO_SILLAS");
		         registro[2]=rset.getString("UBICACION_SILLAS");
		         
		         ModeloTabla.addRow(registro);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return ModeloTabla;
		
	}
        public int ConsultaInsertarProducto(Producto p) {
		
		int resultado = 0;
		
		String query = "INSERT INTO ADRIAN.PRODUCTO VALUES(" + p.IDPRODUCTO + " , '" + p.NOMBRE + "' , " + p.PRECIO + " , " + p.CANTIDAD_RESTANTE + ")";
		System.out.println(query);
		try {
			Statement stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(query);
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return resultado;
		
	}
        public int ConsultaBorrarProducto(Producto p) {
    		
    		int resultado = 0;
    		
    		String query = "DELETE * FROM ADRIAN.PRODUCTO WHERE NOMBRE = '" + p.getNOMBRE() + "')";
    		System.out.println(query);
    		try {
    			Statement stmt = conexion.createStatement();
    			resultado = stmt.executeUpdate(query);
    			stmt.close();
    			
    		}catch (SQLException s){
    			s.printStackTrace();
    		}
    		
    		return resultado;
    		
    	}

		
	
	}