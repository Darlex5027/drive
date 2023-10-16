public class prueba3{
	public static void main(String[] args) {
		int [] dato= new int[100];

		for(int i=0;i<dato.length;i++){
			dato[i]=(int) (Math.random()*dato.length);
		}

		for(int x : dato){
			System.out.println(x);
		}

		for(int j =0; j<=dato.length;j++){
			for(int i=0;i<dato.length;i++){
			if((dato.length>(i+1))&&(dato[i]>dato[i+1])){
				int a=dato[i], b=dato[i+1];
				dato[i]=b;
				dato[i+1]=a;
			}	
			if((dato.length>(i+2))&&(dato[i+1]<dato[i+2])){
				int a=dato[i+1], b=dato[i+2];
				dato[i+1]=b;
				dato[i+2]=a;
			}
		}
		}
		for(int i=0;i<dato.length;i++){
			if((dato.length>(i+2))&&(dato[i]>dato[i+1])){
				int a=dato[i], b=dato[i+1];
				dato[i]=b;
				dato[i+1]=a;
			}	
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		for(int x:dato){
			System.out.println(x);
		}
		
	}
}