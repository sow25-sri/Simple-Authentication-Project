package com.sap.Interface;

import com.sap.Bean.RegisterBean;

public interface DInterface {
	
	public int register(RegisterBean rb);
	public int login(String username, String password);
	
}
