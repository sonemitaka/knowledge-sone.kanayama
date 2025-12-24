package jp.co.sss.knowledge_sone.kanayama.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.knowledge_sone.kanayama.service.DeleteEmployeeService;
import jp.co.sss.knowledge_sone.kanayama.service.SearchForEmployeesByEmpIdService;

@Controller
public class DeleteController {

	@Autowired
	SearchForEmployeesByEmpIdService searchForEmployeesByEmpIdService;

	@Autowired
	DeleteEmployeeService deleteEmployeeService;

	/**
	 * 社員情報の削除内容確認画面を出力
	 *
	 * @param empId 社員ID
	 * @param model モデル
	 * @return 遷移先のビュー
	 * @throws ParseException 
	 */
	@RequestMapping(path = "/delete/check", method = RequestMethod.GET)
	public String checkDelete(Integer empId, Model model) {

		model.addAttribute("employee", searchForEmployeesByEmpIdService.execute(empId));

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
	public String completeDelete(Integer empId) {
		deleteEmployeeService.execute(empId);
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