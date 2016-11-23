package LAB06;
import java.util.ArrayList;
class Room {
	public ArrayList<Bulb> bulbs = new ArrayList<Bulb>();
	public void addBulb(Bulb bulb) {
		this.bulbs.add(bulb);
	}
	public void turnOnBulbs() {
		this.bulbs.forEach((bulb)->bulb.turnOn());
	}
	public void turnOffBulbs() {
		this.bulbs.forEach((bulb)->bulb.turnOff());
	}


}

