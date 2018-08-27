public class FSApp
{
	public static void main(String[] args)
	{
		if (args[0]!=null)
		{
			Plane[] planes = new Plane[3];
			planes[0] = new Cargo(Integer.parseInt(args[0]),2000);
			planes[1] = new Fighter(Integer.parseInt(args[1]),3000);
			planes[2] = new Passenger(Integer.parseInt(args[2]),4000);
			
			System.out.println("Enhanced for loop");
			
			for(Plane p : planes)
				System.out.println(p);
			System.out.println("");
			
			System.out.println("Normal for loop");
			
			for(int i = 0; i<planes.length;i++)
			{
				System.out.println(planes[i]);
				if (planes[i] instanceof Fighter)
					{
						Fighter f = (Fighter)planes[i];
						f.fireMissile();
					}
			}
		}
	}
}

class Plane
{
	int weight = 1000;
	int fuel;
	void fly()
	{
		System.out.println("Plane is flying");
	}
	
	void load(int weight)
	{
		this.weight = this.weight+weight;
	}
	void takeOff()
	{
		if (weight<=5000)
		{
			System.out.println("Plane takeOff Successfully");
			fly();
			stop();
		}
		else
			{
				System.out.println("Plane is overloaded Max weight = 5000");
			}
	}
	
	void start()
	{
		System.out.println("Plane is started");
	}
	void stop()
	{
		System.out.println("Plane is stopped");
	}
	
	public Plane()
	{
	
	}
	
	public Plane(int weight,int fuel)
	{
		this.weight = weight;
		this.fuel = fuel;
	}
	
	public String toString()
	{
		return ("weight = "+this.weight+" fuel = "+this.fuel);
	}
	
	public void fireMissile()
	{
		System.out.println("Fighter Plane firing missiles");
	}
}

class Fighter extends Plane
{
	void takeOff()
	{
		if (weight<=5000)
		{
			System.out.println("Fighter Plane takeOff Successfully");
			fly();
			stop();
		}
		else
			{
				System.out.println("Fighter Plane is overloaded Max weight = 5000");
			}
	}
	
	public Fighter()
	{
	
	}
	
	public Fighter(int weight,int fuel)
	{
		super(weight,fuel);
	}
}

class Cargo extends Plane
{
	public Cargo()
	{
	
	}
	
	public Cargo(int weight,int fuel)
	{
		super(weight,fuel);
	}
}

class Passenger extends Plane
{
	public Passenger()
	{
	
	}
	
	public Passenger(int weight,int fuel)
	{
		super(weight,fuel);
	}
}