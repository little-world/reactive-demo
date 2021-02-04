package rxjava;


import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Scheduler3 {

	 public static void main(String[] args) throws InterruptedException {

		    Observable<Integer> source = Observable.range(1,50);

		    source.flatMap(val -> Observable.just(val))
		            .doOnNext(i -> System.out.println("Emitting " + i
		                    + " on thread " + Thread.currentThread().getName()))
		           
		            .map(i -> i * 10)
		            .observeOn(Schedulers.computation())
		            .subscribe(i -> System.out.println("Received " + i + " on thread "
		                    + Thread.currentThread().getName()));

		    Thread.sleep(3000);
		}

}
