package kr.or.ddit.basic;

// 데몬 쓰레드 연습 ==> 자동 저장하는 쓰레드

public class ThreadTest08 {

	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();

		// 데몬 쓰레드로 설정하기 ==> 반드시 start()메서드 호출 전에 설정해야함.
		System.out.println("데몬 설정 전 : " + auto.isDaemon());
		auto.setDaemon(true);
		auto.start();
		System.out.println("데몬 설정 후 : " + auto.isDaemon());

		try {
			for (int i = 1; i <= 20; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {

		}

		System.out.println("main쓰레드 종료.");
	}
}

// 자동 저장하는 쓰레드 클래스 작성
class AutoSaveThread extends Thread {
	// 작업 내용을 저장하는 메서드
	public void save() {
		System.out.println("작업 내용을 저장합니다.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			save();
		}
	}
}