package kr.or.kosa;

public class AirPlane {
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	public AirPlane(int num, String name) {
		airnum = num;
		airname = name;
		++airtotalcount; // 누적대수
	}
	
	public void airDisplay() {
		System.out.printf("number: %d, name: %s\n", airnum, airname);
	}
	
	public void airPlaneTotalCount() {
		System.out.println(airtotalcount);
	}

}
