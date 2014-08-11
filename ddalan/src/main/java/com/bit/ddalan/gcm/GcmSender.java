package com.bit.ddalan.gcm;

import java.io.IOException;

import com.google.android.gcm.server.Constants;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;

public class GcmSender {

	public void Push(String id) throws IOException{
		
		Sender sender = new Sender("AIzaSyBdOt8hmu5dNvMj01Fie6rimvsaSnfgaio");  //���� �ڵ忡�� �߱޹��� ���� Ű
		   Message msg = new Message.Builder().addData("title",new String("����") ).build();  //������ �߰�
		                                                           
		   String regId =id;
		   
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
