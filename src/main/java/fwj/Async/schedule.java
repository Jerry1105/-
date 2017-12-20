package fwj.Async;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

/*
fuwenjie



*/
//@Component
public class schedule {

	@Scheduled(fixedRate = 5000)
	public void showtime() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		String format = sdf.format(date);
		System.out.println(format);

	}
}
