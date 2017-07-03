package com.yin.beans;

public class HTMLMessageConvertorImpl implements IMessagConvertor {

	@Override
	public String convert(String message) {

		return "<html><body>" + message + "</body></html>";

	}

}
