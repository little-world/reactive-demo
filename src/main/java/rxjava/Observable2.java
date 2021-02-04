package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;



public class Observable2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");


        Observable.fromIterable(words)
                .filter(x -> x.length() > 3)
                .map(s -> s.toUpperCase())
                .subscribe(System.out::println);
    }
}
