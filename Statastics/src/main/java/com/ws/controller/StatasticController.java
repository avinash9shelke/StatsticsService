package com.ws.controller;


import javax.annotation.Resource;

import net.webservicex.ArrayOfDouble;
import net.webservicex.GetStatistics;
import net.webservicex.ObjectFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ws.client.core.WebServiceTemplate;

@Controller
public class StatasticController
{

		@Resource(name="webServiceTemplate")
		private WebServiceTemplate webServiceTemplate;
		
		@RequestMapping(value = "/index.html", method = RequestMethod.GET)
		public ModelAndView callServicePage()
		{
			ModelAndView view = new ModelAndView("statstics");
			return view;
		}
		
		@RequestMapping(value = "/statsticsview.html" ,method=RequestMethod.GET)
		public String getCurrency(Model model,@RequestParam("x")String x,@RequestParam("y")String y)
		{
		   ArrayOfDouble list=new ArrayOfDouble();
		   list.getDouble().add(0,Double.parseDouble(x));
		   list.getDouble().add(1,Double.parseDouble(y));
		   GetStatistics stat=new ObjectFactory().createGetStatistics();
		   stat.setX(list);
		   net.webservicex.GetStatisticsResponse response=(net.webservicex.GetStatisticsResponse)webServiceTemplate.marshalSendAndReceive(stat);
		  
		   double average=response.getAverage();
		   double kurtosis=response.getKurtosis();
		   double skewness=response.getSkewness();
		   double sd=response.getStandardDeviation();
		   double sums=response.getSums();
		  
		   model.addAttribute("average", average);
		   model.addAttribute("kurtosis", kurtosis);
		   model.addAttribute("skewness", skewness);
		   model.addAttribute("sd", sd);
		   model.addAttribute("sums", sums);
			    
		   
		   return "statstics"; 
		}
}
