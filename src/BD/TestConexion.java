package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM usuario");
			
			while (rs.next()) {
				String NIF = rs.getString(1);
				String NOMBRE = rs.getString(2);
				String APELLIDO = rs.getString(3);
				String TELEFONO = rs.getString(4);
				String CORREO = rs.getString(5);
				
				System.out.println(NIF + " - " + NOMBRE + " - " + APELLIDO + "-" + TELEFONO + "-" + CORREO +"-");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuario(NIF,NOMBRE,APELLIDO,TELEFONO,CORREO) VALUES (?,?,?,?,?)");
			stm2.setString(1 , "12345h");
			stm2.setString(2 , "Pepe");
			stm2.setString(3 , "12345");
			stm2.setString(4, "Alumno");
			stm2.setString(5, "Alumno");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("UPDATE usuario SET NIF = ?  WHERE NOMBRE = ?");
			stm2.setString(1 , "12345H");
			stm2.setString(2 , "PEPE");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("DELETE FROM usuario  WHERE NIF = ?");
			stm2.setString(1 , "12345h");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}