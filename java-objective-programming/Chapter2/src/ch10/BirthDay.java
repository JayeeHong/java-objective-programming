package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {

		boolean isLeapYear = false;
		
		if(day < 1 || day > 31) {
			isValid = false;
		} else {
			if(year != 0) {
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
				
				
				if(isLeapYear) {
					if(month != 0) {
						
						if(month == 2) {
							if(isLeapYear) {
								if(day > 29) {
									isValid = false;
								} else {
									isValid = true;
									this.day = day;
								}
							} else {
								if(day > 28) {
									isValid = false;
								} else {
									isValid = true;
									this.day = day;
								}
							}
						} 
					} else {
						isValid = false;
					}
				} else {
					isValid = false;
				}
				
			} else {
				isValid = false;
			}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}
