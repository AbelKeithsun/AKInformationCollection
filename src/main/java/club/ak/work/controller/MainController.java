package club.ak.work.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import club.ak.work.bean.MeasurementData;
import club.ak.work.bean.ResponseResult;
import club.ak.work.service.IMeasurementDataService;

@RequestMapping("/main")
@Controller
public class MainController extends BaseController{
	
	private Integer stateId;
	
	@Resource(name="measurementDataService")
	private IMeasurementDataService measurementDataService;
	
	@RequestMapping(value="/handle_sqlData.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult handleSqlData(@DateTimeFormat(pattern = "yyyy-MM-dd") Date onlineDate,String testCreateSql,String testCreateRollbackSql,
			String testAlterSql,String testAlterRollbackSql,
			String testUpdateSql,String testUpdateRollbackSql,
			String testInsertSql,String testInsertRollbackSql,
			String testDeleteSql,String testDeleteRollbackSql,
			String pdCreateSql,String pdCreateRollbackSql,
			String pdAlterSql,String pdAlterRollbackSql,
			String pdUpdateSql,String pdUpdateRollbackSql,
			String pdInsertSql,String pdInsertRollbackSql,
			String pdDeleteSql,String pdDeleteRollbackSql,String sqlBackFlag,HttpSession session) {
		String resultPage;
		ResponseResult rr = new ResponseResult();
		MeasurementData msdata = new MeasurementData(); 
		Date now = new Date();
		System.out.println(onlineDate);
		msdata.setOnlineDate(onlineDate);
		msdata.setTestCreateSql(testCreateSql);
		msdata.setTestCreateRollbackSql(testCreateRollbackSql);
		msdata.setTestAlterSql(testAlterSql);
		msdata.setTestAlterRollbackSql(testAlterRollbackSql);
		msdata.setTestUpdateSql(testUpdateSql);
		msdata.setTestUpdateRollbackSql(testUpdateRollbackSql);
		msdata.setTestInsertSql(testInsertSql);
		msdata.setTestInsertRollbackSql(testInsertRollbackSql);
		msdata.setPdCreateSql(pdCreateSql);
		msdata.setPdCreateRollbackSql(pdCreateRollbackSql);
		msdata.setPdAlterSql(pdAlterSql);
		msdata.setPdAlterRollbackSql(pdAlterRollbackSql);
		msdata.setPdUpdateSql(pdUpdateSql);
		msdata.setPdUpdateRollbackSql(pdUpdateRollbackSql);
		msdata.setPdInsertSql(pdInsertSql);
		msdata.setPdInsertRollbackSql(pdInsertRollbackSql);
		msdata.setPdDeleteSql(pdDeleteSql);
		msdata.setPdDeleteRollbackSql(pdDeleteRollbackSql);
		System.out.println(msdata.toString());
//		Integer id = 0001;
//		msData.setId(id);
		Integer userId = getUidFromSession(session);
		if(!(userId==null)) {
			msdata.setUserId(userId);
		}else {
			msdata.setUserId(99999);
		}
		Integer resultNum = null;
		if("1".equals(sqlBackFlag)) {//如果等于1进行数据更新而不是数据插入
			msdata.setId(stateId);
			resultNum = measurementDataService.updateData(msdata);
			System.out.println(resultNum);
		}else {
			resultNum = measurementDataService.insertData(msdata);
		}
		if(resultNum==null||resultNum>0) {
			rr.setState(1);
			rr.setMessage("恭喜你，sql脚本输入成功");
		}else {
			rr.setState(-1);
			rr.setMessage("抱歉信息提交失败，请重新填写");
		}
		return rr;
	}
	
	@RequestMapping(value="/index.do")
	public String sqlInfoImport() {
		return "index";
	}
	
	@RequestMapping(value="/test.do",method=RequestMethod.POST)
	public String test(String testCreateSql) {
		return "submitResultSuccess";
	}
	
	/**
	 * 数据回显
	 * @param date
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/dataBack.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult dataBack(@DateTimeFormat(pattern = "yyyy-MM-dd")Date date,HttpSession session) {
		ResponseResult rr = new ResponseResult();
		Integer uid = getUidFromSession(session);
		if(uid==null) {
			uid=99999;
		}
		MeasurementData md = measurementDataService.selectByDate(date, uid);
		Map<String, Object> map = new HashMap<String, Object>();
		if(null!=md) {
			stateId = md.getId();//进行数据更新使用
			map.put("result", md);
			List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
			list.add(map);
			rr.setDatas(list);
			rr.setState(1);
			rr.setMessage("数据回显装载成功");
		}else {
			rr.setMessage("没有需要回显的数据");
			rr.setState(2);
		}
		return rr;
	}
	
	@RequestMapping(value="/login.do")
	public String loginShow() {
		
		return "login";
	}
}
