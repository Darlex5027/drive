public class Principal{
	final static String dominio = "@uatx.mx";
	//alizcmp9
	public static void main(String[] args) {
	String nombre="Alejandro", apellido="Resendiz", carrera="Computacion", edad="19";
	System.out.println(""+correo(nombre, apellido, carrera,edad));

	}

	public static String correo(String _nombre, String _apellido,String _carrera, String _edad){
		StringBuilder correo = new StringBuilder(500);
		StringBuilder edad=new StringBuilder(_edad);
		edad.reverse();
		for(int i=0;i<2;i++){
			correo.insert(i,_nombre.charAt(i));
		}

		for(int i=0;i<2;i++){
			correo.insert(i+2,_apellido.charAt(_apellido.length()-2+i));
		}

		int z=0;
		for(int i=0;i<3;i++){
			correo.insert(i+4,_carrera.charAt(z));
			z+=2;
		}

		correo.append(edad.charAt(0));
		correo.append(dominio);
		return correo.toString();
	}
}