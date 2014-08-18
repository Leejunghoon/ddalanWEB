package com.bit.ddalan.controller;

import java.beans.Encoder;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.omg.CORBA.NameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestScope;

import com.bit.ddalan.domain.UserVO;
import com.bit.ddalan.gcm.GcmSender;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	@Autowired
	private SqlSession sqlSession;

		
	
	@RequestMapping(value = "/push", method = {RequestMethod.POST, RequestMethod.GET})
	public void push(@ModelAttribute UserVO userVO) throws IOException {
		System.out.println("푸쉬 호출");
		
		String regId = sqlSession.selectOne("UserControlMapper.push",userVO);
		
		new GcmSender().Push(regId); //Gcm Push
	}
	
	@RequestMapping(value = "/addUser", method = {RequestMethod.POST, RequestMethod.GET})
	public void addUser(@ModelAttribute UserVO userVO) throws IOException {
		System.out.println("/addUser 호출");
		System.out.println(userVO);
		
		sqlSession.insert("UserControlMapper.addUser", userVO);
		
	
	}
	
	@RequestMapping(value = "/addFriend", method = {RequestMethod.POST, RequestMethod.GET})
	public void addFriend(@ModelAttribute UserVO userVO) throws IOException {
		
		
		
		System.out.println(userVO.getFriendsN());
		System.out.println(userVO.getFriendsP());
		System.out.println("/addFriend 호출");
		
		
	}
	
	
	
	
}
