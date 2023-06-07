package com.example.miniotest.dto;

import lombok.Data;

@Data
public class MinioDto {

    String endpoint;
    String accessKey;
    String secretKey;
    String bucketName;
    String objectName;
    String downloadPath;

}
