package com.nt.bo;

import java.util.Date;


public class ProductlistBO {
	
	private int prodid;
	private String prodname;
	private float prodprice;
	private float prodqty;
	private Date prodmfg;
    private Date prodexp;	
	
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public float getProdprice() {
		return prodprice;
	}
	public void setProdprice(float prodprice) {
		this.prodprice = prodprice;
	}
	public float getProdqty() {
		return prodqty;
	}
	public void setProdqty(float prodqty) {
		this.prodqty = prodqty;
	}
	public Date getProdmfg() {
		return prodmfg;
	}
	public void setProdmfg(Date prodmfg) {
		this.prodmfg = prodmfg;
	}
	public Date getProdexp() {
		return prodexp;
	}
	public void setProdexp(Date prodexp) {
		this.prodexp = prodexp;
	}
	
}
