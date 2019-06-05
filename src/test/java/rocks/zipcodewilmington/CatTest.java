package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)

    @Test
    public void setNameTest() {

        String expected = "lulu";
        Cat myCat = new Cat(null,null,null);
        myCat.setName(expected);
        String actual = myCat.getName();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void setSpeakTest() {
        String expected = "meow!";
        Cat myCat = new Cat(null,null,null);
        String actual = myCat.speak();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void setEatTest() {

        // Given (a cat that eats)
        Cat cat = new Cat(null, null, null);
        Food catFood = new Food();
        int givenNumberOfMealsEaten = cat.getNumberOfMealsEaten();


        // When(the cat eats)
        cat.eat(catFood);
        int retrieveNumberOfMealsEaten = cat.getNumberOfMealsEaten();


        // Then (we expect the cat to eat food)
        Assert.assertEquals(givenNumberOfMealsEaten + 1, retrieveNumberOfMealsEaten);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest(){
        // Given (a cat that has an ID)
        int givenId = 2468;
        Cat cat = new Cat(null, null, givenId);


        // When(we retrieve the ID)
        int retrieveCatId = cat.getId();


        // Then (we expect to get the ID we set for the cat)
        Assert.assertEquals( givenId , retrieveCatId);
    }

// TODO - Create test to check Animal inheritance; google search `java instanceof keyword`







    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`



}
