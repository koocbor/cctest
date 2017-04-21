package koocbor.org.cctest.models;

import com.github.javafaker.Faker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by robcook on 4/20/17.
 */
public class TestModelTest {

    private String randomString;

    @Before
    public void setUp() {
        Faker faker = new Faker();
        randomString = faker.lorem().characters(10);
    }

    @Test
    public void testValue() throws Exception {

        TestModel model = new TestModel();
        assertNotNull(model);

        model.setValue(randomString);

        String outValue = model.getValue();
        assertEquals(randomString, outValue);

    }

}