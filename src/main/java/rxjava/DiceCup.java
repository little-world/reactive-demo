package rxjava;


import java.util.ArrayList;
import java.util.Scanner;

import static io.reactivex.rxjava3.core.Observable.*;
import static java.lang.Math.max;

// werkt alleen in Java15 (Preview)
record Pair(int first, int second) { }

public class DiceCup {
  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner scanner = new Scanner(System.in);

    String values = scanner.nextLine();

    var numbers = just(values)
       .flatMap(vals -> fromArray(vals.split(" ")))
       .map(v -> Integer.parseInt(v));


    var pairs = numbers.zipWith(numbers
       .skip(1), (first, second) -> new Pair(first, second));

    var cartesians = pairs.flatMap(p -> {
         var firstRange = range(1, p.first());
         var secondRange = range(1, p.second());
         var cartesian = firstRange.flatMap((n) -> secondRange.map((l) -> new Pair(n, l)));
         return cartesian;
       }
    );

    var grouped = cartesians.map(p -> p.first() + p.second())
       .groupBy(g -> g)
       .flatMapSingle(groups -> groups.collect(ArrayList<Integer>::new, ArrayList<Integer>::add));

    var max = grouped.reduce(0, (first, second) -> max(first, second.size()));

    var max_pair = grouped.map(ll -> new Pair(ll.get(0), ll.size()));

    var result = max.map(mx ->
       max_pair.filter(g -> mx == g.second())
          .map(pa -> pa.first())
    );

    result.subscribe(a -> a.subscribe(System.out::println));
  }
}
