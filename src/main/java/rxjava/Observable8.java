package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;


public class Observable8 {
	public static void main(String[] args) throws InterruptedException {
		 Observable.interval(1, TimeUnit.SECONDS)
		.map(l -> l * 1000)
		.subscribe(l -> System.out.println(l));

		Thread.sleep(10000);
	}
}
