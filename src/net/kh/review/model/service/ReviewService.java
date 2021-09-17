package net.kh.review.model.service;

import net.kh.review.model.dao.ReviewDAO;

public class ReviewService {

private ReviewDAO rDao;
	
	public ReviewService() {
		rDao = new ReviewDAO();
	}
}
