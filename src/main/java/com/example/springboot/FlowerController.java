package com.example.springboot;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

	private FLowerService fLowerService;

	@Autowired
	public FlowerController(FLowerService fLowerService){
		this.fLowerService = fLowerService;
	}

	@PostMapping
	public void addFlower(@RequestBody Flower flower){
		fLowerService.addFlower(flower);
	}
	@GetMapping
	public String index() {
		return fLowerService.getFlowers().toString();

	}

}
