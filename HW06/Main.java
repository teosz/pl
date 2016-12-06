class Main {
	public static void main(String args[]) {
		Portfolio p=new Portfolio();
		Company c1=new Company("Ubisoft");
		Share s1=new Share(1200,c1);
		Share s2=new Share(500,c1);
		Share s3=new Share(700,c1);
		Company c2=new Company("Apple");
		Share s4=new Share(800,c2);
		Share s5=new Share(900,c2);
		Share s6=new Share(100,c2);
		p.addShare(s1); p.addShare(s2); p.addShare(s3); p.addShare(s4);
		p.addShare(s5); p.addShare(s6);
		System.out.println(p.computeSum()); //4200.0
	}
}

class Share {
	private double value;
	private Company company;
	public Share(double value, Company company) {
		this.value = value;
		this.company = company;
	}
	public double getValue() {
		return this.value;
	}

}

class Portfolio {
	private Share shares[];
	private int noShares=0;
	public Portfolio() {
		shares = new Share[100];
	}
	public void addShare(Share s) {
		shares[noShares] = s;
		noShares++;
	}
	public int computeSum() {
		int sum=0;
		for(int i=0; i<noShares;i++)
		{
			sum+=shares[i].getValue();
		}
		return sum;
	}
}

class Company {
	private String name;
	public Company(String name) {
		this.name = name;
	}
}
