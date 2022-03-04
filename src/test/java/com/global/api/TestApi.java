package com.global.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.global.UITests.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApi{

  @BeforeClass
    public static void beforeClass() {
      baseURI = ConfigurationReader.get("api_url");
  }

        @Test
        public void Test1(){



        }


    }
