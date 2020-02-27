package rxjava;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class Observable9 {
public static void main(String[] args) {
	
//	A ConnectableObservable resembles an ordinary Observable, except that it doesn’t begin emitting items when it is subscribed to, 
//	but only when the connect operator is applied to it.
	
	ConnectableObservable<String> items =
	        Observable.just("Alpha","Beta","Gamma","Delta","Epsilon").publish();

	items.subscribe(s -> System.out.println(s));

	items.map(s -> s.length()).subscribe(i -> System.out.println(i));

	items.connect();
}
}
