package com.bit.ddalan.controller;

import java.beans.Encoder;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.internal.matchers.SubstringMatcher;
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
		
		//+82 10-4811-0702 , 010-4811-0702
		
		
		
		if(!userVO.getPhone().substring(0, 3).equals("010")){
			String ch = userVO.getPhone().substring(0, 3).trim();
			String p1 = userVO.getPhone().replace(ch+" ","0").trim();
			String ph[] = p1.split("-");
			String phone = ph[0]+ph[1]+ph[2];
			
			String regId = sqlSession.selectOne("UserControlMapper.push",phone);
			new GcmSender().Push(regId);
		}else if (userVO.getPhone().indexOf("-") == 3){
			
			String ph[] = userVO.getPhone().split("-");
			String phone = ph[0]+ph[1]+ph[2];
			
			String regId = sqlSession.selectOne("UserControlMapper.push",phone);
			new GcmSender().Push(regId);
			
		}else{
			String regId = sqlSession.selectOne("UserControlMapper.push",userVO.getPhone());
			new GcmSender().Push(regId);
		}
		
	
	}
	
	@RequestMapping(value = "/addUser", method = {RequestMethod.POST, RequestMethod.GET})
	public void addUser(@ModelAttribute UserVO userVO) throws IOException {
		System.out.println("/addUser 호출");
		System.out.println(userVO);
		
		sqlSession.insert("UserControlMapper.addUser", userVO);
		
	
	}
	
	@RequestMapping(value = "/addFriend", method = {RequestMethod.POST, RequestMethod.GET})
	public void addFriend(@ModelAttribute UserVO userVO) throws IOException {
		
		
		
	
		String friendsN[] = userVO.getFriendsN().substring(1, userVO.getFriendsN().length() -1).split(", ");
		String friendsP[] = userVO.getFriendsP().substring(1, userVO.getFriendsP().length() -1).split(", ");
//		
//		JSONObject json = new JSONObject();
//		JSONArray jArray = new JSONArray();
//		
//		jArray.add(0, friendsN);
//		
//		json.put("fname", jArray);
//		
	
		
		System.out.println("/addFriend 호출");
		
		
	
		
		
	}
	
	
	
	
}
