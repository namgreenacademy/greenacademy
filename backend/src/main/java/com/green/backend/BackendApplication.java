package com.green.backend;

import com.green.backend.service.Inhinh;
import com.green.backend.service.TinhThueService;
import com.green.backend.service.TuyenSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class BackendApplication {

    @Autowired
    private static TuyenSinhService tuyenSinhService ;
    @Autowired
    private static TinhThueService tinhThueService ;
    @Autowired
    private static Inhinh inhinh;

    public static void main(String[] args) {
//          SpringApplication.run(BackendApplication.class, args);

//          tuyenSinhService.tuyensinh();

        inhinh.inhinh() ;

        }
    }


