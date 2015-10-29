class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Chick(String type, String sound1, String sound2)
	{
		myType = type;
		int rand = (int)(Math.random()*2);
		if (rand == 0)
			mySound = sound1;
		else if (rand == 1)
			mySound = sound2;
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound()
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}