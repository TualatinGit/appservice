package com.springdemo.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springdemo.vo.LinkSetVO;

@Controller
@RequestMapping({"/link/"})
public class LinkSetController
{
  @RequestMapping({"getLastestVersion"})
  @ResponseBody
  public Object getLink(HttpServletRequest request, HttpServletResponse response)
  {
	String key = "741258";
	LinkSetVO linkSetVO = new LinkSetVO();
	try {
		String  usercode = request.getParameter("usercode");
		String  time = request.getParameter("time");
		String  sign = request.getParameter("sign");
		String  label = request.getParameter("label");
		MessageDigest md5=MessageDigest.getInstance("MD5");
		String resultCode = "";
		//linkSetVO.setLk("www.baidu.com");
		linkSetVO.setMk("nothing");
		linkSetVO.setStatus("0");
		linkSetVO.setType("1");
		linkSetVO.setVersion("1.0.0");
		//String link = "www.baidu.com";
	} catch (NoSuchAlgorithmException e) {
		linkSetVO.setCode("9999");
	}
    return linkSetVO;
  }
}
