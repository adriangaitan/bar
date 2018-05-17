import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.table.DefaultTableModel;



public class ConexionBBDD {

	private String url;
	private String usr;
	private String pwd;
	private String esquema;
	public Connection conexion;
	

	public ConexionBBDD()  {
		FicheroIni();
		
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
	
	public void FicheroIni() {
		Properties properties = new Properties();
		InputStream entrada = null;
		try {
			     File miFichero= new File("src/FicheroIni.ini");
			     if(miFichero.exists()) {
			    	 entrada = new FileInputStream(miFichero);
			    	 properties.load(entrada);
			    	 url = properties.getProperty("dbhost");
			    	 usr = properties.getProperty("dbuser");
			    	 pwd = properties.getProperty("dbpasswd");
			    	 esquema = properties.getProperty("dbname");
			     }	     
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally {
			if(entrada != null) {
				try {
					entrada.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
		
	}
	public DefaultTableModel ConsultaTablaCategorias() {
		String [] columnas={"IDPRODUCTO","NOMBRE","PRECIO","CANTIDAD_RESTANTE"};
		String [] registro=new String[4];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM "+ esquema +".PRODUCTO";
		 
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
		String query = "SELECT * FROM "+ esquema +".CATEGORIA";
		 
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
		String query = "SELECT * FROM "+ esquema +".MESA";
		 
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
		
		String query = "INSERT INTO "+ esquema +".PRODUCTO VALUES(" + p.IDPRODUCTO + " , '" + p.NOMBRE + "' , " + p.PRECIO + " , " + p.CANTIDAD_RESTANTE + ")";
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
    		
    		String query = "DELETE FROM "+ esquema +".PRODUCTO WHERE NOMBRE = '" + p.NOMBRE + "'";
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
        public int ConsultaInsertarCategoria(Categoria c) {
    		
    		int resultado = 0;
    		
    		String query = "INSERT INTO "+ esquema +".CATEGORIA VALUES(" + c.IDCATEGORIA + " , '" + c.TIPO_PRODUCTO + "')";
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
        public int ConsultaBorrarCategoria(Categoria c) {
    		
    		int resultado = 0;
    		
    		String query = "DELETE FROM "+ esquema +".CATEGORIA WHERE TIPO_PRODUCTO = '" + c.TIPO_PRODUCTO + "'";
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
        public int ConsultaModificarProducto(Producto p) {
			return 0;
        }
        public int ConsultaModificarCategoria(Categoria c) {
			return 0;
        }
        }
    		
    	


		
	
	