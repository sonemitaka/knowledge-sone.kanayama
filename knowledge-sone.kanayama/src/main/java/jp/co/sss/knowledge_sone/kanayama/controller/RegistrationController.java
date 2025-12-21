package jp.co.sss.knowledge_sone.kanayama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.knowledge_sone.kanayama.form.EmployeeForm;

@Controller
public class RegistrationController {

	/**
	 * 社員情報の登録内容入力画面を出力
	 *
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/regist/input", method = RequestMethod.GET)
	public String inputRegist(EmployeeForm employeeForm) {

		System.out.println("inputRegist:" + employeeForm);

		return "regist/regist_input";
	}

	/**
	 * 社員情報の登録確認画面を出力
	 *
	 * @param employeeForm
	 *            登録対象の社員情報
	 * @param model
	 *            モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/regist/check", method = RequestMethod.POST)
	public String checkRegist(EmployeeForm employeeForm) {

		System.out.println("checkRegist:" + employeeForm);

		return "regist/regist_check";
	}

	/**
	 * 変更内容入力画面に戻る
	 *
	 * @param employeeForm 変更対象の社員情報
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/regist/back", method = RequestMethod.POST)
	public String backInputRegist(EmployeeForm employeeForm) {

		System.out.println("backInputRegist:" + employeeForm);

		return "regist/regist_input";
	}

	/**
	 * 社員情報の登録完了画面を出力
	 *
	 * @param employeeForm
	 *            登録対象の社員情報
	 * @return リダイレクト：完了画面
	 */
	@RequestMapping(path = "/regist/complete", method = RequestMethod.POST)
	public String exeRegist(EmployeeForm employeeForm) {

		System.out.println("exeRegist:" + employeeForm);

		return "redirect:/regist/complete";
	}

	/**
	 * 完了画面表示
	 * 
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/regist/complete", method = RequestMethod.GET)
	public String completeRegist() {

		return "regist/regist_complete";
	}

}
