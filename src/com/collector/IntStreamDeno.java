package com.collector;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class IntStreamDeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<List<Integer>> supplier=ArrayList::new;
		ObjIntConsumer<List<Integer>> accumulator=Collection::add;
		BiConsumer<List<Integer>,List<Integer>> combiner=Collection::addAll;
		
List<Integer> collect= IntStream.range(0,10).collect(supplier, accumulator, combiner);
	System.out.println(collect);
	}

}
