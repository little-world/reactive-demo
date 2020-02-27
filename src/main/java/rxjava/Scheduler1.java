package rxjava;

import io.reactivex.Observable;

public class Scheduler1 {

	public static void main(String[] args) {

	    Observable<String> source = Observable.just("Alpha","Beta","Gamma");

	    Observable<Integer> lengths = source.map(String::length);

	    lengths.subscribe(l -> System.out.println( + l + 
	        " : " + Thread.currentThread().getName()));
	}
}
