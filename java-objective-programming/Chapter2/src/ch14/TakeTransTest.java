package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Thomas", 10000);
		Student studentE = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Taxi taxi1 = new Taxi("잘나간다 운수");
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTaxi(taxi1);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		subwayGreen.showSubwayInfo();
		bus500.showBusInfo();
		taxi1.showTaxiInfo();
		
	}
}
