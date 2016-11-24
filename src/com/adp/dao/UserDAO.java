package com.adp.dao;

import java.util.List;

import com.adp.model.AuthorizationList;
import com.adp.model.Role;
import com.adp.model.User;
import com.adp.model.Video;
import com.adp.model.VideoCategory;

public interface UserDAO {
	public void addUser(User user);
	public User getUserByEmail(String email);
	public User getUserByID(int userID);
	public Role findRole(int roleID);
	public AuthorizationList findAuthList(int authListID);
	public User updateUser(User user);
	public String existUser(String userName);
	public User updateUserRole(User user);
	public AuthorizationList insertAuthorizationList(User applyAuthUser, Role role, String applyDateTime);
	public void updateAuthorizationList(int authListID, User giveAuthUser, String authStatus, String processDateTime);
	public List<AuthorizationList> getAuthListByApplyAuthUser(User applyAuthUser);
	public List<AuthorizationList> getAllAuthList();
	public List<AuthorizationList> getProcessingAuthList();
	public List<AuthorizationList> getProcessedAuthList();
	public VideoCategory getVideoCategoryByVideoCategoryName(String videoCategoryName);
	public void insertVideo(Video video);
	public List<AuthorizationList> searchProcessedAuthListByMultiParam(String applyUserNickName , String applyDateTimeStart , 
			String applyDateTimeEnd ,String processDateTimeStart ,String  processDateTimeEnd ,String processResult);
}
