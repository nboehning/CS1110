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
	
	// Increases the volume if it's less than the maximum volume
	void IncreaseVolume()
	{
		if(curVolume < maxVolume)
			curVolume++;
	}
	
	// Decreases the volume if it's less than the min volume
	void DecreaseVolume()
	{
		if(curVolume > 0)
			curVolume--;
	}
	
	// Returns the brand of the stereo
	String GetBrand()
	{
		return brand;
	}
	
	// Toggles the stereos power on or off
	void TogglePower()
	{
		isOn = !isOn;
	}
}
