package com.TKA.SpringBoot_GURD.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Messege {
		
		private String name;
		@Id
		private String email;
		private String messege;
		public Messege() {
			super();
			
		}
		public Messege(String name, String email, String messege) {
			super();
			this.name = name;
			this.email = email;
			this.messege = messege;
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
		public String getMessege() {
			return messege;
		}
		public void setMessege(String messege) {
			this.messege = messege;
		}
		@Override
		public String toString() {
			return "Messege [name=" + name + ", email=" + email + ", messege=" + messege + "]";
		}
		
		
		
		
}
