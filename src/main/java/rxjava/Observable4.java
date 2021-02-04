package rxjava;


import io.reactivex.rxjava3.core.Observable;

public class Observable4 {
public static void main(String[] args) {
	Observable<String> concatenatedSets =
	        Observable.just("1/5/8", "1/9/11/58/16/", "9/15/56/49/21");

	concatenatedSets
			.flatMap(s -> Observable.fromArray(s.split("/")))
	        .map(s -> Integer.valueOf(s))
	        .subscribe(i -> System.out.println(i));
}
}
