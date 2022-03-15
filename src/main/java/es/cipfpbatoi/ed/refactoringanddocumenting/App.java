package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean mayor(int edad)
	{
		return edad >= 18;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante pepe = new Estudiante(10,"pepe");
        
        if ( mayor (pepe.edad) ) {
        	System.out.println("El estudiante " + pepe.n + " es mayor de edad");
        } else {
        	System.out.println("El estudiante " + pepe.n + " es menor de edad");
        }
        
    }
}
