package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.ProductlistBO;
import com.nt.dao.ProductlistDAO;
import com.nt.dto.ProductlistDTO;
public class ProductlistServiceImpl implements ProductlistService {
	private ProductlistDAO dao;

	public ProductlistServiceImpl(ProductlistDAO dao) {
		this.dao = dao;
	}
	@Override
	public List<ProductlistDTO> fetchAllProductlist() {
			List<ProductlistDTO> listDTO=new ArrayList();
			List<ProductlistBO> listBO=null;
			//use DAO
			listBO=dao.getAllProductlist();
			//Conv listBO to listDTO
			listBO.forEach(bo->{
				ProductlistDTO dto=new ProductlistDTO();
				BeanUtils.copyProperties(bo, dto);
				listDTO.add(dto);
			});
			return listDTO;
		}
	}
