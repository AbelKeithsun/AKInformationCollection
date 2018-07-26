package club.ak.work.service;

import java.util.Date;

import club.ak.work.bean.MeasurementData;

public interface IMeasurementDataService {
	
	/**
	 * 将用户发送过来的资料写入数据库
	 * @param sqlData
	 * @return
	 */
	Integer insertData(MeasurementData sqlData);
	
	/**
	 * 根据时间批次查询相应的sql返回前端
	 * @param date
	 * @return
	 */
	MeasurementData selectByDate(Date date,Integer uid);

	/**
	 * 根据时间日期进行sql数据的更新
	 * @param msdata
	 * @return
	 */
	Integer updateData(MeasurementData msdata);
}
