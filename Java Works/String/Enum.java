package String;

public enum Enum {
	SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAT(4), FRIDAY(5), SATURDAY(6);

	private int dayIndex;

	Enum(int name) {
		this.dayIndex = name;
	}

	public static void main(String[] args) {
		System.out.println(Enum.MONDAY.getdayIndex());
		System.out.println(Enum.FRIDAY);
	}

	public int getdayIndex() {
		return dayIndex;
	}
}
