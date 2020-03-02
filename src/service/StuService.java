package service;

import java.util.List;

import dao.StuDao;
import entity.Students;

public class StuService {
	private StuDao sd=new StuDao();
	public List<Students> showInfo() {
		List<Students> list=sd.showInfo();
		if(list!=null) {
			return list;
		}
		else {
			return null;
		}
	}

}
