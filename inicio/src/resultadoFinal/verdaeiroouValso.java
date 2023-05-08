package resultadoFinal;

public class verdaeiroouValso {

	public static void main(String[] args) {
		
	
	int  a = 5,b = 7,c = 4,d = 8;
	
	boolean  vda = (a <= b)&&(b < d);
	System.out.println(" essa espressão é "+" "+vda);
	
	boolean vdb =(a == b)||(c!=b);
	System.out.println(" essa espressão é "+" "+vdb);
	
	boolean vdc = (d > a)&&(c >= b);
	System.out.println(" essa espressão é "+" "+vdc);
	
	boolean vdd = (a<=b)||(c<=d);
	System.out.println(" essa espressão é "+" "+vdd);
	
	boolean vde = ((b>c)||(c<a))&&(d<=b);
	System.out.println(" essa espressão é "+" "+vde);
	}
}
