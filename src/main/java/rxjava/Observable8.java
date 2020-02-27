package rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Observable8 {
	public static void main(String[] args) throws InterruptedException {
		 Observable.interval(1, TimeUnit.SECONDS)
		.map(l -> l * 1000)
		.subscribe(l -> System.out.println(l));

		Thread.sleep(10000);
	}
}
