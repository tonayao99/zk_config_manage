/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.web.service;

import java.util.HashMap;

import com.web.service.pojo.Product;

public interface ProductRepository {
	Product selectProductById(Long id);
	void reduceNum(HashMap<String, Integer> hm);
}
