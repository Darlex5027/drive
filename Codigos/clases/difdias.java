import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class difdias{
	public static class Disc {
		int year=0;
		int month=0;
		int day=0;
		String name="";

		public void setName (String sname){
			name=sname;
		}
		public void setYear(int syear) {
			year=syear;
    	}

    	public void setMonth(int smonth){
    		month = smonth;
    	}

    	public void setDay(int sday){
    		day=sday;
    	}

    	public String getName(){
    		return name;
    	}

		public int getYear() {
        	return year;
    	}

    	public int getMonth(){
    		return month;
    	}

    	public int getDay(){
    		return day;
    	}

    	public String getAge(int sao,int smes,int sdia){
    		
    		String age = this.name+" cumple el día de hoy: \n"+(sao-this.year)+" años, "+(smes-this.month)+" meses y "+(sdia-this.day)+" días.\n";
    		return age;	
    	}
	}
	public  static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Calendar fecha = new GregorianCalendar();
		final int ao = fecha.get(Calendar.YEAR);
		final int mes = 1+fecha.get(Calendar.MONTH);
		final int dia = fecha.get(Calendar.DAY_OF_MONTH);

		Disc appetitefordestruction = new Disc();
		Disc useyourillusionI = new Disc();
		Disc useyourillusionII = new Disc();
		Disc thespaghettiincident = new Disc();
		Disc chinesedemocracy = new Disc();

		

		useyourillusionI.setName("Use Your Ilusion I");
		useyourillusionI.setYear(1991);
		useyourillusionI.setMonth(9);
		useyourillusionI.setDay(17);

		useyourillusionII.setName("Use Your Ilusion II");
		useyourillusionII.setYear(1991);
		useyourillusionII.setMonth(9);
		useyourillusionII.setDay(17);

	
		System.out.println(ao+"/"+mes+"/"+dia);

		System.out.print(useyourillusionI.getAge(ao,mes,dia)+
							useyourillusionII.getAge(ao,mes,dia));
	}
}