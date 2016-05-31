package org.tahom.repository.model.impl;

import org.tahom.repository.model.User;

public class UserImpl extends User {

	private static final long serialVersionUID = 1L;

	private String confirmPassword;

	public UserImpl(User user) {
		super.setCity(user.getCity());
		super.setClub(user.getClub());
		super.setCountry(user.getCountry());
		super.setDateOfBirth(user.getDateOfBirth());
		super.setEmail(user.getEmail());
		super.setFinalStandings(user.getFinalStandings());
		super.setGender(user.getGender());
		super.setId(user.getId());
		super.setIthfId(user.getIthfId());
		super.setIthfTournaments(user.getIthfTournaments());
		super.setLogin(user.getLogin());
		super.setName(user.getName());
		super.setNameAscii(user.getNameAscii());
		super.setNickname(user.getNickname());
		super.setParticipants(user.getParticipants());
		super.setPassword(user.getPassword());
		super.setPhone(user.getPhone());
		super.setRole(user.getRole());
		super.setSurname(user.getSurname());
		super.setSurnameAscii(user.getSurnameAscii());
		super.setValidity(user.getValidity());
		super.setVerification(user.getVerification());
		super.setWorldRanking(user.getWorldRanking());
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
