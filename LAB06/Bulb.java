package LAB06;
class Bulb {
	private int power;
	private boolean isTurnedOn=false;
	public Bulb(int power, boolean isTurnedOn) {
		this.power = power;
		this.isTurnedOn = isTurnedOn;
	}
	public Bulb(int power) {
		this.isTurnedOn = isTurnedOn;
	}
	public int getPower() {
		return this.power;
	}
	public boolean isTurnedOn() {
		return this.isTurnedOn;
	} 
	public void turnOff() {
		this.isTurnedOn = false;
	} 
	public void turnOn() {
		this.isTurnedOn = true;
	} 

}
