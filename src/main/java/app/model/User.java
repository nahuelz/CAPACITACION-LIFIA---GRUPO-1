package app.model;

import java.util.Collection;

public class User {

	private Integer id;
	private String name;
	private String username;
	private String email;
	private String password;
	private Void photo;
	private Void gender;
	private TypeOfUser type;
	private Adress adrees;
	private Collection<Comment> comments;
	private Collection<User> friends;

	public void addComment(Comment aComment) {
		comments.add(aComment);
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void addFriend(User aFriend) {
		friends.add(aFriend);
	}

	public void deleteFriend(User aFriend) {
		friends.remove(aFriend);
	}

	public Collection<User> getFriends() {
		return friends;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Void getPhoto() {
		return photo;
	}

	public void setPhoto(Void photo) {
		this.photo = photo;
	}

	public Void getGender() {
		return gender;
	}

	public void setGender(Void gender) {
		this.gender = gender;
	}

	public TypeOfUser getType() {
		return type;
	}

	public void setType(TypeOfUser type) {
		this.type = type;
	}

	public Adress getAdrees() {
		return adrees;
	}

	public void setAdrees(Adress adrees) {
		this.adrees = adrees;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
