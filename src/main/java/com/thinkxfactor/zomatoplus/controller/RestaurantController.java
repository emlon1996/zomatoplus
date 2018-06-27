

package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private ItemRepository ItemRepository;
	
	@PostMapping("/create")
	public Restaurant restaurantCreate(@RequestBody Restaurant R ) {
		Restaurant persistedRestaurant=restaurantRepository.save(R);
		return persistedRestaurant;
		
	}
	
	@GetMapping("/getAll")
	public List<Restaurant> getAll() {
		List<Restaurant> listofRestaurant=restaurantRepository.findAll();
		return listofRestaurant;
	}
	/*@GetMapping("/getall")
	public List<Restaurant> RestaurantList() {
		List<Restaurant> R = new ArrayList<>();
		Restaurant R1,R2,R3;
		R1 = new Restaurant("K2","KOLAGHAT",4,"001","EAD@CDDCDC");
		R2 = new Restaurant("WANLI","BALLYGAUNGE",5,"002","wanli@gmail");
		R3 = new Restaurant("Zeeshan","DP",4,"003","vgjvv");
		R.add(R1);
		R.add(R2);
		R.add(R3);
		return R;
		
	}*/
	@PostMapping("/additems")
	public Item itemCreate(@RequestBody Item I ) {
		Item persistedItem=ItemRepository.save(I);
		return persistedItem;
		
	}
}
