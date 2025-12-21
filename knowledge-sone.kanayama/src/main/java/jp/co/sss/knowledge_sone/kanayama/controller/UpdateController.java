package jp.co.sss.knowledge_sone.kanayama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.knowledge_sone.kanayama.form.EmployeeForm;

@Controller
public class UpdateController {

	/**
	 * 社員情報の変更内容入力画面を出力
	 *
	 * @param empId
	 *            社員ID
	 * @param model
	 *            モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/update/input", method = RequestMethod.GET)
	public String inputUpdate(String empId, EmployeeForm employeeForm) {

		System.out.println("inputUpdate:" + empId);
		System.out.println("inputUpdate:" + employeeForm);

		return "update/update_input";
	}

	/**
	 * 社員情報の変更確認画面を出力
	 *
	 * @param employeeForm
	 *            変更対象の社員情報
	 * @param model
	 *            モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/update/check", method = RequestMethod.POST)
	public String checkUpdate(EmployeeForm employeeForm) {

		System.out.println("checkUpdate:" + employeeForm);

		return "update/update_check";
	}

	/**
	 * 変更内容入力画面に戻る
	 *
	 * @param employeeForm 変更対象の社員情報
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/update/back", method = RequestMethod.POST)
	public String backInputUpdate(EmployeeForm employeeForm) {

		System.out.println("checkUpdate:" + employeeForm);

		return "update/update_input";
	}

	/**
	 * 社員情報の変更
	 *
	 * @param employeeForm
	 *            変更対象の社員情報
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/update/complete", method = RequestMethod.POST)
	public String exeUpdate(EmployeeForm employeeForm) {

		System.out.println("exeUpdate:" + employeeForm);

		return "redirect:/update/complete";
	}

	/**
	 * 完了画面の表示
	 * 
	 * @return 遷移先ビュー
	 */
	@RequestMapping(path = "/update/complete", method = RequestMethod.GET)
	public String completeUpdate() {
		return "update/update_complete";
	}

}
