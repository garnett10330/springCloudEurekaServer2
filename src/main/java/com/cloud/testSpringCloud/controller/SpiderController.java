package com.cloud.testSpringCloud.controller;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/spider")
public class SpiderController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(SpiderController.class);

	@RequestMapping("/spiderPttMacShop")
	public String spiderPttMacShop(String searchCondition) {
		
		String returnData = "true";
		
		return returnData;
	}


}