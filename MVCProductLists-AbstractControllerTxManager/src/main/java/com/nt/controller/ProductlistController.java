package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.ProductlistDTO;
import com.nt.service.ProductlistService;

public class ProductlistController extends AbstractController {
	private ProductlistService service;

	public ProductlistController(ProductlistService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ProductlistDTO> listDTO=null;
		//using service
		listDTO=service.fetchAllProductlist();
		//retuning mav object
		return new ModelAndView("result","listprod", listDTO);
	}

}
