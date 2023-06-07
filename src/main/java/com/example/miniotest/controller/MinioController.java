package com.example.miniotest.controller;

import com.example.miniotest.dto.MinioDto;
import com.example.miniotest.service.MinioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objects")
public class MinioController {

    private final MinioService minioSer;

    public MinioController(MinioService minioSer) {
        this.minioSer = minioSer;
    }

    @PostMapping()
    public void postObject(@RequestBody MinioDto dto) {
        minioSer.putObject(dto);
    }

}