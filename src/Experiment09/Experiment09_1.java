package Experiment09;
import java.util.*;


abstract class Shape implements Comparable<Shape>
{
	private int comtype=0;
	protected double circum,area;
	protected String name;
//	public Shape()
//	{
//		name=null;
//		circum=area=0;
//	}
//	public Shape(String name)
//	{
//		this.name=name;
//	}
	
	public void changecomtype()
	{
		this.comtype=(comtype==0)?1:0;
	}
	double a=new Float(1.0);
	public abstract double getCircum();
	public abstract double getArea();
	public int compareTo(Shape s)
	{
		if(comtype==0)
		{
			return (this.area>s.area)?1:((this.area<s.area)?-1:0); 
		}
		else
		{
			return (this.circum>s.circum)?1:((this.circum<s.circum)?-1:0); 
		}
	}
}

class Ellipse extends Shape
{
	double a,b;
	public Ellipse(){};
	public Ellipse(double a,double b)
		{this.a=a;this.b=b;}
	public double getCircum()
		{circum=2*Math.PI*b+4*(a-b);return circum;}
	public double getArea()
		{area=Math.PI*a*b;return area;}
}

class Circle extends Ellipse
{
	double r;
	public Circle(double r)
	{
		a=r;b=r;
		this.r=r;
	}
}

class Rectangle extends Shape
{
	double l,w;
	public Rectangle(){};
	public Rectangle(double l,double w)
	{
		this.l=l;this.w=w;
	}
	public double getCircum()
		{circum=2*(l+w);return circum;}
	public double getArea()
		{area=l*w;return area;}
}

class Square extends Rectangle
{
	double a;
	public Square(){};
	public Square(double a)
	{
		l=a;w=a;
	}
}

class Hexagon extends Shape 
{
	double r1,r2,r3,r4,r5,r6;
	public Hexagon(){};
	public void Hexagen(double a,double b,double c, double d,double e,double f)
	{
		r1=a;r2=b;r3=c;r4=d;r5=e;r6=f;
	}
	public double getCircum()
		{circum=r1+r2+r3+r4+r5+r6;return circum;}
	public double getArea()
		{area=47;return area;}
}
class rHexagon extends Hexagon
{
	double r;
	public rHexagon(){};
	public void rHexagen(double r)
	{
		r1=r2=r3=r4=r5=r6=r;
		this.r=r;
	}
	public double getCircum()
		{circum=6*r;return circum;}
	public double getArea()
		{area=0.5*3*Math.sqrt(3)*r*r;return area;}
	
}

public class Experiment09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Shape[] s=new Shape[100];
		s[0]=new Ellipse(3,2);
		s[1]=new Square(3);
		s[2]=new Rectangle(2,3);
		s[3]=new Circle(2);
		for(int i=0;i<=3;i++)
		{
			s[i].getCircum();
			s[i].getArea();
		}
		System.out.println("The areas and circums:");
		for(int i=0;i<=3;i++)
		{
			String ss=s[i].toString();
			System.out.printf(ss.substring(13,ss.indexOf('@'))+":  %.2f\t%.2f\n",s[i].area,s[i].circum);
		}
		System.out.println();
		Arrays.sort(s,0,4);
		System.out.println("Sort by areas:");
		for(int i=0;i<=3;i++)
		{
			String ss=s[i].toString();
			System.out.printf(ss.substring(13,ss.indexOf('@'))+":  %.2f\n",s[i].area);
			s[i].changecomtype();
		}
		System.out.println();
		Arrays.sort(s,0,4);
		System.out.println("Sort by circums:");
		for(int i=0;i<=3;i++)
		{
			String ss=s[i].toString();
			System.out.printf(ss.substring(13,ss.indexOf('@'))+":  %.2f\n",s[i].circum);
//			s[i].changecomtype();
		}
		
		
	}

}
