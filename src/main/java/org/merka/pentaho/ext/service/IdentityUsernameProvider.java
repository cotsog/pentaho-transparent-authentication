package org.merka.pentaho.ext.service;

public class IdentityUsernameProvider implements UsernameProvider
{

	@Override
	public String getUsername(String externalApplicationName, String externalUsername)
	{
		return externalUsername;
	}

}
