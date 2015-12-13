package Experiment10;

public class MagazineRack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagazineList rack=new MagazineList();
		rack.add(new Magazine("Time"));
		rack.add(new Magazine("Woodworking Today"));
		rack.add(new Magazine("Communications of the ACM"));
		rack.add(new Magazine("House and Garden"));
		rack.add(new Magazine("Love Me"));
		System.out.println("rack:\n"+rack);
		rack.sort();
		System.out.println("rack after sort:\n"+rack);
		
		MagazineList rack2=new MagazineList();
		rack2.add(new Magazine("Three Body"));
		rack2.add(new Magazine("Given"));
		rack2.add(new Magazine("Roses"));
		rack2.add(new Magazine("Hello World"));
		System.out.println("rack2:\n"+rack2);
		rack2.sort();
		System.out.println("rack2 after sort:\n"+rack2);
		
		rack.mergeSort(rack2);
		System.out.println("rack after merge:\n"+rack);
		
		rack.Reverse();
		System.out.println("rack after Reverse:\n"+rack);
		
	}

}
