package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;

public interface ContentCatgoryService {
	
	public List<EasyUITreeNode> getContentCatList(Long parentId);
		
}
