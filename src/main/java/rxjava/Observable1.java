package rxjava;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class Observable1 {
public static void main(String[] args) {
	Observable<String> howdy = Observable.just("hello");
	
	
	
	Consumer consumer = System.out::println;
	howdy.subscribe(consumer);
}
}
