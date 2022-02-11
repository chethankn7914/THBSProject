package com.train.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = true)
	private boolean logStatus = false;
	@Column(nullable = true)
	private boolean isAdmin = false;
	
/*	@ManyToMany(cascade=CascadeType.MERGE)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="id")})
    private List<Role> roles;
*/
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

/*	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		//this.roles = roles;
	}*/

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public boolean isLogStatus() {
		return logStatus;
	}

	public void setLogStatus(boolean logStatus) {
		this.logStatus = logStatus;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	

/*	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}*/

	@Override
	public String toString() {
		return "User [userId =" + userId + ", email=" + email + ", password=" + password + ", logStatus=" + logStatus
				+ ", isAdmin=" + isAdmin + "]";
	}
	
	

	



	

}
