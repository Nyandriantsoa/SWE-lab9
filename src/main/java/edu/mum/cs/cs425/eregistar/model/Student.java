package edu.mum.cs.cs425.eregistar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;


@Entity
public class Student {
	
	@Id @GeneratedValue
	private Long studentId;

	@NotNull @NotBlank @NotEmpty
	private String studentNumber;

	@NotNull @NotBlank @NotEmpty
	private String firstName; 

	private String middleName;

	@NotNull @NotBlank @NotEmpty
	private String lastName;

	private Float cgpa;

	@NotNull @PastOrPresent
	private Date enrollmentDate;

	@NotNull @NotBlank
	private Boolean isInternational;


	public Student() {
		super();
	}

	public Student(@NotNull @NotBlank @NotEmpty String studentNumber, @NotNull @NotBlank @NotEmpty String firstName,
			String middleName, @NotNull @NotBlank @NotEmpty String lastName, Float cgpa,
			@NotNull @PastOrPresent Date enrollmentDate, @NotNull @NotBlank Boolean isInternational) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.enrollmentDate = enrollmentDate;
		this.isInternational = isInternational;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public Boolean getIsInternational() {
		return isInternational;
	}

	public void setIsInternational(Boolean isInternational) {
		this.isInternational = isInternational;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, studentNumber=%s, firstName=%s, MiddleName=%s, lastName=%s, cgpa=%s, enrollmentDate=%s, isInternational=%s]",
				studentId, studentNumber, firstName, middleName, lastName, cgpa, enrollmentDate, isInternational);
	}
	
	

}
