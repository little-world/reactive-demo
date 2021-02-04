package rxjava;



import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

public class Observable1 {
public static void main(String[] args) {
	Observable<String> howdy = Observable.just("hello");
	
	
	
	Consumer consumer = System.out::println;
	howdy.subscribe(consumer);
}
}
