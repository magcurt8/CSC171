
public class Imaginary 
{
	private double r;
	private double im;
	
	public Imaginary(double real, double imag)
	{
		r=real;
		im=imag;
	}
	public void setReal(double real)
	{
		r=real;
	}
	public void setImag(double imag)
	{
		im=imag;
	}
	public double getReal()
	{
		return r;
	}
	public double getImag()
	{
		return im;
	}
	public Imaginary addition(Imaginary x)//http://www.mathwords.com/c/complex_number_formulas.html
	{
		Imaginary z = new Imaginary(0,0);
		double newR = this.r+x.r;
		z.setReal(newR);
		double newIm = this.im+x.im;
		z.setImag(newIm);
		return z;
	}
	public static Imaginary addition(Imaginary x, Imaginary y)
	{
		Imaginary z=new Imaginary(0,0);
		double newR=x.r+y.r;
		z.setReal(newR);
		double newIm=x.im+x.im;
		z.setImag(newIm);
		return z;
	}
	public Imaginary subtraction(Imaginary x)
	{
		Imaginary z=new Imaginary(0,0);
		double newR=this.r-x.r;
		z.setReal(newR);
		double newIm=this.im-x.im;
		z.setImag(newIm);
		return z;
	}
	public static Imaginary subtraction(Imaginary x, Imaginary y)
	{
		Imaginary z=new Imaginary(0,0);
		double newR=x.r-y.r;
		z.setReal(newR);
		double newIm=x.im-y.im;
		z.setImag(newIm);
		return z;
	}
	public Imaginary multiplication(Imaginary x)
	{
		Imaginary z=new Imaginary(0,0);
		double newR=x.r*this.r-x.im*this.im;
		z.setReal(newR);
		double newIm=x.r*this.im+x.im*this.r;
		z.setImag(newIm);
		return z;
	}
	public static Imaginary multiplication(Imaginary x, Imaginary y)
	{
		Imaginary z=new Imaginary(0,0);
		double newR=x.r*y.r-x.im*y.im;
		z.setReal(newR);
		double newIm=x.r*y.im+x.im*y.r;
		z.setImag(newIm);
		return z;
	}
	public Imaginary division(Imaginary x)
	{
		Imaginary z=new Imaginary(0,0);
		double newR= (((x.r*this.r)+(x.im*this.im))/(Math.pow(this.r, 2))+(Math.pow(this.im, 2)));
		z.setReal(newR);
		double newIm=((x.im*this.r)-(x.r*this.im)/(Math.pow(this.r, 2))+(Math.pow(this.im, 2)));
		z.setImag(newIm);
		return z;
	}
	
	public static Imaginary division(Imaginary x, Imaginary y)
	{
		Imaginary z=new Imaginary(0,0);
		double newR= (((x.r*y.r)+(x.im*y.im))/(Math.pow(y.r, 2))+(Math.pow(y.im, 2)));
		z.setReal(newR);
		double newIm=((x.im*y.r)-(x.r*y.im)/(Math.pow(y.r, 2))+(Math.pow(y.im, 2)));
		z.setImag(newIm);
		return z;
	}
	
	public double getRadius(Imaginary x)
	{
		double rad=Math.pow((x.r*x.r)+(x.im*x.im),0.5);
		return rad;
	}
	
	public double getAngle(Imaginary x)
	{
		double angle=Math.toDegrees(Math.atan2(x.im, x.r));
		return angle;
	}
	public String toString()
	{
		if (im>=0)
		{
			return r+"+"+im+"i";
		}
		else
		{
			return r+"-"+-im+"i";
		}
	}	
	
}

