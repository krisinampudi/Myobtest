package com.myob.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static io.restassured.RestAssured.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyobTests {

	@Test
	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
	        
	    given().
	    when().
	        get("http://localhost:8080/response").
	    then().
	    assertThat().
        statusCode(200);
	}

}
