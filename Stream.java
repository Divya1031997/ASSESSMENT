import java.util.*; 
import java.util.stream.*; 
  
class Stream
{ 
  public static void main(String args[]) 
  { 
  
    
    List<Integer> number = Arrays.asList(2,3,4,5); 


     Collection<String> collection = Arrays.asList("a", "b", "c");   

     System.out.println(collection); 	  
   
    List<Integer> square = number.stream().map(x -> x*x). 
                           collect(Collectors.toList()); 
    System.out.println(square); 
  

    List<String> names = 
                Arrays.asList("ssss","cccc","vvvv"); 
  	 System.out.println("Range"); 
 
	 IntStream stream = IntStream.range(6, 10); 
	stream.forEach(System.out::println); 

	 System.out.println("Range Closed"); 
	 IntStream s = IntStream.rangeClosed(6, 10); 
	s.forEach(System.out::println); 

        System.out.println("Random");
	Random random = new Random();
	DoubleStream doubleStream = random.doubles(3);
	doubleStream.forEach(System.out::println);

	IntStream streamOfChars = "abc".chars();
	 streamOfChars.forEach(System.out::println); 


	System.out.println("Sum of elements:");

	IntStream p = IntStream.of(2, 4, 6, -2, -4); 
	int sumOfElements = p.sum(); 
	 System.out.println(sumOfElements);

	 System.out.println("Filter method");
	  int Elements = IntStream.range(2, 10)  .filter(num -> num % 3 == 0) .sum(); 
	 System.out.println(Elements);
              



  } 
} 