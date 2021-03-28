package com.aws.s3.client;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
class tempTest {

    private AmazonS3Client client = null;

    @Value("${s3.bucketName}")
    private String bucketName;

    @Value("${s3.accessKey}")
    private String accessKey;

    @Value("${s3.secretKey}")
    private String secretKey;

    @Before
    public void initializeAmazon() {
        System.out.println("Start : initializeAmazon");
        AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
        this.client = new AmazonS3Client(credentials);
        System.out.println("Start : initializeAmazon");
    }

    @After
    public void shutDown() {
        System.out.println("Start : shutDown");
        if (this.client != null) {
            this.client.shutdown();
            this.client = null;
        }
        System.out.println("Start : shutDown");
    }

    @Test
    public void helpCheck() {
        System.out.println("Start : helpCheck");
        assertEquals("x", "x");
        System.out.println("Endart : helpCheck");
    }

//    @Test
//    public void checkBucket(){
//        assertTrue(this.client.doesBucketExist(bucketName));
//    }
}
