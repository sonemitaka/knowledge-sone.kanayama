package jp.co.sss.knowledge_sone.kanayama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {

	/**
	 * 社員情報を全件検索した結果を出力
	 *
	 * @param model モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String findAll() {

		return "list/list";
	}

	/**
	 * 社員情報を社員名検索した結果を出力
	 *
	 * @param empName 検索対象の社員名
	 * @param model モデル
	 * @return 遷移先のビュー
	 */
	@RequestMapping(path = "/list/empName", method = RequestMethod.GET)
	public String findByEmpName(String empName) {
		System.out.println(empName);

		return "list/list";
	}

	/**
	 * 社員情報を部署ID検索した結果を出力
	 *
	 * @param deptId 検索対象の部署ID
	 * @param model モデル
	 * @return 選先のビュー
	 */
	@RequestMapping(path = "/list/deptId", method = RequestMethod.GET)
	public String findByDeptId(Integer deptId) {

		System.out.println(deptId);
		return "list/list";
	}
}
