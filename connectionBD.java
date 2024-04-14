package ejercicoUtn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionBD {
	
	private Connection conexion;
	private final  String URL_DB="JDBC:MYSQL://localhost:3306/nombre_le_la_base_de_datos";
	
	public void ConexionBD() throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.jdbc.driver");
		conexion=DriverManager.getConnection(URL_DB,"usuario","contrasea");
		System.out.println("conexion a la bd exitosa");
		}catch(SQLException e) {System.out.println("erro de conexion");}
	}
	
	//metodo para agregar materias
	public  void agregarMaterias (String codigo,String nombre,String []correlativas) {
		try {
			Connection con =DriverManager.getConnection("JDBC:MYSQL://localhost:3306/mbase_de_datos?useSSL=false","usuario","contrasea");
			Statement stmt=con.createStatement();
			String query = "INSERT INTO materia (codigo,nombre,correlativas)VALUES(''' + codigo+''', '''+ nombre+ ''',''' + correlativas +''')";
					 stmt.executeUpdate(query);
					 System.out.println("materi agregada exitisamente.");
					 con.close();
		}catch(SQLException e) {
			System.out.println("erro al agregar materia:"+ e.getMessage());
		}
	}
	
	//metodo para agregar alumnos
	
	public  void agregaralunnos (String nombre,String apelido,int legajo,String []inscripciones) {
		try {
			if (legajo < 10000 || legajo >99999) {
				System.out.println("el numero del legajo debe tener 5 digito");
				return;
			}
			Connection con =DriverManager.getConnection("JDBC:MYSQL://localhost:3306/mbase_de_datos?useSSL=false","usuario","contrasea");
			Statement stmt=con.createStatement();
			for (String inscripcion : inscripciones) {
				String query ="SELECT correlativas FROM materias WHERE codigo=´´´+ inscripcion+'''";
				ResultSet rs = stmt.executeQuery(query);
				if (rs.next()) {
					String[]correlativas =rs.getString("correlativas").split(",");
					for(String correlativa : correlativas) {
						String correlativaquery = "SELECT codigo FROM materia WHERE codigo = ''' +correlativa+''' AND NOT EXISTS( SELECT * FROM inscripcion WHERE legajo = " +legajo +" AND MATERIAS_CODIGO = ''' + CORRELATIVA + ''')";
						ResultSet correlativaRs=stmt.executeQuery(correlativaquery);
						if(!correlativaRs.next()) {
							System.out.println("no cumple con las corelativas necesarias para inscribirse en "+ inscripcion);
							return;
						}
					}
				}
				else {System.out.println("la materis"+ inscripcion + "no existe");
				return;
				}
			}
			
			 String insertQuery = "INSERT INTO alumno (nombre ,apellido,legajo)VALUES(''' + nombre + ''',''' + apellido+ ''',''' + legajo+''')";
			 stmt.executeQuery(insertQuery);
			 for(String inscripcion : inscripciones ) {
				 insertQuery = "INSERT INTO inscripcion (legajo,materia_codigo)VALUES(" + legajo+",'''+inscripcion+''')";
				 stmt.executeQuery(insertQuery);
			 }
			 System.out.println("inscripcion existosa");
			 
			
		}catch(SQLException e) {
			System.out.println("erro de base de datos:"+ e.getMessage());
		}finally {
	
			if(stmt!=null) {
				try {
				 stmt.close();
				}catch (SQLExeption e) {
				System.out.println("error al cerrar la coneccion"+ e.getMessage());
				}
			}
			if (con !=null){
				try {
					con.close();
				}catch (SQLExeption e) {
					System.out.println("error al cerrar la coneccion"+ e.getMessage());
				}
				
			}
		}
	}
	
}
