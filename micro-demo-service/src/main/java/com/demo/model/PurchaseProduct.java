/**
 * 
 */
package com.demo.model;

/**
 * @desc:
 * @name:Product
 * @author:zhaosong
 * @date:2021年9月29日 下午4:42:43
 * @version:1.0
 */
public class PurchaseProduct {
	private String productName;
	private String supplier;
	private String productImg;
	private String region;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "PurchaseProduct [productName=" + productName + ", supplier=" + supplier + ", productImg=" + productImg
				+ ", region=" + region + "]";
	}
	 

	 

}
