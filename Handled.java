
public class Handled {
	 public static void main(String[] arg){
		 try{
		   int i;
		   i= 25/0;
		   }catch(ArithmeticException e){System.out.println(e);}
		 System.out.println("rest excecuted");
	   }
}
