package app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorColumn(name="user_type", 
discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Common")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	private Long id;
	private String name;
	private String username;
	private String email;
	private String password;
	private String gender;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private State userState;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<User> friends = new HashSet<>();
	
	@OneToOne
	@JoinColumn(name = "address_id")
    private Address address;
	
	
	public User(){
		
	}
	
	public void addFriend(User aFriend) {
		friends.add(aFriend);
	}

	public void deleteFriend(User aFriend) {
		friends.remove(aFriend);
	}

	public Set<User> getFriends() {
		return friends;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public State getType() {
		return userState;
	}

	public void setType(State userState) {
		this.userState = userState;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
