package rxjava;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class Scheduler2 {

	public static void main(String[] args) throws InterruptedException {

	    Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");

	    Observable<Integer> lengths = source
	            .subscribeOn(Schedulers.computation())
	            .map(String::length);

	    lengths.subscribe(sum -> System.out.println( + sum +
	            " : " + Thread.currentThread().getName()));
	    
	    
	    Thread.sleep(2000);
	}
}
