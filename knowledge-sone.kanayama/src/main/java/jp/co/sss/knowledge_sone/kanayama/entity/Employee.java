package jp.co.sss.knowledge_sone.kanayama.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_emp_gen")
	@SequenceGenerator(name = "seq_emp_gen", sequenceName = "seq_emp", allocationSize = 1)
	private Integer empId;

	@Column
	private String empPass;

	@Column
	private String empName;

	@Column
	private Integer gender;

	@Column
	private Date birthday;

	@Column
	private Integer authority;

	@Column
	private String furigana;

	@Column
	private String hometown;

	@Column
	private Date joiningDay;

	@Column
	private String mailAddress;

	@Column
	private String nickName;

	@Column
	private String previousJob;

	@Column
	private String focusTime;

	@Column
	private String favoriteWords;

	@Column
	private String respect;

	@Column
	private String hobby;

	@Column
	private String speciality;

	@Column
	private String spendHolidays;

	@Column
	private String happyWords;

	@Column
	private String happyReceive;

	@Column
	private String sadWords;

	@Column
	private String sadReceive;

	@Column
	private String ambition;

	/**
	 * @return furigana
	 */
	public String getFurigana() {
		return furigana;
	}

	/**
	 * @param furigana セットする furigana
	 */
	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}

	/**
	 * @return hometown
	 */
	public String getHometown() {
		return hometown;
	}

	/**
	 * @param hometown セットする hometown
	 */
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	/**
	 * @return joiningDay
	 */
	public Date getJoiningDay() {
		return joiningDay;
	}

	/**
	 * @param joiningDay セットする joiningDay
	 */
	public void setJoiningDay(Date joiningDay) {
		this.joiningDay = joiningDay;
	}

	/**
	 * @return mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress セットする mailAddress
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName セットする nickName
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return previousJob
	 */
	public String getPreviousJob() {
		return previousJob;
	}

	/**
	 * @param previousJob セットする previousJob
	 */
	public void setPreviousJob(String previousJob) {
		this.previousJob = previousJob;
	}

	/**
	 * @return foucsTime
	 */
	public String getFocusTime() {
		return focusTime;
	}

	/**
	 * @param foucsTime セットする foucsTime
	 */
	public void setFocusTime(String focusTime) {
		this.focusTime = focusTime;
	}

	/**
	 * @return favoriteWords
	 */
	public String getFavoriteWords() {
		return favoriteWords;
	}

	/**
	 * @param favoriteWords セットする favoriteWords
	 */
	public void setFavoriteWords(String favoriteWords) {
		this.favoriteWords = favoriteWords;
	}

	/**
	 * @return respect
	 */
	public String getRespect() {
		return respect;
	}

	/**
	 * @param respect セットする respect
	 */
	public void setRespect(String respect) {
		this.respect = respect;
	}

	/**
	 * @return hobby
	 */
	public String getHobby() {
		return hobby;
	}

	/**
	 * @param hobby セットする hobby
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	/**
	 * @return speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality セットする speciality
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @return spendHolidays
	 */
	public String getSpendHolidays() {
		return spendHolidays;
	}

	/**
	 * @param spendHolidays セットする spendHolidays
	 */
	public void setSpendHolidays(String spendHolidays) {
		this.spendHolidays = spendHolidays;
	}

	/**
	 * @return happyWords
	 */
	public String getHappyWords() {
		return happyWords;
	}

	/**
	 * @param happyWords セットする happyWords
	 */
	public void setHappyWords(String happyWords) {
		this.happyWords = happyWords;
	}

	/**
	 * @return happyReceive
	 */
	public String getHappyReceive() {
		return happyReceive;
	}

	/**
	 * @param happyReceive セットする happyReceive
	 */
	public void setHappyReceive(String happyReceive) {
		this.happyReceive = happyReceive;
	}

	/**
	 * @return sadWords
	 */
	public String getSadWords() {
		return sadWords;
	}

	/**
	 * @param sadWords セットする sadWords
	 */
	public void setSadWords(String sadWords) {
		this.sadWords = sadWords;
	}

	/**
	 * @return sadReceive
	 */
	public String getSadReceive() {
		return sadReceive;
	}

	/**
	 * @param sadReceive セットする sadReceive
	 */
	public void setSadReceive(String sadReceive) {
		this.sadReceive = sadReceive;
	}

	/**
	 * @return ambition
	 */
	public String getAmbition() {
		return ambition;
	}

	/**
	 * @param ambition セットする ambition
	 */
	public void setAmbition(String ambition) {
		this.ambition = ambition;
	}

	@ManyToOne
	@JoinColumn(name = "dept_id", referencedColumnName = "deptId")
	private Department department;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getAuthority() {
		return authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
