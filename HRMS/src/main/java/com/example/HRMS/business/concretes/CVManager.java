package com.example.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HRMS.business.abstracts.CVService;
import com.example.HRMS.core.utilities.results.DataResult;
import com.example.HRMS.core.utilities.results.Result;
import com.example.HRMS.core.utilities.results.SuccessDataResult;
import com.example.HRMS.core.utilities.results.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.CVDao;
import com.example.HRMS.entities.concretes.CV;
import com.example.HRMS.entities.concretes.JobSekeer;


@Service
public class CVManager implements CVService {
	
	private CVDao cvDao;
	
	@Autowired
	public CVManager( CVDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public Result Add(CV cv) {
		cvDao.save(cv);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CV>> GetAll() {
		return new SuccessDataResult<List<CV>>(cvDao.findAll());
	}

	@Override
	public DataResult<List<CV>> findAllByJobSekeer(JobSekeer jobSekeer) {
		return new SuccessDataResult<List<CV>>(cvDao.findAllByJobSekeer(jobSekeer));
	}

	@Override
	public Result Update(CV cv) {
		cvDao.save(cv);
		return new SuccessResult();
	}
	
	


}
