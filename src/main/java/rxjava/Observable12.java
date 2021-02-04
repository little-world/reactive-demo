package rxjava;


import io.reactivex.rxjava3.core.Observable;

public class Observable12 {
public static void main(String[] args) {
	
//	Using operation allows us to associate resources, 
//	such as a JDBC database connection, 
//	a network connection, 
//	or open files to our observables.
	
	String[] result = {""};
	Observable<Character> values = Observable.using(
	  () -> "MyResource",
	  r -> {
	      return Observable.create(o -> {
	          for (Character c : r.toCharArray()) {
	              o.onNext(c);
	          }
	          o.onComplete();
	      });
	  },
	  r -> System.out.println("Disposed: " + r)
	);
	values.subscribe(
	  v -> result[0] += v,
	  e -> result[0] += e
	);
	System.out.println("result: " + result[0]);
}
}
