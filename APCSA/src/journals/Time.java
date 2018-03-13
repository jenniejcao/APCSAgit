package journals;
public class Time {

	public static long hour;
	public static long minute;
	public static long second;
	public static long elapsedTime;
	
	public Time (){
		setTime(System.currentTimeMillis());
	}
	
	public Time (long eTime){
		setTime(eTime);
	}
	
	public Time (long h, long m, long s){
		hour = h;
		minute = m;
		second = s;
		Time thisTime = new Time (hour, minute, second);
	}
	
	public long getHour(){
		return hour;
	}
	
	public long getMinute(){
		return minute;
	}
	
	public long getSecond(){
		return second;
	}
	
	public void setTime(long eTime){
		eTime = eTime/1000;
		if (eTime/3600 > 0){
			hour += eTime/3600;
			eTime = eTime - 3600*hour;
		}
		if (eTime/60 > 0){
			minute += eTime/60;
			eTime = eTime - 60*minute;
		}
		second = eTime;
		if (hour/24 > 0){
			hour = hour % 24;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time(555550000);
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
	}

}