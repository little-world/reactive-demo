package rxjava;

import io.reactivex.Observable;

public class Observable3 {
public static void main(String[] args) {
	Observable.just("Hello, world!")
    .map(s -> s + " -Dan")
 
    .map(s -> s.hashCode())
    .map(i -> Integer.toHexString(i))
    .subscribe(s -> System.out.println(s));
}
}
