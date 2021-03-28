package com.aws.s3.client;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.aws.s3.Utils.AmazonClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@RunWith(JUnit4.class)
public class AmazonClientTest {

    @Autowired
    AmazonClient amazonClient;

//    @Before
//    public void init() {
//        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
//        this.client = new AmazonS3Client(credentials);
//    }


    @Test
    public void testCase1() {
        System.out.println("testCase1");
        amazonClient.
    }

//    @After
//    public void shutDown() {
//        System.out.println("Start : shutDown");
//        if (this.client != null) {
//            this.client.shutdown();
//            this.client = null;
//        }
//        System.out.println("Start : shutDown");
//    }
}
