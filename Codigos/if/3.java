/* 10. Programa que lea una variable entera mes y compruebe si el valor corresponde 
*  a un mes de 30, 31 o 28 días. Se mostrará además el nombre del mes. Se debe 
*  comprobar que el valor introducido esté comprendido entre 1 y 12.*/
import java.util.Scanner;
public class if2{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int mes=1;
		for (int i=0;i<=15;i++){
			mes=i;
			String respuesta = "31";
			if(mes>=1&&mes<=12){
				if((mes==4||mes==6||mes==9||mes==11)){
					respuesta = "30";
				}else if(mes == 2){
					respuesta = "28";
				}
				System.out.println(mes+" tiene "+respuesta+" días");
			}else{
				System.out.println(mes+" No es un mes valido");
			}
			
		}
		
	}
}