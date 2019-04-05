package ioet.com;

public enum DaysWeek {
	
	MO(0),
	TU(1),
	WE(2),
	TH(3),
	FR(4),
	SA(5),
	SU(6);
	 
	private Integer valueDay;

	public Integer getValueDay() {
		return valueDay;
	}

	private DaysWeek(Integer valueDay) {
	        this.valueDay = valueDay;
	 }
		
}
