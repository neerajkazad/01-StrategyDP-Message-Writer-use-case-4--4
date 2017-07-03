package com.yin.beans;

public class PdfMessageConvertorImpl implements IMessagConvertor {

	@Override
	public String convert(String message) {

		return "<pdf>" + message + "</pdf>";
	}

}
