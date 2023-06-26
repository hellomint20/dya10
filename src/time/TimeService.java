package time;

import java.text.SimpleDateFormat;

public class TimeService {
	private TimeDTO dto;
	SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	
	public TimeService() {
		dto = new TimeDTO();
	}
	
	public void setStartTime() {
		dto.setStart(System.currentTimeMillis());
		System.out.println("시작 시간 설정 완료");
	}
	public String getStartTime() {
		String date = simple.format(dto.getStart());
		return date;
	}
	public void setEndTime() {
		dto.setEnd(System.currentTimeMillis());
		System.out.println("종료 시간 설정 완료");
		dto.setTotal((dto.getEnd()-dto.getStart())/1000);
	}
	public String getEndTime() {
		String date = simple.format(dto.getEnd());
		return date;
	}
	public String getResultTime() {
		//System.out.println(dto.getTotal()+" 초 사용");
		long total = dto.getTotal();
		long m = total / 60;
		long s = total % 60;
		//System.out.println(m+"분 " +s+"초 사용");
		return m+"분 " +s+"초 사용";
	}

}
