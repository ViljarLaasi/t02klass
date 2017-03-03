public class Lenses{
	public static void main(String[] args){
	Lens[] l=new Lens[7];
	l[0]=new Lens(100, 90, 0.252);
	l[1]=new Lens(85, 50, 0.252);
	l[2]=new Lens(50,90, 0.252);
	l[3]=new Lens(110,85, 0.252);
	l[4]=new Lens(50, 110, 0.252);
	l[5]=new Lens(50,95, 0.252);
	l[6]=new Lens(85,90, 0.252);
	System.out.println(min_coefficient(l));
	System.out.println(min_coefficient(l).distance_camera());
	}
	public static Lens min_coefficient(Lens[] a){
		Lens min=a[0];
		for(int i=1; i<a.length; i++ ){
				if(a[i].distance_coefficient()<min.distance_coefficient()){
					min=a[i];
				}
		}
		return min;
	}
	
//[viljar@greeny k2]$ java Lenses
//(85.0,50.0,0.252)
//21.42

	
	
	
}