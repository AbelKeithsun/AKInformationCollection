package club.ak.work.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import club.ak.work.bean.MeasurementData;
import club.ak.work.mapper.MeasurementDataMapper;
import club.ak.work.service.exc.DataWriteFailedException;

@Service("measurementDataService")
public class MeasurementDataServiceImpl implements IMeasurementDataService{
	
	@Resource(name="measurementDataMapper")
	private MeasurementDataMapper measurementDataMapper;
	
	public Integer insertData(MeasurementData data) {
		Integer resultNum = measurementDataMapper.insertData(data);
		if(resultNum>0) {
			System.out.println("数据写入成功");
			return resultNum;
		}else {
			throw new DataWriteFailedException("数据写入失败，请联系管理员");
		}
	}

	public MeasurementData selectByDate(Date date, Integer uid) {
		MeasurementData md = measurementDataMapper.selectByDate(date, uid);
		return md;
	}

	public Integer updateData(MeasurementData msdata) {
		Integer rn = measurementDataMapper.updateData(msdata);
		return null;
	}
}
