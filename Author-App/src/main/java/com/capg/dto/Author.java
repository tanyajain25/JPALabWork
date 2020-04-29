package com.capg.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Author")

public class Author implements Serializable
{
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
		@Column(name="Author_Id")
		private int authorId;
	
		@Column(name="Author_FirstName")
		private String authorFirstName;
		
		@Column(name="Author_MiddleName")
		private String authorMiddleName;
		
		@Column(name="Author_LastName")
		private String authorLastName;
	
		@Column(name="Author_PhoneNo")     
		private int authorPhoneNo;

		public Author(int authorId, String authorFirstName, String authorMiddleName, String authorLastName,
				int authorPhoneNo) {
			super();
			this.authorId = authorId;
			this.authorFirstName = authorFirstName;
			this.authorMiddleName = authorMiddleName;
			this.authorLastName = authorLastName;
			this.authorPhoneNo = authorPhoneNo;
		}

		public Author() {
			super();
		}

		public int getAuthorId() {
			return authorId;
		}

		public void setAuthorId(int authorId) {
			this.authorId = authorId;
		}

		public String getAuthorFirstName() {
			return authorFirstName;
		}

		public void setAuthorFirstName(String authorFirstName) {
			this.authorFirstName = authorFirstName;
		}

		public String getAuthorMiddleName() {
			return authorMiddleName;
		}

		public void setAuthorMiddleName(String authorMiddleName) {
			this.authorMiddleName = authorMiddleName;
		}

		public String getAuthorLastName() {
			return authorLastName;
		}

		public void setAuthorLastName(String authorLastName) {
			this.authorLastName = authorLastName;
		}

		public int getAuthorPhoneNo() {
			return authorPhoneNo;
		}

		public void setAuthorPhoneNo(int authorPhoneNo) {
			this.authorPhoneNo = authorPhoneNo;
		}
	
		

		

}
