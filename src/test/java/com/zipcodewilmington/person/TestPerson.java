package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Double expected = 160.0;

        // When
        person.setWeight(expected);

        // Then
        Double actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Double expected = 6.2;

        // When
        person.setHeight(expected);

        // Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        // Given
        Person person = new Person();
        Double expected = 6.2;

        // When
        person.setShoeSize(expected);

        // Then
        Double actual = person.getShoeSize();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetArmLength() {
        // Given
        Person person = new Person();
        Double expected = 6.2;

        // When
        person.setArmLength(expected);

        // Then
        Double actual = person.getArmLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        // Then
        Assert.assertEquals(expected, actual);
    }


}
