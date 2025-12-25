package jp.co.sss.knowledge_sone.kanayama.been;

import java.util.Date;

/**
 * 従業員情報を管理するJavaBeanクラス。
 * 従業員の基本情報（ID、パスワード、名前、性別、住所、誕生日、権限、部署情報）を保持します。
 * 
 * @author システム開発チーム
 * @version 1.0
 * @since 1.0
 */
public class EmployeeBean {

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
	private Date birthday;

	/** 権限レベル */
	private Integer authority;

	/**出身地 */
	private String hometown;

	/** 入社日 */
	private Date joiningDay;

	/**メールアドレス */
	private String mailAddress;

	/**ニックネーム*/
	private String nickName;

	/**仕事経験*/
	private String previousJob;

	/**仕事のはかどる時間*/
	private String focusTime;

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
	 * デフォルトコンストラクタ。
	 * 全てのフィールドがnullまたはデフォルト値で初期化されます。
	 */
	public EmployeeBean() {
	}

	/**
	 * 全てのフィールドを指定するコンストラクタ。
	 * 部署IDに基づいて部署名が自動的に設定されます。
	 * 
	 * @param empId 従業員ID
	 * @param empPass 従業員パスワード
	 * @param empName 従業員名
	 * @param gender 性別
	 * @param address 住所
	 * @param birthday 誕生日
	 * @param authority 権限レベル
	 * @param deptId 部署ID（1:営業部、2:経理部、3:総務部）
	 */
	public EmployeeBean(Integer empId, String empPass, String empName, String furigana, Integer gender,
			Date birthday,
			Integer authority, String hometown, Date joiningDay, String mailAddress, String nickName,
			String previousJob, String focusTime,
			String favoriteWords, String respect, String hobby, String speciality, String spendHolidays,
			String happyWords, String happyReceive,
			String sadWords, String sadReceive, String ambition, Integer deptId) {
		this.empId = empId;
		this.empPass = empPass;
		this.empName = empName;
		this.furigana = furigana;
		this.gender = gender;
		this.birthday = birthday;
		this.authority = authority;
		this.hometown = hometown;
		this.joiningDay = joiningDay;
		this.mailAddress = mailAddress;
		this.nickName = nickName;
		this.previousJob = previousJob;
		this.focusTime = focusTime;
		this.favoriteWords = favoriteWords;
		this.respect = respect;
		this.hobby = hobby;
		this.speciality = speciality;
		this.spendHolidays = spendHolidays;
		this.happyReceive = happyReceive;
		this.happyWords = happyWords;
		this.sadReceive = sadReceive;
		this.sadWords = sadWords;
		this.ambition = ambition;
		this.deptId = deptId;

		switch (deptId) {
		case 1:
			this.deptName = "マネージャー";
			break;
		case 2:
			this.deptName = "教育事業部";
			break;
		case 3:
			this.deptName = "開発事業部";

			break;

		default:
			break;
		}

	}

	/**
	 * 従業員IDを取得します。
	 * 
	 * @return 従業員ID
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * 従業員IDを設定します。
	 * 
	 * @param empId 従業員ID
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * 従業員パスワードを取得します。
	 * 
	 * @return 従業員パスワード
	 */
	public String getEmpPass() {
		return empPass;
	}

	/**
	 * 従業員パスワードを設定します。
	 * 
	 * @param empPass 従業員パスワード
	 */
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	/**
	 * 従業員名を取得します。
	 * 
	 * @return 従業員名
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * 従業員名を設定します。
	 * 
	 * @param empName 従業員名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * 性別を取得します。
	 * 
	 * @return 性別
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 性別を設定します。
	 * 
	 * @param gender 性別
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * 誕生日を取得します。
	 * 
	 * @return 誕生日
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 誕生日を設定します。
	 * 
	 * @param birthday 誕生日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * 権限レベルを取得します。
	 * 
	 * @return 権限レベル
	 */
	public Integer getAuthority() {
		return authority;
	}

	/**
	 * 権限レベルを設定します。
	 * 
	 * @param authority 権限レベル
	 */
	public void setAuthority(Integer authority) {
		this.authority = authority;

	}

	/**
	 * 部署IDを取得します。
	 * 
	 * @return 部署ID
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * 部署IDを設定します。
	 * 部署IDに基づいて部署名も自動的に設定されます。
	 * 
	 * @param deptId 部署ID（1:営業部、2:経理部、3:総務部）
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;

		switch (deptId) {
		case 1:
			this.deptName = "マネージャー";
			break;
		case 2:
			this.deptName = "教育事業部";

			break;
		case 3:
			this.deptName = "開発事業部";

			break;

		default:
			break;
		}

	}

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
	 * @return focusTime
	 */
	public String getFocusTime() {
		return focusTime;
	}

	/**
	 * @param focusTime セットする focusTime
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

	/**
	 * 部署名を取得します。
	 * 
	 * @return 部署名
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * 部署名を設定します。
	 * 
	 * @param deptName 部署名
	 */
	public void setDeptName(String deptName) {

		this.deptName = deptName;
	}

}