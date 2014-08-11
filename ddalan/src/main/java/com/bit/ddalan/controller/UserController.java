package com.bit.ddalan.controller;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.ddalan.domain.UserVO;
import com.bit.ddalan.gcm.GcmSender;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	@Autowired
	private SqlSession sqlSession;

	
	@RequestMapping(value = "/addUser", method = {RequestMethod.POST, RequestMethod.GET})
	public void addUser(@ModelAttribute UserVO userVO) throws IOException {
		System.out.println("»£√‚µ ");
		System.out.println(userVO);
		
		sqlSession.insert("UserControlMapper.addUser", userVO);
		System.out.println("∞°¿‘ øœ∑·");
		
	}
	
	
	@RequestMapping(value = "/push", method = {RequestMethod.POST, RequestMethod.GET})
	public void push(@ModelAttribute UserVO userVO) throws IOException {
		System.out.println("»£√‚µ ");
		System.out.println(userVO.getRegID());
		
		//sqlSession.insert("regIdControlMapper.addUser", userVO.getRegid());
		
		new GcmSender().Push(userVO.getRegID()); //Gcm Push
	}
	
}
