package jp.co.sss.knowledge_sone.kanayama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteController {

	/**
	 * 社員情報の削除内容確認画面を出力
	 *
	 * @param empId 社員ID
	 * @param model モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/delete/check", method = RequestMethod.GET)
	public String checkDelete(String empId) {

		System.out.println("checkDelete:" + empId);

		return "delete/delete_check";
	}

	/**
	 * 社員情報の削除
	 *
	 * @param empId 社員ID
	 * @param model モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/delete/complete", method = RequestMethod.POST)
	public String exeDelete(String empId) {

		System.out.println("exeDelete:" + empId);

		return "redirect:/delete/complete";
	}

	/**
	 * 完了画面表示
	 * 
	 * @return 遷移先ビュー
	 */
	@RequestMapping(path = "/delete/complete", method = RequestMethod.GET)
	public String completeDelete() {
		return "delete/delete_complete";
	}

}
