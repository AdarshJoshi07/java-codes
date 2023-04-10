abstract class Temperature1
{
	double temp;
	void setTempData(double data)
	{
		temp = data;
	}
	abstract void changeTemp();
}
class Fahrenheit1 extends Temperature1
{
	double ctemp;
	public void changeTemp()
	{
		ctemp = (5.0/9.0)*(temp - 32);
		System.out.println("the temperature in celsius is: " + ctemp + " degrees");
		
	}
}

class Celsius extends Temperature1
{
	double ftemp;
	public void changeTemp()
	{
		ftemp = temp* (9.0 / 5.0) + 32;
		System.out.println("the temperature in fahrenheit is:" + ftemp + " degrees");
		
	}
}
public class fahToCelsiusMain {
	public static void main(String[] args)
	{
		Celsius c = new Celsius();
		c.setTempData(0);
		c.changeTemp();
		Fahrenheit1 f = new Fahrenheit1();
		f.setTempData(32);
		f.changeTemp();
	}
}
