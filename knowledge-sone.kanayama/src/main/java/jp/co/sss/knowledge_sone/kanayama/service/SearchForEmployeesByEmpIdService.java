package jp.co.sss.knowledge_sone.kanayama.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sss.knowledge_sone.kanayama.been.EmployeeBean;
import jp.co.sss.knowledge_sone.kanayama.entity.Employee;
import jp.co.sss.knowledge_sone.kanayama.repository.EmployeeRepository;
import jp.co.sss.knowledge_sone.kanayama.util.BeanManager;

/**
 * 従業員ID検索サービスクラス。
 * 指定された従業員IDを基に、該当する従業員情報を取得し、EmployeeBeanとして返却します。
 * データベースからの参照取得にはJPAのgetReferenceByIdメソッドを使用します。
 * 
 * @author SystemShared Co., Ltd.
 * @version 1.0
 * @since 1.0
 */
@Service
public class SearchForEmployeesByEmpIdService {

	/**
	 * 従業員データアクセス用リポジトリ。
	 * Spring DIによって自動注入されます。
	 */
	@Autowired
	private EmployeeRepository repository;

	/**
	 * 指定された従業員IDの従業員情報を取得します。
	 * 
	 * 従業員IDを基にデータベースから該当する従業員エンティティの参照を取得し、
	 * BeanManagerを使用してEmployeeBeanに変換して返却します。
	 * 
	 * @param empId 検索対象の従業員ID
	 * @return 該当する従業員のEmployeeBean
	 */
	public EmployeeBean execute(Integer empId) {

		Employee employee = repository.getReferenceById(empId);
		EmployeeBean employeeBean = BeanManager.copyEntityToBean(employee);

		return employeeBean;
	}

}