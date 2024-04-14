package ejercicoUtn;

public class testCorrelativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		alumno alumno1 = new alumno("cristan",197,"matematica");
		materias materiasc = new materias("mateamatica1,matematica2");
		inscripcion inscripcion1 =new inscripcion();
		inscripcion1.setAlumno("cristian");
		inscripcion1.setAltaIngreso(11,2,23);
		inscripcion1.setMateria("matematica");
		
		System.out.println("alumno "+ inscripcion1.getAlumno());
		System.out.println("la fecha de ingreso es " + inscripcion1.getAltaIngreso());
		
		System.out.println("materia a cursar  "+ inscripcion1.getMateria());
        
	}

}
