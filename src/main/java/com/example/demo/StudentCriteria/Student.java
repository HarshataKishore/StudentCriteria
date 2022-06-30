package com.example.demo.StudentCriteria;

    import java.time.LocalDate;
	import java.util.Date;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	@Entity
	@Table(name = "stud")
	public class Student {
		@Id
		@GeneratedValue
		@Column(name = "Id")
	    private int id;
		
		@Column(name = "Name")
		private String name;
		
		@Column(name = "RollNumber")
		private String rollNumber;
		
		@Column(name = "Branch")
		private String branch;
		
		@Column(name = "DOJ")
		@Temporal(TemporalType.DATE)
		private Date dateOfJoining;
		
		@Column(name = "LocalDate")
		private LocalDate ldt;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(String rollNumber) {
			this.rollNumber = rollNumber;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public Date getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public LocalDate getLdt() {
			return ldt;
		}

		public void setLdt(LocalDate ldt) {
			this.ldt = ldt;
		}

		public Student(String name, String rollNumber, String branch, Date dateOfJoining, LocalDate ldt) {
			super();
			this.name = name;
			this.rollNumber = rollNumber;
			this.branch = branch;
			this.dateOfJoining = dateOfJoining;
			this.ldt = ldt;
	}
}
