
package josevicente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JoseVicente {
    private static final String url = "jdbc:mysql://localhost:3306/euromillones";
    private static final String usuario = "euromillones1";
    private static final String password = "euromillones1";

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, usuario, password);//Establezco la conexion
            // Preparo una peticion a la BBDD.
            Statement peticion = conexion.createStatement();
            System.out.println("Para ganar en los euromillones debes jugar a los números ....:");
            String sqlQuery = "SELECT Count(n1)as veces,n1 as numero FROM euromillones GROUP BY n1 ORDER BY veces DESC LIMIT 1";
            ResultSet resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla 1");
            }
            sqlQuery = "SELECT Count(n2)as veces,n2 as numero FROM euromillones GROUP BY n2 ORDER BY veces DESC LIMIT 1";
            resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla 2");;
            }
            sqlQuery = "SELECT Count(n3)as veces,n3 as numero FROM euromillones GROUP BY n3 ORDER BY veces DESC LIMIT 1";
            resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla 3");;
            }
            sqlQuery = "SELECT Count(n4)as veces,n4 as numero FROM euromillones GROUP BY n4 ORDER BY veces DESC LIMIT 1";
            resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla 4");;
            }
            sqlQuery = "SELECT Count(n5)as veces,n5 as numero FROM euromillones GROUP BY n5 ORDER BY veces DESC LIMIT 1";
            resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla 5");;
            }
            sqlQuery = "SELECT Count(e1)as veces,e1 as numero FROM euromillones GROUP BY e1 ORDER BY veces DESC LIMIT 1";
            resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla e1");;
            }
            sqlQuery = "SELECT Count(e2)as veces,e2 as numero FROM euromillones GROUP BY e2 ORDER BY veces DESC LIMIT 1";
            resultado = peticion.executeQuery(sqlQuery);
            while(resultado.next()){
                int cantidad = resultado.getInt("veces");
                int numero = resultado.getInt("numero");
                System.out.println("porque el número: "+numero+" ya ha salido: "+cantidad+" en la casilla e2");;
            }
            
            
            
        } catch (Exception e) {
            System.out.println("error : "+ e.getMessage());
        }


    }
    
}
