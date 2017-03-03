public class Lens{
	double _x; 
	double _y;
	double _z;
	public Lens(double x, double y, double z){
		_x=x; _y=y; _z=z; 
		
	}
	public double distance_coefficient(){
		return _x*_y*_z;
	}
	public double distance_camera(){
		return distance_coefficient()/50;
		
	}
	public String toString(){
		return"("+_x+","+_y+","+_z+")";
	}
	
}