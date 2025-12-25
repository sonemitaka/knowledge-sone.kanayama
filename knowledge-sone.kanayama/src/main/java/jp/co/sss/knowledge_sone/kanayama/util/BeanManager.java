package jp.co.sss.knowledge_sone.kanayama.util;

import java.util.ArrayList;
import java.util.List;

import jp.co.sss.knowledge_sone.kanayama.been.EmployeeBean;
import jp.co.sss.knowledge_sone.kanayama.entity.Department;
import jp.co.sss.knowledge_sone.kanayama.entity.Employee;
import jp.co.sss.knowledge_sone.kanayama.form.EmployeeForm;

public class BeanManager {

	/**
	 * JavaBeans(EmployeeBean)の各フィールドの値をFormクラスにコピー
	 * 
	 * @param bean JavaBeans
	 * @return Formクラス
	 */
	public static EmployeeForm copyBeanToForm(EmployeeBean bean) {

		EmployeeForm form = new EmployeeForm();

		form.setEmpId(bean.getEmpId());
		form.setEmpPass(bean.getEmpPass());
		form.setEmpName(bean.getEmpName());
		form.setFurigana(bean.getFurigana());
		form.setGender(bean.getGender());
		form.setBirthday(bean.getBirthday());
		form.setAuthority(bean.getAuthority());
		form.setHometown(bean.getHometown());
		form.setJoiningDay(bean.getJoiningDay());
		form.setMailAddress(bean.getMailAddress());
		form.setNickName(bean.getNickName());
		form.setPreviousJob(bean.getPreviousJob());
		form.setFocusTime(bean.getFocusTime());
		form.setFavoriteWords(bean.getFavoriteWords());
		form.setRespect(bean.getRespect());
		form.setHobby(bean.getHobby());
		form.setSpeciality(bean.getSpeciality());
		form.setSpendHolidays(bean.getSpendHolidays());
		form.setHappyReceive(bean.getHappyReceive());
		form.setHappyWords(bean.getHappyWords());
		form.setSadReceive(bean.getSadReceive());
		form.setSadWords(bean.getSadWords());
		form.setAmbition(bean.getAmbition());
		form.setDeptId(bean.getDeptId());

		return form;
	}

	/**
	 * EmployeeForm -> EmployeeBean コピー
	 * 
	 * @param form
	 * @return EmployeeBean
	 */
	public static EmployeeBean copyFormToBean(EmployeeForm form) {

		EmployeeBean employeeBean = new EmployeeBean();

		employeeBean.setEmpId(form.getEmpId());
		employeeBean.setEmpPass(form.getEmpPass());
		employeeBean.setEmpName(form.getEmpName());
		employeeBean.setFurigana(form.getFurigana());
		employeeBean.setGender(form.getGender());

		//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//		Date formatDate = null;
		//		Date formatDate2 = null;
		//		try {
		//			formatDate = sdf.parse(sdf.format(form.getBirthday()));
		//			formatDate2 = sdf.parse(sdf.format(form.getJoiningDay()));
		//		} catch (ParseException e) {
		//			e.printStackTrace();
		//		}
		//		employeeBean.setBirthday(formatDate);
		employeeBean.setBirthday(form.getBirthday());
		employeeBean.setJoiningDay(form.getJoiningDay());
		employeeBean.setAuthority(form.getAuthority());
		employeeBean.setHometown(form.getHometown());
		//		employeeBean.setJoiningDay(formatDate2);
		employeeBean.setMailAddress(form.getMailAddress());
		employeeBean.setNickName(form.getNickName());
		employeeBean.setPreviousJob(form.getPreviousJob());
		employeeBean.setFocusTime(form.getFocusTime());
		employeeBean.setFavoriteWords(form.getFavoriteWords());
		employeeBean.setRespect(form.getRespect());
		employeeBean.setHobby(form.getHobby());
		employeeBean.setSpeciality(form.getSpeciality());
		employeeBean.setSpendHolidays(form.getSpendHolidays());
		employeeBean.setHappyWords(form.getHappyWords());
		employeeBean.setHappyReceive(form.getHappyReceive());
		employeeBean.setSadWords(form.getSadWords());
		employeeBean.setSadReceive(form.getSadReceive());
		employeeBean.setAmbition(form.getAmbition());
		employeeBean.setDeptId(form.getDeptId());

		String deptName = getDeptName(form.getDeptId());

		employeeBean.setDeptName(deptName);

		return employeeBean;

	}

	/**
	 * EmployeeForm -> Employee コピー
	 * 
	 * @param form
	 * @return Employee
	 */
	public static Employee copyFormToEntity(EmployeeForm form) {

		Employee employee = new Employee();

		employee.setEmpId(form.getEmpId());
		employee.setEmpPass(form.getEmpPass());
		employee.setEmpName(form.getEmpName());
		employee.setFurigana(form.getFurigana());
		employee.setGender(form.getGender());

		//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//		Date formatDate = null;
		//		Date formatDate2 = null;
		//		try {
		//			formatDate = sdf.parse(sdf.format(form.getBirthday()));
		//			formatDate2 = sdf.parse(sdf.format(form.getJoiningDay()));
		//		} catch (ParseException e) {
		//			e.printStackTrace();
		//		}
		//		employee.setBirthday(formatDate);
		employee.setBirthday(form.getBirthday());
		employee.setJoiningDay(form.getJoiningDay());
		employee.setAuthority(form.getAuthority());
		employee.setHometown(form.getHometown());
		//		employee.setJoiningDay(formatDate2);
		employee.setMailAddress(form.getMailAddress());
		employee.setNickName(form.getNickName());
		employee.setPreviousJob(form.getPreviousJob());
		employee.setFocusTime(form.getFocusTime());
		employee.setFavoriteWords(form.getFavoriteWords());
		employee.setRespect(form.getRespect());
		employee.setHobby(form.getHobby());
		employee.setSpeciality(form.getSpeciality());
		employee.setSpendHolidays(form.getSpendHolidays());
		employee.setHappyWords(form.getHappyWords());
		employee.setHappyReceive(form.getHappyReceive());
		employee.setSadWords(form.getSadWords());
		employee.setSadReceive(form.getSadReceive());
		employee.setAmbition(form.getAmbition());

		Department department = new Department();
		department.setDeptId(form.getDeptId());
		employee.setDepartment(department);

		return employee;

	}

	/**
	 * @param deptId
	 * @return deptName
	 */
	private static String getDeptName(Integer deptId) {

		String deptName = null;

		switch (deptId) {
		case 1:
			deptName = "マネージャー";
			break;
		case 2:
			deptName = "教育事業部";

			break;
		case 3:
			deptName = "開発事業部";

			break;

		default:
			break;
		}

		return deptName;
	}

	/**
	 * {@codeList<Employee> -> List<EmployeeBean>} 
	 * 
	 * @param empList
	 * @return EmployeeBeanリスト
	 */
	public static List<EmployeeBean> copyEntityListToBeanList(List<Employee> empList) {

		List<EmployeeBean> tempEmployeeBeans = new ArrayList<EmployeeBean>();

		for (Employee employee : empList) {

			EmployeeBean employeeBean = new EmployeeBean();

			employeeBean.setEmpId(employee.getEmpId());
			employeeBean.setEmpPass(employee.getEmpPass());
			employeeBean.setEmpName(employee.getEmpName());
			employeeBean.setFurigana(employee.getFurigana());
			employeeBean.setGender(employee.getGender());
			employeeBean.setBirthday(employee.getBirthday());
			employeeBean.setAuthority(employee.getAuthority());
			employeeBean.setHometown(employee.getHometown());
			employeeBean.setJoiningDay(employee.getJoiningDay());
			employeeBean.setMailAddress(employee.getMailAddress());
			employeeBean.setNickName(employee.getNickName());
			employeeBean.setPreviousJob(employee.getPreviousJob());
			employeeBean.setFocusTime(employee.getFocusTime());
			employeeBean.setFavoriteWords(employee.getFavoriteWords());
			employeeBean.setRespect(employee.getRespect());
			employeeBean.setHobby(employee.getHobby());
			employeeBean.setSpeciality(employee.getSpeciality());
			employeeBean.setSpendHolidays(employee.getSpendHolidays());
			employeeBean.setHappyWords(employee.getHappyWords());
			employeeBean.setHappyReceive(employee.getHappyReceive());
			employeeBean.setSadReceive(employee.getSadReceive());
			employeeBean.setSadWords(employee.getSadWords());
			employeeBean.setAmbition(employee.getAmbition());
			employeeBean.setDeptId(employee.getDepartment().getDeptId());

			tempEmployeeBeans.add(employeeBean);

		}

		return tempEmployeeBeans;
	}

	/**
	 * EmployeeForm -> EmployeeBean コピー
	 * 
	 * @param employee
	 * @return
	 */
	public static EmployeeBean copyEntityToBean(Employee employee) {

		EmployeeBean employeeBean = new EmployeeBean();

		employeeBean.setEmpId(employee.getEmpId());
		employeeBean.setEmpPass(employee.getEmpPass());
		employeeBean.setEmpName(employee.getEmpName());
		employeeBean.setFurigana(employee.getFurigana());
		employeeBean.setGender(employee.getGender());
		employeeBean.setBirthday(employee.getBirthday());
		employeeBean.setAuthority(employee.getAuthority());
		employeeBean.setHometown(employee.getHometown());
		employeeBean.setJoiningDay(employee.getJoiningDay());
		employeeBean.setMailAddress(employee.getMailAddress());
		employeeBean.setNickName(employee.getNickName());
		employeeBean.setPreviousJob(employee.getPreviousJob());
		employeeBean.setFocusTime(employee.getFocusTime());
		employeeBean.setFavoriteWords(employee.getFavoriteWords());
		employeeBean.setRespect(employee.getRespect());
		employeeBean.setHobby(employee.getHobby());
		employeeBean.setSpeciality(employee.getSpeciality());
		employeeBean.setSpendHolidays(employee.getSpendHolidays());
		employeeBean.setHappyWords(employee.getHappyWords());
		employeeBean.setHappyReceive(employee.getHappyReceive());
		employeeBean.setSadReceive(employee.getSadReceive());
		employeeBean.setSadWords(employee.getSadWords());
		employeeBean.setAmbition(employee.getAmbition());
		employeeBean.setDeptId(employee.getDepartment().getDeptId());

		return employeeBean;
	}

}
