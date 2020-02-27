package rxjava;

import io.reactivex.Observable;

public class Observable0 {
	
	public static void main(String[] args) {
		
		System.out.println("- 1 -");
		Observable<Integer> myObserver = Observable.create(subscriber -> {
		        try {
		        	System.out.println("- 2 -");
		            for (int i = 0; i < 10; i++)
		               subscriber.onNext(i); 
		            System.out.println("- 3 -");
		            // Pass on the data to subscriber
		            subscriber.onComplete();     // Signal about the completion subscriber
		        } catch (Exception e) {
		            subscriber.onError(e);        // Signal about the error to subscriber
		        }
		    
		});
		
		System.out.println("- 4 -");
		myObserver.subscribe(
				v -> System.out.println(v),
				e -> System.out.println(e),
				() -> System.out.println("complete")
		);
		System.out.println("- 5 -");
	}

}
