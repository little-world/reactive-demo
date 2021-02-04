package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;



public class Observable7 {
public static void main(String[] args) {
	List<String> words = Arrays.asList("the", "quick", "brown", "fox", "jumpes", "over", "the", "lazy", "dog");
	Observable.fromIterable(words)
	 .flatMap(word -> Observable.fromArray(word.split("")))
	 .distinct()
	 .sorted()
	 .zipWith(Observable.range(1, Integer.MAX_VALUE),
	   (string, count) -> String.format("%2d. %s", count, string))
	 .subscribe(System.out::println);
}
}
