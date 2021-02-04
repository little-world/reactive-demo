package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;



public class Observable10 {
	public static void main(String[] args) {
		Observable<Integer> obsList = Observable.just(1,2,3,4,5,6,7,8,9);
		List<Integer> list = obsList.toList().blockingGet();
		
	}
}
