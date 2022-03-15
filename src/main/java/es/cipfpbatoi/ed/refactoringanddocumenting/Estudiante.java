package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante{
	
	int edad;
	String n;
	
	
	public Estudiante(int e, String n) {
		this.edad = e;
		this.n = n;
	}

	public int comparaTe( Estudiante e) {
		
		if (this.edad == e.edad){
			return 0;
		} else if (this.edad > e.edad) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
