package main.java.ie.murph.java8.functional.programming;

import java.util.stream.Stream;

public class Streams_FilterMapReduce {
	
	public static void main(String[] args){
		Streams_FilterMapReduce streams = new Streams_FilterMapReduce();
		streams.streamBuilderPattern1();
	}

	public void streamBuilderPattern1() {
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		// Print the stream 
		streamBuilder.forEach(s -> System.out.println(s)); 
	}
	
	public void streamBuilderPattern2() {
		Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
		 // Print the stream 
		streamBuilder.forEach(System.out::println); 
	}
	

}
