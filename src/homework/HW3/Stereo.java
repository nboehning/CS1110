package homework.HW3;

class Stereo 
{
	String brand;
	int curVolume;
	int maxVolume;
	Boolean isOn;
	
	/* Constructors */
	
	// Generic constructor with max volume of 100, and a generic brand
	Stereo()
	{
		maxVolume = 100;
		curVolume = 25;
		brand = "Generic";
		isOn = false;
	}
	
	// Constructor where max volume and brand are set.
	Stereo(int newMax, String newBrand)
	{
		maxVolume = newMax;
		curVolume = Math.floorDiv(maxVolume, 4);
		brand = newBrand;
		isOn = false;
	}
	
	/* Methods */
	
	void IncreaseVolume()
	{
		if(curVolume < maxVolume)
			curVolume++;
	}
	
	void DecreaseVolume()
	{
		if(curVolume > 0)
			curVolume--;
	}
	
	String GetBrand()
	{
		return brand;
	}
	
	void TogglePower()
	{
		isOn = !isOn;
	}
}
