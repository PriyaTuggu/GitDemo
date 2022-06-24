package Java;

import demo.TrafficInterface;

public class WalkingClass  implements TrafficInterface ,TrainInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficInterface Tri =new WalkingClass();
		Tri.RedSysmbol();
		Tri.YelloInterfact();
		Tri.GreenSymbol();
		TrainInterface Trai = new WalkingClass();
		Trai.TrainSymbol();
		WalkingClass wc = new WalkingClass();
		wc.WalkingSymbol();
		
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("This is Train Symbol");
	}

	@Override
	public void RedSysmbol() {
		// TODO Auto-generated method stub
		System.out.println("This is Red Symbol");
	}

	@Override
	public void YelloInterfact() {
		// TODO Auto-generated method stub
		System.out.println("This is Yellow Symbol");
	}

	@Override
	public void GreenSymbol() {
		// TODO Auto-generated method stub
		System.out.println("This is Green Symbol");
	}
	
	public void WalkingSymbol() {
		// TODO Auto-generated method stub
		System.out.println("This is Walking Symbol");
	}


}
