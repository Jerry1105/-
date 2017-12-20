package fwj.Async;

import org.springframework.stereotype.Component;

import fwj.entity.User;

/*
fuwenjie



*/
@Component
public class AsyncTest {

	public void show1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("show1:------" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

	public User show2() {
		return new User();
	}

	public void show3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("show3:------" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

	public void show4() {
		for (int i = 0; i < 10; i++) {
			System.out.println("show4:------" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
