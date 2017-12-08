package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import database.DestinationInfoDB;

@RestController
public class InfoController {

	private DestinationInfoDB database;
	
	public InfoController()
	{
		database = new DestinationInfoDB();
	}
	
	@RequestMapping(value="/infoController/{city}", method = RequestMethod.GET)
	public String getInfo(@PathVariable String city)
	{
		return database.getInfo(city);
	}
	
	@RequestMapping(value="/info")
	public String getAppInfo()
	{
		return "This app will provide information about a city.";
	}
}
