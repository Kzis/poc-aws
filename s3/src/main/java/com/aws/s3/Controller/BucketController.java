package com.aws.s3.Controller;

import com.aws.s3.Utils.AmazonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/storage/")
public class BucketController {

    private AmazonClient s3client;

    @Autowired
    BucketController(AmazonClient s3Utils) {
        this.s3client = s3Utils;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return this.s3client.uploadFile(file);
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.s3client.deleteFileFromS3Bucket(fileUrl);
    }

}
