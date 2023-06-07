package com.example.miniotest.service;

import com.example.miniotest.dto.MinioDto;
import io.minio.MinioClient;
import org.springframework.stereotype.Service;

@Service
public class MinioService {

    public void putObject(MinioDto minioDto) {

        try {

            MinioClient minioClient = new MinioClient(minioDto.getEndpoint(), minioDto.getAccessKey(), minioDto.getSecretKey());
            minioClient.putObject(minioDto.getBucketName(), minioDto.getObjectName(), minioDto.getDownloadPath());
            System.out.println("File downloaded successfully!");

        } catch (Exception e) {

            System.out.println("Error occurred: " + e.getMessage());

        }
    }

}
