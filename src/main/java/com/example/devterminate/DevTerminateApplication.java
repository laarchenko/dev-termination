package com.example.devterminate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DevTerminateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevTerminateApplication.class, args);
		List<byte[]> list = new ArrayList<>();
		while (true) {
			list.add(new byte[1024 * 1024]); // Allocate 1 MB memory
			byte[] array = new byte[Integer.MAX_VALUE];
			list.add(array);
		}
	}

}
