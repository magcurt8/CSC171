public class Rational 
{//start of class
	private double numer;//instance variables
	private double denom;
		public Rational(double num,double den)//start of constructor
		{
			if (den==0)//adds signs to formula
				System.out.println("Cannot divide by zero");
			if (den<0)
			{
				num=num*-1;
				den=den*-1;
			}//
			numer=num;
			denom=den;
		}
		/*public static double Reduce(double num, double den)
		{
			return Reduce(den,num%den);
		}*/
		public double getNumer()//get methods
		{
			return numer;
		}
		public double getDenom()
		{
			return denom;
		}
		public Rational recip()//reciprocal of fraction
		{
			return new Rational(denom,numer);
		}
		public boolean equals(Rational x)//equals method
		{
			return(this.getNumer()==x.getNumer()&&this.getDenom()==x.getDenom());
		}
		public double compareTo(Rational x)//compareto method
		{
		Rational y=this;
		double a=y.numer*x.getDenom();
		double b=y.denom*x.getNumer();
		if(b<a) return -1;
		if(b>a) return +1;
		else 
			return 0;
		}
		public Rational addition(Rational x)//addition method-(all arithmetic) http://codereview.stackexchange.com/questions/40554/rational-number-arithmetic
		{
			double newd=x.denom*this.denom;
			double num1=x.numer*this.denom;
			double num2=this.numer*x.denom;
			double newnum=num1+num2;
			return new Rational(newnum,newd);
		}
		
		public static Rational addition1(Rational x, Rational y)//static subtraction method
		{
			double newd=x.denom*y.denom;
			double num1=x.numer+y.denom;
			double num2=y.numer*x.denom;
			double newnum=num1+num2;
			return new Rational(newnum,newd);
		}
		public Rational subtraction(Rational x)//subtraction method
		{
			double newd=x.denom*this.denom;
			double num1=x.numer*this.denom;
			double num2=this.numer*x.denom;
			double newnum=num1-num2;
			if(x.numer>numer)
			{
				numer=(x.numer*num2)-(numer*num1);
			}
			else
			{
				numer=(numer*num1)-(x.numer*num2);
			}
			return new Rational(newnum,newd);
		}
		public static Rational subtraction1(Rational x,Rational y)//static subtraction method
		{
			double newd=x.denom*y.denom;
			double num1=x.numer*y.denom;
			double num2=y.numer*x.denom;
			double newnum=num1-num2;
			return new Rational(newnum,newd);
		}
		public Rational multiplication(Rational x)//multiplication method
		{
			double num=x.getNumer()*this.getNumer();
			double den=x.getDenom()*this.getDenom();
			return new Rational(num,den);
		}
		public static Rational multiplication1(Rational x, Rational y)//static multiplication method
		{
			double num=y.getNumer()*x.getNumer();
			double den=y.getDenom()*x.getDenom();
			return new Rational(num,den);
		}
		public Rational division(Rational x)//division method
		{
			return this.multiplication(x.recip());			
		}
		public static Rational division1(Rational x, Rational y)//static division method
		{
			return y.multiplication(x.recip());
		}
		public String toString()//to string method
		{
			if (denom==0)
			{
				return ("Incorrect, zero cannot be denominator");
			}
		else if (denom==1)
			{
				return numer+"";
			}
			else
			{
				return numer+"/"+denom;
			}
		}	
}