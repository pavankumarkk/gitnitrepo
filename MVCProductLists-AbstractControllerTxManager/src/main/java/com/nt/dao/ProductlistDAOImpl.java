package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.nt.bo.ProductlistBO;

public class ProductlistDAOImpl implements ProductlistDAO {
	private static final String GET_ALL_PRODUCTLIST="SELECT  PROD_ID,PROD_NAME,PROD_PRICE,PROD_QTY,PROD_MFD,PROD_EXP FROM PRODUCTLIST1";
	private JdbcTemplate jt;

	public ProductlistDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<ProductlistBO> getAllProductlist() {
	   List<ProductlistBO> listBO=null;
	   listBO=jt.query(GET_ALL_PRODUCTLIST, new ProdRsExtractor());
		return listBO;
    		}
	private class ProdRsExtractor implements ResultSetExtractor<List<ProductlistBO>>{

	@Override
	public List<ProductlistBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<ProductlistBO> listBO=null;
		ProductlistBO bo=null;
		listBO=new ArrayList();
		//copy ResultSet obj rec into listbo 
		while(rs.next()) {
			bo=new ProductlistBO();
			bo.setProdid(rs.getInt(1));
			bo.setProdname(rs.getString(2));
			bo.setProdprice(rs.getFloat(3));
			bo.setProdqty(rs.getFloat(4));
			bo.setProdmfg(rs.getDate(5));
            bo.setProdexp(rs.getDate(6));			
			listBO.add(bo);
		}
		return listBO;
	}
	}
   }
