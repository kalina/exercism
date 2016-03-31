
public class SpaceAge {
	private double seconds;
	private double EARTH_ORBIT = 31557600;
	private double MERCURY_ORBIT =  0.2408467 * 31557600;
	private double VENUS_ORBIT = 0.61519726 *  31557600;
    private double MARS_ORBIT = 1.8808158 *  31557600;
    private double JUPITER_ORBIT = 11.862615 *  31557600;
    private double SATURN_ORBIT = 29.447498 *  31557600;
    private double URANUS_ORBIT = 84.016846 *  31557600;
    private double NEPTUNE_ORBIT = 164.79132 *  31557600;
	
    public SpaceAge(double seconds){
    	this.seconds = seconds;
    }
    
    public double getSeconds(){
    	return this.seconds;
    }
    
    public double onEarth(){
    	return this.seconds / EARTH_ORBIT;
    }
    public double onMercury(){
    	return this.seconds / MERCURY_ORBIT;
    }
    
    public double onVenus(){
    	return this.seconds / VENUS_ORBIT;
    }
    
    public double onMars(){
    	return this.seconds / MARS_ORBIT;
    }
    
    public double onJupiter(){
    	return this.seconds / JUPITER_ORBIT;
    }
    
    public double onSaturn(){
    	return this.seconds / SATURN_ORBIT;
    }
    
    public double onUranus(){
    	return this.seconds / URANUS_ORBIT;
    }
    public double onNeptune(){
    	return this.seconds / NEPTUNE_ORBIT;
    }
}
