package rxjava;


import io.reactivex.rxjava3.core.Observable;

public class Observable11 {

	public static void main(String[] args) {

		Observable.range(0, 10)
		  .groupBy(i -> 0 == (i % 2) ? "EVEN" : "ODD")
		  .subscribe(group ->
		     group.subscribe((number) -> {
		        if (group.getKey().toString().equals("EVEN")) {
		            System.out.println("even " + number);
		        } else {
		            System.out.println("odd  " + number);
		        }
		    })
		  );
	}

}
