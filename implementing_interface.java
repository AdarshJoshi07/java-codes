import java.util.Scanner;

interface calVolume
{
	void displayVolume();// abstract method as it has no body.
	
}
class Cone implements calVolume
{
	double radius , height;
	Cone(double r , double h)
	{
		this.radius = r; 
		this.height = h;
	}
	public void displayVolume()
	{
		System.out.println("the volume of cone is:" + (1.0/3.0)*3.14*(radius*radius)*height);
	}
}
class Hemisphere implements calVolume
{
	double r ;
	Hemisphere(double r)
	{
		this.r = r;
	}
	public void displayVolume()
	{
		System.out.println("the volume of hemisphere is:" + (2.0/3.0) * 3.14 * r * r *r);
	}
}

class Cylinder implements calVolume
{
	double rad , hei;
	Cylinder(double r , double h)
	{
		rad = r;
		hei = h;
	}
	public void displayVolume()
	{
		System.out.println("the volume of cylinder is:" + 3.14 * rad * rad * hei);
	}
}
public class implementing_interface {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius and height of cone: ");
		double coneR = sc.nextDouble();
		double coneH = sc.nextDouble();
		Cone co = new Cone(coneR, coneH);
		
		System.out.println("enter radius of hemisphere");
		double hemiR = sc.nextDouble();
		Hemisphere hemi = new Hemisphere(hemiR);
		
		System.out.println("enter the radius and height of cylinder:");
		double cylR = sc.nextDouble();
		double cylH = sc.nextDouble();
		Cylinder cyl = new Cylinder(cylR , cylH);
		
		co.displayVolume();
		hemi.displayVolume();
		cyl.displayVolume();
		
		sc.close();
		
		
		
	}
}
