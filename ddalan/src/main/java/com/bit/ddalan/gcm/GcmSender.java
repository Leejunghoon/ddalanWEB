package com.bit.ddalan.gcm;

import java.io.IOException;

import com.google.android.gcm.server.Constants;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;

public class GcmSender {

	public void Push() throws IOException{
		
		Sender sender = new Sender("AIzaSyBdOt8hmu5dNvMj01Fie6rimvsaSnfgaio");  //���� �ڵ忡�� �߱޹��� ���� Ű
		   Message msg = new Message.Builder().addData("title",new String("����") ).build();  //������ �߰�
		                                                           
		   String regId ="APA91bEgsNKxixxTUJ-LxAMPnBF7i7tvAT3ORKD3WlpQFRpBDz28HdZNXXA0y_buPPB10BSA8CvRGIKXt8n660O7FzqnepUX-32k1p8jBhw35ft40EQg-fdrKhusq4yypG8zFmHZvM8Sn3Ul0-jlPcYBbjWcC84H-g";
		   				  
		   //Ǫ�� ����. �Ķ���ʹ� Ǫ�� ����, ���� �ܸ��� id, �������� �� �𸣰��� 
		   Result result = sender.send(msg, regId, 5);
		   
		   //��� ó��
		   if(result.getMessageId() != null) {
		      //Ǫ�� ���� ����
			   System.out.println("Ǫ�� ����!!");
		   }
		   else {
		      String error = result.getErrorCodeName();   //���� ���� �ޱ�

		      //���� ó��
		      if(Constants.ERROR_INTERNAL_SERVER_ERROR.equals(error)) {
		         //���� Ǫ�� ���� ����
		      }
		 
		   }
	}
}
