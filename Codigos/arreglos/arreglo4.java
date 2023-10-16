import java.util.Scanner;

public class arreglo4{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos número aleatorios entre 1-100 quieres?");
		int[] nums=new int[entrada.nextInt()];
		for(int i=0;i<nums.length;i++){
			nums[i]=(int) (Math.random() * 100 + 1);
		}

		for(int v : nums){
			System.out.println(v);
		}	
	}
}