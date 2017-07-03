package com.yin.beans;

public class MessageWriter {
	
	private IMessagConvertor messagConvertor;
	public void writeMessage(String message) {
		
		//messagConvertor = new PdfMessageConvertorImpl();
		messagConvertor = new HTMLMessageConvertorImpl();
		String cMessage = messagConvertor.convert(message);
		System.out.println(cMessage);
	}
}
