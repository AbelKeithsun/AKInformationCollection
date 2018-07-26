package club.ak.work.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import club.ak.work.bean.MeasurementData;

public interface MeasurementDataMapper {
	
	/**
	 * 将前端接到的数据写入数据库
	 * @param sqlData
	 * @return
	 */
	Integer insertData(MeasurementData sqlData);
	
	/**
	 * 根据时间批次查询相应的sql返回前端
	 * @param date
	 * @return
	 */
	MeasurementData selectByDate(@Param("onlineDate") Date date,@Param("userId") Integer uid);

	/**
	 * 
	 * @param msdata
	 * @return
	 */
	Integer updateData(MeasurementData msdata);
}
