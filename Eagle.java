public abstract class Eagle
{												// Abstract Factory Design
	public static Eagle getEagle(String et)
	{
		if (et.equals("G"))
			return new GoldenEagle();
		if (et.equals("S"))
			return new SerpentEagle();
		else
			return new MountainEagle();
	}
	
	void fly()
	{
		System.out.println("Eagle is flying now");
	}
	
	abstract void hunt();
}

class GoldenEagle extends Eagle
{
	void hunt()
	{
		System.out.println("GoldenEagle is hunting now");
	}
}

class SerpentEagle extends Eagle
{
	void hunt()
	{
		System.out.println("SerpentEagle is hunting now");
	}
}
class MountainEagle extends Eagle
{
	void hunt()
	{
		System.out.println("MountainEagle is hunting now");
	}
}

class TestEagle
{
	public static void main(String[] args)
	{
		Eagle e = Eagle.getEagle(args[0]);
		e.fly();
		e.hunt();
	}
}