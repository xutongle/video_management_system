package com.adp.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.adp.model.AuthorizationList;
import com.adp.model.User;

public interface UserManager {

	public String login(HttpServletRequest request);
	public String signUp(HttpServletRequest request);
	public User getSession(HttpServletRequest request, String sessionKey);
	public User updateSession(HttpServletRequest request, User user);//???泛型
	public User edit_personalProfile(HttpServletRequest request);
	public User getUser(int userID);
	public String existUser(String userName);
	public User updateUser(User user);
	public User elevationPrivilege2ProUser_apply(HttpServletRequest request);
	public List<AuthorizationList> getAuthListByApplyAuthUser(User user);
	public List<AuthorizationList> getAllAuthList();
	public void elevationPrivilege2ProUser_process_agree(HttpServletRequest request, int authListID , int applyAuthUserID);
	public void elevationPrivilege2ProUser_process_deny(HttpServletRequest request, int authListID);
	public List<AuthorizationList> searchProcessedAuthListByApplyAuthUserID(int applyAuthUserID);
	
	
}
