abstract class Temperature
{
	double temp;
	abstract void changeTemp();
	void setTempData(double data)
	{
		temp = data;
	}
}

class Fahrenheit extends Temperature
{
	double ctemp;
	public void changeTemp()
	{
		ctemp = (5/9.0) * (temp - 32);
		System.out.println("the temperature in celsius is:" + ctemp + " degrees");
		
	}
}




public class temp_conversionMain {
	public static void main(String[] args)
	{
		Fahrenheit obj = new Fahrenheit();
//		obj.setTempData(32);
//		obj.changeTemp();
		obj.setTempData(98.6);
		obj.changeTemp();
	}
}
