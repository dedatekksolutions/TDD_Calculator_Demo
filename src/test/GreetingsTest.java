package test;

import org.junit.Assert;
import org.junit.Test;
import main.Greetings;


//Create Greetings class which has a single method sayHello which returns 'Hello World'
public class GreetingsTest {
    
@Test
public void shouldReturnAnInstanceOfGreetings(){
    Greetings greetings = new Greetings();
    Assert.assertNotNull(greetings);
   }
@Test
public void shouldReturnHelloWOrldWhenSayHelloIsCalled(){
    Greetings greetings = new Greetings();
    String result = greetings.sayHello();
    Assert.assertEquals("Hello World", result);
}



}
