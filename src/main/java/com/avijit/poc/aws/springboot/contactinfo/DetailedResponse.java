package com.avijit.poc.aws.springboot.contactinfo;

import java.net.InetAddress;
import java.util.List;

public class DetailedResponse {
	private String serverName;
	private List<Contact> contactList;
	
	public DetailedResponse() {
		try {
			serverName = InetAddress.getLocalHost().getHostName();
			if ((serverName == null) || (serverName.trim().length() == 0)) {
				serverName = InetAddress.getLocalHost().getHostAddress();
			}
			if ((serverName == null) || (serverName.trim().length() == 0)) {
				serverName = InetAddress.getLocalHost().getCanonicalHostName();
			}
		} catch (Exception ex) {
			serverName = "";
		}
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public String getServerName() {
		return serverName;
	}
}
