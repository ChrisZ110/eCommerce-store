/**
 * 
 */
package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Product;
import com.demo.model.PurchaseProduct;

/**
 * @desc:
 * @name:ProductController
 * @author:zhaosong
 * @date:2021年9月29日 下午3:43:01
 * @version:1.0
 */
@Controller

public class ProductController {
	@RequestMapping("/index")
	public String index(ModelMap model) {
		List<String> strings = new ArrayList<String>();
		List<Product> productList = initData();
		
		strings.add("mobile phone");
		strings.add("李四");
		strings.add("王五");
		model.addAttribute("productList", productList);

		model.addAttribute("name", "E-commerce");

		return "/home/index";

	}

	/*@RequestMapping("/detail")
	public String detail(ModelMap model, String productName, String supplier, String productImg) {
		// ModelMap model=new ModelMap();
		PurchaseProduct userBuyproduct = new PurchaseProduct();
		userBuyproduct.setProductName(productName);
		userBuyproduct.setSupplier(supplier);
		userBuyproduct.setProductImg(productImg);
 
		List<String>regionList=new ArrayList<String>();
		regionList.add("Singapore");
		regionList.add("KL");
		regionList.add("KL3");
		model.addAttribute("product", userBuyproduct);
		model.addAttribute("name", "E-commerce");
		model.addAttribute("regionList", regionList);

		return "/detail/index";

	}*/
	@RequestMapping("/detail")
	public String detail( ModelMap model,String productName) {
		List<Product> productList = initData();
		List<String>regionList=new ArrayList<String>();
		regionList.add("Singapore");
		regionList.add("KL");
		//regionList.add("KL3");
		for(Product tmp:productList) {
			if(tmp.getProductName().equals(productName)) {
				model.addAttribute("product", tmp);
			}
		}
		
		model.addAttribute("name", "E-commerce");
		model.addAttribute("regionList", regionList);

		return "/detail/index"; 
 
		//return "";

	}
	@RequestMapping("/purchase")
	public String purchase(ModelMap model,PurchaseProduct userBuyproduct) {
		// ModelMap model=new ModelMap();
		//PurchaseProduct userBuyproduct = new PurchaseProduct();
		/*
		 * userBuyproduct.setProductName(productName);
		 * userBuyproduct.setSupplier(supplier);
		 * userBuyproduct.setProductImg(productImg); userBuyproduct.setRegion(region);
		 */
		List<Product> productList = initData();
		for(Product tmp:productList) {
			if(tmp.getProductName().equals(userBuyproduct.getProductName())) {
				userBuyproduct.setProductImg(tmp.getProductImg());
				userBuyproduct.setProductName(tmp.getProductName());
				userBuyproduct.setSupplier(tmp.getSupplier());
			}
		}
 
		 
		model.addAttribute("product", userBuyproduct);
		model.addAttribute("name", "E-commerce");
		 

		return "/purchase/index";

	}
	List<Product> initData(){
		List<Product> productList = new ArrayList<Product>();
		Product productMobileLgComputer = new Product();
		// Lg Mobile
		productMobileLgComputer.setProductName("LG Computer");
		productMobileLgComputer.setSupplier("LG");
		productMobileLgComputer.setProductImg("lgcomputer.jpg");
		productMobileLgComputer.setProductDesc("LG LCD Laptop 13 Full HD (1920x1080) IPS Ultra-Lightweight, Ryzen 7 4700U, 16GB RAM, 256GB SSD, AMD Radeon, 14.5 Hr Battery Life - 2021");
		// Lg Talet
		Product productSamsungTalet = new Product();
		productSamsungTalet.setProductName("Samsung Talet");
		productSamsungTalet.setSupplier("Samsung");
		productSamsungTalet.setProductImg("tablet.jpg");
		productSamsungTalet.setProductDesc("Samsung Tab A7 Lite 8.7 Gray 32GB (SM-T220NZAAXAR)");
		// Lg Computer
		 
		Product productDesktopAsus = new Product();
		productDesktopAsus.setProductName("Asus Desktop");
		productDesktopAsus.setSupplier("Asus");
		productDesktopAsus.setProductImg("asusDesktop.jpg");
		productDesktopAsus.setProductDesc("ASUS ExpertCenter D500SA Small Form Factor Desktop PC, Intel Core i5-10400, 12GB DDR4 RAM, 512GB PCIe SSD, Wi-Fi 6, TPM, Windows 10 Professional, Black, D500SA-AB501");
		Product productMobileSamsung = new Product();
		productMobileSamsung.setProductName("Samsung Mobile");
		productMobileSamsung.setSupplier("Samsung");
		productMobileSamsung.setProductImg("mobilephone.jpg");
		Product productSumsungBatterypack = new Product();
		productSumsungBatterypack.setProductName("Samsung Batterypack");
		productSumsungBatterypack.setSupplier("Samsung");
		productSumsungBatterypack.setProductImg("sumsungBatterypack.jpg");
		productSumsungBatterypack.setProductDesc("Samsung 10,000 mAh USB-C Battery Pack, Silver - EB-P1100CSEGUS");
		
		productList.add(productMobileLgComputer);
		productList.add(productSamsungTalet);
 
		productList.add(productDesktopAsus);
		productList.add(productMobileSamsung);
		productList.add(productSumsungBatterypack);
		return productList;
	}
	

}
