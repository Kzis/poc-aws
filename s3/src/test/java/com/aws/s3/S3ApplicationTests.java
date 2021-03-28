package com.aws.s3;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import io.findify.s3mock.S3Mock;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import static org.junit.Assert.*;

@SpringBootTest
class S3ApplicationTests {

	@Test
	public void helpCheck() {
		assertEquals("x", "x");
	}

}
