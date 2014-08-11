package com.bit.ddalan.gcm;

import java.io.IOException;

import com.google.android.gcm.server.Constants;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;

public class GcmSender {

	public void Push(String id) throws IOException{
		
		Sender sender = new Sender("AIzaSyBdOt8hmu5dNvMj01Fie6rimvsaSnfgaio");  //구글 코드에서 발급받은 서버 키
		   Message msg = new Message.Builder().addData("title",new String("따란") ).build();  //데이터 추가
		                                                           
		   String regId =id;
		   
		   //푸시 전송. 파라미터는 푸시 내용, 보낼 단말의 id, 마지막은 잘 모르겠음 
		   Result result = sender.send(msg, regId, 5);
		   
		   //결과 처리
		   if(result.getMessageId() != null) {
		      //푸시 전송 성공
			   System.out.println("푸쉬 성공!!");
		   }
		   else {
		      String error = result.getErrorCodeName();   //에러 내용 받기

		      //에러 처리
		      if(Constants.ERROR_INTERNAL_SERVER_ERROR.equals(error)) {
		         //구글 푸시 서버 에러
		      }
		 
		   }
	}
}
