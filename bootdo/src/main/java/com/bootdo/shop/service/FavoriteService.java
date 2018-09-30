package com.bootdo.shop.service;

import com.bootdo.common.utils.Query;
import com.bootdo.shop.domain.FavoriteDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-21 11:21:45
 */
public interface FavoriteService {
	
	FavoriteDO get(Long id);
	
	List<FavoriteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FavoriteDO favorite);
	
	int update(FavoriteDO favorite);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	FavoriteDO selectOne(Map<String, Object> params);

	List<FavoriteDO> userFavorite(Query query);

	List<FavoriteDO> userTopicFavorite(Query query);
}
