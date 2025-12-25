package jp.co.sss.knowledge_sone.kanayama.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeForm {
	/** 従業員ID */
	private Integer empId;

	/** 従業員パスワード */
	private String empPass;

	/** 従業員名 */
	private String empName;

	/** フリガナ*/
	private String furigana;

	/** 性別（1:男性、2:女性） */
	private Integer gender;

	/** 誕生日 */
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;

	/** 権限レベル */
	private Integer authority;

	/**出身地 */
	private String hometown;

	/** 入社日 */
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date joiningDay;

	/**メールアドレス */
	private String mailAddress;

	/**ニックネーム*/
	private String nickName;

	/**仕事経験*/
	private String previousJob;

	/**仕事のはかどる時間*/
	private String foucsTime;

	/**好きな言葉*/
	private String favoriteWords;

	/**リスペクトしている人*/
	private String respect;

	/**趣味*/
	private String hobby;

	/**特技*/
	private String speciality;

	/**休日すること*/
	private String spendHolidays;

	/**言われてうれしい言葉*/
	private String happyWords;

	/**やられてうれしいこと*/
	private String happyReceive;

	/**言われたらいやなこと*/
	private String sadWords;

	/**やられたらいやなこと*/
	private String sadReceive;

	/**将来の野望*/
	private String ambition;

	/** 部署ID */
	private Integer deptId;

	/** 部署名 */
	private String deptName;

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
	public String getFoucsTime() {
		return foucsTime;
	}

	/**
	 * @param foucsTime セットする foucsTime
	 */
	public void setFoucsTime(String foucsTime) {
		this.foucsTime = foucsTime;
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

	/**
	 * @return deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName セットする deptName
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * 社員IDの取得
	 *
	 * @return 社員ID
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * 社員IDのセット
	 *
	 * @param empId
	 *            社員ID
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * パスワードの取得
	 *
	 * @return パスワード
	 */
	public String getEmpPass() {
		return empPass;
	}

	/**
	 * パスワードのセット
	 *
	 * @param empPass
	 *            パスワード
	 */
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	/**
	 * 社員名の取得
	 *
	 * @return 社員名
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * 社員名のセット
	 *
	 * @param empName
	 *            社員名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 性別の取得
	 *
	 * @return 性別
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 性別のセット
	 *
	 * @param gender
	 *            性別
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * 生年月日の取得
	 *
	 * @return 生年月日
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 生年月日のセット
	 *
	 * @param birthday
	 *            生年月日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 権限の取得
	 *
	 * @return 権限
	 */
	public Integer getAuthority() {
		return authority;
	}

	/**
	 * 権限のセット
	 *
	 * @param authority
	 *            権限
	 */
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

	/**
	 * 部署IDの取得
	 *
	 * @return 部署ID
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * 部署IDのセット
	 *
	 * @param deptId
	 *            部署ID
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
}
