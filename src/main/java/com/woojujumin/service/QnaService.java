package com.woojujumin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woojujumin.dao.QnaDao;

@Service
@Transactional
public class QnaService {
	@Autowired
	QnaDao dao;

}
