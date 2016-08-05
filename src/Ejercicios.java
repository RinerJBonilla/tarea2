
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int dd=x+y;
		return dd;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int dd2=x-y;
		return dd2;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int dd3=x*y;
		return dd3;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int dd4= x % y;
		return dd4;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
		int dd5=x;
		if(dd5%2==0){
			return true;
		}
		else{
		return false;
		}
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		int dd6=x;
		if(dd6%3==0){
			return true;
		}
		return false;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		int dd7=x;
		int dd8=y;
		if(dd7<dd8){
			return dd8;
		}
		return dd7;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		int dd9=edad;
		if(dd9>=18){
			return true;
		}
		return false;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		int dda=x;
		int dde=y;
		int ddi=z;
		if ((dda%2==0) && (dde%2==0) && (ddi%2==0)){
			return true;
			
		}
		return false;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		int ddx=x;
		int ddy=y;
		int ddz=z;
		if(ddx>ddy && ddx>ddz){
			return ddx;
		}
		if(ddy>ddx && ddy>ddz){
			return ddy;
		}
		return ddz;
	}
	
	public static void main(String[] args)
	{
		
	}

}
