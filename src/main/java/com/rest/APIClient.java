package com.rest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="ITEM-SERVICE",url="http://localhost:9097")
public interface APIClient {

	@GetMapping("/getallitems")
	List<ItemDTO> getAllItems();
}
