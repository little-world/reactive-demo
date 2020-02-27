package rxjava;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

public class Observable5 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

		Observable.fromIterable(words)
				.zipWith(Observable.range(1, Integer.MAX_VALUE),
				(string, count) -> String.format("%2d. %s", count, string)).subscribe(System.out::println);
	}
}
