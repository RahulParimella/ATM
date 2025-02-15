package com.example.ata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ata.dto.DriverDto;



@FeignClient(value = "DRIVER-MICROSERVICES", url = "http://localhost:9191/api/driver" )

public interface DriverClient {

	@GetMapping("/viewdriver/{driverNo}")
	public DriverDto viewDriver(@PathVariable int driverNo);

}
