package com.kalyan.album.practice.album.response;

import com.kalyan.album.practice.beans.UserDetails;

public class UserResponse {
	private UserDetails userInformation;

	private AlbumResponse albumResponse;

	public UserDetails getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserDetails userInformation) {
		this.userInformation = userInformation;
	}

	public AlbumResponse getAlbumResponse() {
		return albumResponse;
	}

	public void setAlbumResponse(AlbumResponse albumResponse) {
		this.albumResponse = albumResponse;
	}

}
