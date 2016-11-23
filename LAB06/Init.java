package LAB06;

class Init {
	public static void main(String[] args) {	
		Bulb b1 = new Bulb(50, true);
		Bulb b2 = new Bulb(100);
		System.out.println(b1.getPower());
		System.out.println(b1.isTurnedOn());
		b2.turnOn();
		System.out.println(b1.isTurnedOn());
	

	}

}
